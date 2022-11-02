package br.com.Avaliacao2LP1.ctr;

import br.com.Avaliacao2LP1.dto.ClienteDTO;
import br.com.Avaliacao2LP1.dto.VendaDTO;
import br.com.Avaliacao2LP1.dao.VendaDAO;
import br.com.Avaliacao2LP1.dao.ConexaoDAO;
import javax.swing.JTable;

public class VendaCTR {

    VendaDAO vendaDAO = new VendaDAO();

    public VendaCTR() {
    }

    public String inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos) {
        try {
            if (vendaDAO.inserirVenda(vendaDTO, clienteDTO, produtos)) {
                return "Venda Cadastrada com sucesso!!!";
            } else {
                return "Venda não Cadastrada!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Venda não Cadastrada!!!";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

}
