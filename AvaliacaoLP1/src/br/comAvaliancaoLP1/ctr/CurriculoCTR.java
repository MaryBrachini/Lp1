package br.comAvaliancaoLP1.ctr;

import java.sql.ResultSet;
import br.comAvaliancaoLP1.dto.CurriculoDTO;
import br.comAvaliancaoLP1.dao.CurriculoDAO;
import br.comAvaliancaoLP1.dao.ConexaoDAO;

public class CurriculoCTR {
     CurriculoDAO curriculoDAO = new CurriculoDAO();

    public CurriculoCTR() {
    }

    public String inserirCurriculo(CurriculoDTO curriculoDTO) {
        try {
            if (curriculoDAO.inserirCurriculo(curriculoDTO)) {
                return "Curriculo Cadastrado com sucesso!!!";
            } else {
                return "Curriculo não Cadastrado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Curriculo não Cadastrado!!!";
        }
    }

    public ResultSet consultarCurriculo(CurriculoDTO curriculoDTO, int opcao) {

        ResultSet rs = null;

        rs = curriculoDAO.consultarCurriculo(curriculoDTO, opcao);
        return rs;

    }

    public void CloseDB() {
        ConexaoDAO.ConectDB();
    }

    public String alterarCurriculo(CurriculoDTO curriculoDTO) {
        try {
            if (curriculoDAO.alterarCurriculo(curriculoDTO)) {
                return "Curriculo alterado com sucesso!!!";
            } else {
                return "curriculo Não alterado!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "curriculo não alterado!!!";
        }
    }
    
     public String excluirCurriculo(CurriculoDTO curriculoDTO) {
        try {
            if (curriculoDAO.excluirCurriculo(curriculoDTO)) {
                return "Curriculo excluido com sucesso!!!";
            } else {
                return "curriculo Não excluido!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "curriculo não excluido!!!";
        }
    }
}
