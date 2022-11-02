package br.com.Avaliacao2LP1.dao;

import br.com.Avaliacao2LP1.dao.ConexaoDAO;
import java.sql.*;
import br.com.Avaliacao2LP1.dto.ProdutoDTO;
import br.com.Avaliacao2LP1.dto.FornecedorDTO;

public class ProdutoDAO {

    public ProdutoDAO() {
    }

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "Insert into produto(nome_prod, desc_prod, "
                    + "preco_prod, id_for )values( "
                    + "'" + produtoDTO.getNome_prod() + "', "
                    + "'" + produtoDTO.getDesc_prod() + "', "
                    + produtoDTO.getPreco_prod() + ", "
                    + fornecedorDTO.getId_for() + ") ";

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

    public boolean alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO) {

        try {

            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Update produto set "
                    + "nome_prod = '" + produtoDTO.getNome_prod() + "', "
                    + "desc_prod = '" + produtoDTO.getDesc_prod() + "', "
                    + "preco_prod = " + produtoDTO.getPreco_prod() + ", "
                    + "id_for = " + fornecedorDTO.getId_for() + " "
                    + "where id_prod = " + produtoDTO.getId_prod();

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

    public boolean excluirProduto(ProdutoDTO produtoDTO) {

        try {

            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Delete from produto where id_prod = " + produtoDTO.getId_prod();

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

    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao) {
        try {

            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "";

            switch (opcao) {
                case 1:
                    comando = "Select p.*"
                            + "from produto p "
                            + "where p.nome_prod ilike'" + produtoDTO.getNome_prod() + "%' "
                            + "order by p.nome_prod";
                    break;
                case 2:
                    comando = "Select p.*, f.nome_for, f.id_for "
                            + "from produto p, fornecedor f "
                            + "where p.id_for = f.id_for and "
                            + "p.id_prod = " +  produtoDTO.getId_prod();
                    break;

            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return rs;
        }
    }

}
