package br.com.Avaliacao2LP1.dao;

import br.com.Avaliacao2LP1.dao.ConexaoDAO;
import java.sql.*;
import br.com.Avaliacao2LP1.dto.FornecedorDTO;

public class FornecedorDAO {

    public FornecedorDAO() {

    }

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "Insert into fornecedor(nome_for, cnpj_for, "
                    + "tel_for )values("
                    + "'" + fornecedorDTO.getNome_for() + "', "
                    + "'" + fornecedorDTO.getCnpj_for() + "', "
                    + "'" + fornecedorDTO.getTel_for() + "')";


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

    public ResultSet consultarFornecedor(FornecedorDTO FornecedorDTO, int opcao) {
        try {

            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "";

            switch (opcao) {
                case 1:
                    comando = "Select f.id_for, f.nome_for "
                            + "from Fornecedor f "
                            + "where f.nome_for ilike'" + FornecedorDTO.getNome_for() + "%' "
                            + "order by f.nome_for";
                    break;
                case 2:
                    comando = "Select f.nome_for, f.cnpj_for, f.tel_for "
                            + "from fornecedor f "
                            + "where f.id_for = " + FornecedorDTO.getId_for();
                    break;
                
            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return rs;
        }
    }

    public boolean alterarFornecedor(FornecedorDTO fornecedorDTO) {

        try {

            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Update fornecedor set "
                    + "nome_for = '" + fornecedorDTO.getNome_for() + "', "
                    + "cnpj_for = '" + fornecedorDTO.getCnpj_for() + "', "
                    + "tel_for = '" + fornecedorDTO.getTel_for() + "'  "
                    + "where id_for = " + fornecedorDTO.getId_for();

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

    public boolean excluirFornecedor(FornecedorDTO fornecedorDTO) {

        try {

            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Delete from fornecedor where id_for = " + fornecedorDTO.getId_for();

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
