package br.comAvaliancaoLP1.dao;

import java.sql.*;
import br.comAvaliancaoLP1.dto.CurriculoDTO;

public class CurriculoDAO {

    private ResultSet rs = null;
    private Statement stmt = null;

    public CurriculoDAO() {

    }

    public boolean inserirCurriculo(CurriculoDTO curriculoDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "Insert into curriculo(nome, cpf, tell,"
                    + "email,exp,resumo,esc)values("
                    + "'" + curriculoDTO.getNome() + "', "
                    + "'" + curriculoDTO.getCpf() + "', "
                    + curriculoDTO.getTell() + ", "
                    + "'" + curriculoDTO.getEmail() + "', "
                    + "'" + curriculoDTO.getExp() + "', "
                    + "'" + curriculoDTO.getResumo() + "', "
                    + "'" + curriculoDTO.getEsc() + "')";

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

    public ResultSet consultarCurriculo(CurriculoDTO curriculoDTO, int opcao) {
        try {

            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "";

            switch (opcao) {
                case 1:
                    comando = "Select c.* "
                            + "from curriculo c "
                            + "where nome like'" + curriculoDTO.getNome() + "%' "
                            + "order by c.nome";
                    break;
                case 2:
                    comando = "Select c.* "
                            + "from curriculo c "
                            + "where id_curriculo = " + curriculoDTO.getId_curriculo();
                    break;
                case 3:
                    comando = "Select c.id_curriculo, c.nome "
                            + "from curriculo c";
                    break;
            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return rs;
        }
    }
    
    public boolean alterarCurriculo(CurriculoDTO curriculoDTO) {

        try {

            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Update curriculo set "
                    + "nome = '" + curriculoDTO.getNome() + "', "
                    + "cpf = '" + curriculoDTO.getCpf() + "', "
                    + "tell = " + curriculoDTO.getTell() + ", "
                    + "email = '" + curriculoDTO.getEmail() + "', "
                    + "exp = '" + curriculoDTO.getExp() + "', "
                    + "resumo = '" + curriculoDTO.getResumo() + "', "
                    + "esc = '" + curriculoDTO.getEsc() + "' "
                    + "where id_curriculo = " + curriculoDTO.getId_curriculo();

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
    
     public boolean excluirCurriculo(CurriculoDTO curriculoDTO) {

        try {

            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Delete from curriculo where id_curriculo = " + curriculoDTO.getId_curriculo();

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
