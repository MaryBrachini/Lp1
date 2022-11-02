package br.com.Avaliacao2LP1.dao;

import br.com.Avaliacao2LP1.dao.ConexaoDAO;
import java.sql.*;
import br.com.Avaliacao2LP1.dto.ClienteDTO;
import br.com.Avaliacao2LP1.dto.VendaDTO;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class VendaDAO {

    private ResultSet rs = null;
    private Statement stmt = null;
    private Statement stmt1 = null;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public VendaDAO() {
    }

    public boolean inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();
            stmt1 = ConexaoDAO.con.createStatement();

            String comando1 = "Insert into Venda(dat_vend, val_vend, id_cliente)values("
                    + "to_date('" + date.format(vendaDTO.getDat_vend()) + "', 'DD/MM/YYYY'), "
                    + vendaDTO.getVal_vend() + ", "
                    + clienteDTO.getId_cliente() + ")";

            stmt.execute(comando1.toUpperCase(), Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            rs.next();

            for (int cont = 0; cont < produtos.getRowCount(); cont++) {
                String comando2 = "Insert into produto_venda(id_vend,id_prod,"
                        + "val_prod, qtd_prod)values("
                        + rs.getInt("Id_vend") + ", "
                        + produtos.getValueAt(cont, 0) + ", "
                        + produtos.getValueAt(cont, 1) + ", "
                        + produtos.getValueAt(cont, 2) + "); ";
                stmt1.execute(comando2);

            }
            ConexaoDAO.con.commit();

            stmt.close();
            stmt1.close();
            rs.close();

            return true;

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }

    }


}
