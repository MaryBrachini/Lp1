package br.com.Avaliacao2LP1.ctr;

import java.sql.ResultSet;
import br.com.Avaliacao2LP1.dto.FornecedorDTO;
import br.com.Avaliacao2LP1.dao.FornecedorDAO;
import br.com.Avaliacao2LP1.dao.ConexaoDAO;

public class FornecedorCTR {

    FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public FornecedorCTR() {
    }

    public String inserirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            if (fornecedorDAO.inserirFornecedor(fornecedorDTO)) {
                return "Fornecedor Cadastrado com sucesso!!!";
            } else {
                return "Fornecedor não Cadastrado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não Cadastrado!!!";
        }
    }

    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opcao) {

        ResultSet rs = null;

        rs = fornecedorDAO.consultarFornecedor(fornecedorDTO, opcao);
        return rs;

    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

    public String alterarFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            if (fornecedorDAO.alterarFornecedor(fornecedorDTO)) {
                return "Fornecedor alterado com sucesso!!!";
            } else {
                return "Fornecedor NAO alterado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não alterado!!!";
        }
    }

    public String excluirFornecedor(FornecedorDTO fornecedorDTO) {
        try {
            if (fornecedorDAO.excluirFornecedor(fornecedorDTO)) {
                return "Fornecedor excluido com sucesso!!!";
            } else {
                  return "Fornecedor Não excluido!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "Fornecedor Não excluido!!!";
        }
    }

}
