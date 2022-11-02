package br.com.Avaliacao2LP1.ctr;

import java.sql.ResultSet;
import br.com.Avaliacao2LP1.dto.FornecedorDTO;
import br.com.Avaliacao2LP1.dto.ProdutoDTO;
import br.com.Avaliacao2LP1.dao.ProdutoDAO;
import br.com.Avaliacao2LP1.dao.ConexaoDAO;

public class ProdutoCTR {

    ProdutoDAO produtoDAO = new ProdutoDAO();

    public ProdutoCTR() {
    }

    public String inserirProduto(ProdutoDTO produtoDTO,FornecedorDTO fornecedorDTO) {
        try {
            if (produtoDAO.inserirProduto(produtoDTO, fornecedorDTO)) {
                return "Produto Cadastrado com sucesso!!!";
            } else {
                return "Produto não Cadastrado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não Cadastrado!!!";
        }
    }
    
    public String alterarProduto(ProdutoDTO produtoDTO,FornecedorDTO fornecedorDTO) {
        try {
            if (produtoDAO.alterarProduto(produtoDTO, fornecedorDTO)) {
                return "Produto alterado com sucesso!!!";
            } else {
                return "Produto NAO alterado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não alterado!!!";
        }
    }
    
    public String excluirProduto(ProdutoDTO produtoDTO) {
        try {
            if (produtoDAO.excluirProduto(produtoDTO)) {
                return "Produto excluido com sucesso!!!";
            } else {
                return "Produto Não excluido!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "Produto Não excluido!!!";
        }
    }

    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao) {

        ResultSet rs = null;

        rs = produtoDAO.consultarProduto(produtoDTO, opcao);
        return rs;

    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

}
