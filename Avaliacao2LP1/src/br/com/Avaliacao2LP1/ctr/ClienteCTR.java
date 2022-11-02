package br.com.Avaliacao2LP1.ctr;

import java.sql.ResultSet;
import br.com.Avaliacao2LP1.dto.ClienteDTO;
import br.com.Avaliacao2LP1.dao.ClienteDAO;
import br.com.Avaliacao2LP1.dao.ConexaoDAO;

public class ClienteCTR {

    ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteCTR() {
    }

    public String inserirCliente(ClienteDTO clienteDTO) {
        try {
            if (clienteDAO.inserirCliente(clienteDTO)) {
                return "Cliente Cadastrado com sucesso!!!";
            } else {
                return "Cliente não Cadastrado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente não Cadastrado!!!";
        }
    }

    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {

        ResultSet rs = null;

        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        return rs;

    }

    public void CloseDB() {
        ConexaoDAO.ConectDB();
    }

    public String alterarCliente(ClienteDTO clienteDTO) {
        try {
            if (clienteDAO.alterarCliente(clienteDTO)) {
                return "Cliente alterado com sucesso!!!";
            } else {
                return "cliente Não alterado!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "cliente não alterado!!!";
        }
    }
    
     public String excluirCliente(ClienteDTO clienteDTO) {
        try {
            if (clienteDAO.excluirCliente(clienteDTO)) {
                return "Cliente excluido com sucesso!!!";
            } else {
                return "cliente Não excluido!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "cliente não excluido!!!";
        }
    }
    
}

