package br.com.Avaliacao2LP1.dao;

import br.com.Avaliacao2LP1.dao.ConexaoDAO;
import java.sql.*;
import br.com.Avaliacao2LP1.dto.ClienteDTO;

public class ClienteDAO {

    private ResultSet rs = null;
    private Statement stmt = null;

    public ClienteDAO() {

    }

    public boolean inserirCliente(ClienteDTO clienteDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "Insert into cliente(nome, logradouro, numero, "
                    + "bairro,cidade,estado,cep,cpf)values("
                    + "'" + clienteDTO.getNome() + "', "
                    + "'" + clienteDTO.getLogradouro() + "', "
                    + clienteDTO.getNumero() + ", "
                    + "'" + clienteDTO.getBairro() + "', "
                    + "'" + clienteDTO.getCidade() + "', "
                    + "'" + clienteDTO.getEstado() + "', "
                    + "'" + clienteDTO.getCep() + "', "
                    + "'" + clienteDTO.getCpf() + "')";

            stmt.execute(comando.toUpperCase());

            ConexaoDAO.con.commit();

            stmt.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }

    }

    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        try {

            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "";

            switch (opcao) {
                case 1:
                    comando = "Select c.* "
                            + "from cliente c "
                            + "where nome like'" + clienteDTO.getNome() + "%' "
                            + "order by c.nome";
                    break;
                case 2:
                    comando = "Select c.* "
                            + "from cliente c "
                            + "where id_cliente = " + clienteDTO.getId_cliente();
                    break;
                case 3:
                    comando = "Select c.id_cliente, c.nome "
                            + "from cliente c";
                    break;
            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return rs;
        }
    }

    public boolean alterarCliente(ClienteDTO clienteDTO) {

        try {

            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Update cliente set "
                    + "nome = '" + clienteDTO.getNome() + "', "
                    + "logradouro = '" + clienteDTO.getLogradouro() + "', "
                    + "numero = " + clienteDTO.getNumero() + ", "
                    + "bairro = '" + clienteDTO.getBairro() + "', "
                    + "cidade = '" + clienteDTO.getCidade() + "', "
                    + "estado ='" + clienteDTO.getEstado() + "', "
                    + "cep = '" + clienteDTO.getCep() + "', "
                    + "cpf = '" + clienteDTO.getCpf() + "' "
                    + "where id_cliente = " + clienteDTO.getId_cliente();

            stmt.execute(comando.toUpperCase());

            ConexaoDAO.con.commit();
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;

        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluirCliente(ClienteDTO clienteDTO) {

        try {

            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Delete from cliente where id_cliente = " + clienteDTO.getId_cliente();

            stmt.execute(comando.toUpperCase());

            ConexaoDAO.con.commit();
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;

        } finally {
            ConexaoDAO.CloseDB();
        }
    }
}
