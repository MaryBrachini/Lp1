package br.com.Avaliacao2LP1.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.Avaliacao2LP1.dto.VendaDTO;
import br.com.Avaliacao2LP1.ctr.VendaCTR;
import br.com.Avaliacao2LP1.dto.ProdutoDTO;
import br.com.Avaliacao2LP1.ctr.ProdutoCTR;
import br.com.Avaliacao2LP1.dto.ClienteDTO;
import br.com.Avaliacao2LP1.ctr.ClienteCTR;

import java.util.Date;

public class VendaVIEW extends javax.swing.JInternalFrame {

    VendaDTO vendaDTO = new VendaDTO();
    VendaCTR vendaCTR = new VendaCTR();

    ProdutoDTO produtoDTO = new ProdutoDTO();
    ProdutoCTR produtoCTR = new ProdutoCTR();

    ClienteDTO clienteDTO = new ClienteDTO();
    ClienteCTR clienteCTR = new ClienteCTR();

    //int gravar_alterar;
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_cli;
    DefaultTableModel modelo_jtl_consultar_pro;
    DefaultTableModel modelo_jtl_consultar_pro_selecionado;

    public VendaVIEW() {
        initComponents();

        liberaCampos(false);
        
        liberaBotoes(true, false, false, true);
        
        //Atribui um modelo para manipular a tabela
        modelo_jtl_consultar_cli = (DefaultTableModel) jtl_consultar_cli.getModel();
        modelo_jtl_consultar_pro = (DefaultTableModel) jtl_consultar_pro.getModel();
        modelo_jtl_consultar_pro_selecionado = (DefaultTableModel) jtl_consultar_pro_selecionado.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pesquisa_nome_cli = new javax.swing.JTextField();
        btnPesquisarCli = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_cli = new javax.swing.JTable();
        TotalVenda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pesquisa_nome_pro = new javax.swing.JTextField();
        btnPesquisarPro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_pro = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtl_consultar_pro_selecionado = new javax.swing.JTable();
        btnProAdd = new javax.swing.JButton();
        btnProRem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Pedidos");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setText("Cliente");

        btnPesquisarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao2LP1/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCliActionPerformed(evt);
            }
        });

        jtl_consultar_cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_cli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_cliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_cli);
        if (jtl_consultar_cli.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_cli.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtl_consultar_cli.getColumnModel().getColumn(1).setPreferredWidth(280);
        }

        TotalVenda.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        TotalVenda.setForeground(new java.awt.Color(12, 255, 0));
        TotalVenda.setText("0.00");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Preço Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisa_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(TotalVenda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisarCli)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(pesquisa_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TotalVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setText("Descrição");

        btnPesquisarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao2LP1/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProActionPerformed(evt);
            }
        });

        jtl_consultar_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_pro);
        if (jtl_consultar_pro.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_pro.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtl_consultar_pro.getColumnModel().getColumn(1).setPreferredWidth(280);
        }

        jtl_consultar_pro_selecionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Qtd"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_pro_selecionado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtl_consultar_pro_selecionadoKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jtl_consultar_pro_selecionado);
        if (jtl_consultar_pro_selecionado.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_pro_selecionado.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtl_consultar_pro_selecionado.getColumnModel().getColumn(1).setPreferredWidth(280);
        }

        btnProAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao2LP1/view/imagens/prod_add.png"))); // NOI18N
        btnProAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProAddActionPerformed(evt);
            }
        });

        btnProRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao2LP1/view/imagens/prod_rem.png"))); // NOI18N
        btnProRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProRemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisa_nome_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnProAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnProRem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPesquisarPro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pesquisa_nome_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProRem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao2LP1/view/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao2LP1/view/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao2LP1/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao2LP1/view/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnCancelar)
                .addGap(48, 48, 48)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSair))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void liberaCampos(boolean a) {
        pesquisa_nome_cli.setEnabled(a);
        btnPesquisarCli.setEnabled(a);
        jtl_consultar_cli.setEnabled(a);
        pesquisa_nome_pro.setEnabled(a);
        btnPesquisarPro.setEnabled(a);
        jtl_consultar_pro.setEnabled(a);
        btnProAdd.setEnabled(a);
        btnProRem.setEnabled(a);
        jtl_consultar_pro_selecionado.setEnabled(a);
        TotalVenda.setText("0.00");
    }

    private void limpaCampos() {
        pesquisa_nome_cli.setText("");
        modelo_jtl_consultar_cli.setNumRows(0);
        pesquisa_nome_pro.setText("");
        modelo_jtl_consultar_pro.setNumRows(0);
        modelo_jtl_consultar_pro_selecionado.setNumRows(0);
    }

    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d) {
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnSair.setEnabled(d);
    }

    private void gravar() {
        vendaDTO.setDat_vend(new Date());
        vendaDTO.setVal_vend(Double.parseDouble(TotalVenda.getText()));
        clienteDTO.setId_cliente(Integer.parseInt(String.valueOf(
            jtl_consultar_cli.getValueAt(jtl_consultar_cli.getSelectedRow(), 0))));
        
        JOptionPane.showMessageDialog(null, vendaCTR.inserirVenda(vendaDTO, clienteDTO, jtl_consultar_pro_selecionado));
    }

    private void sair() {
        Object[] options = {"Sair", "Cancelar"};
        if (JOptionPane.showOptionDialog(null, "Deseja sair do sistema?", "Informações",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0) {
            System.exit(0);
        }
    }

    private void preencheTabelaCliente(String nome_cliente) {
        try {
            modelo_jtl_consultar_cli.setNumRows(0);

            clienteDTO.setNome(nome_cliente);
            rs = clienteCTR.consultarCliente(clienteDTO, 1);
            
            //Enquanto tiver linhas, faça:
            while (rs.next()) {
                modelo_jtl_consultar_cli.addRow(new Object[]{
                    rs.getString("id_cliente"),
                    rs.getString("nome"),});
            }
        } catch (Exception erTab) {
            System.out.println("Erro ao Gravar" + erTab.getMessage());
        } /*finally {
            clienteCTR.CloseDB();
        }*/
    }
    
    private void preencheTabelaProduto(String nome_prod) {
        try {
            modelo_jtl_consultar_pro.setNumRows(0);
            produtoDTO.setNome_prod(nome_prod);
            rs = produtoCTR.consultarProduto(produtoDTO, 1);
            
            //Enquanto tiver linhas, faça:
            while (rs.next()) {
                modelo_jtl_consultar_pro.addRow(new Object[]{
                    rs.getString("id_prod"),
                    rs.getString("nome_prod"),
                    rs.getDouble("preco_prod"),});
            }
        } catch (Exception erTab) {
            System.out.println("Erro ao Gravar" + erTab.getMessage());
        }
    }
    
    //Usado para adicionar produtos selecionados na Jtable.
    private void adicionaProdutoSelecionado(int id_prod, String nome_prod, double p_venda_prod) {
        try {
            modelo_jtl_consultar_pro_selecionado.addRow(new Object[]{
                    id_prod,
                    nome_prod,
                    p_venda_prod
            });
        } catch (Exception erTab) {
            System.out.println("Erro SQL" + erTab.getMessage());
        }
    }
    
    //Usado para remover produtos selecionados na Jtable.
    private void removeProdutoSelecionado(int linha_selecionada) {
        try {
            if(linha_selecionada >= 0){
                modelo_jtl_consultar_pro_selecionado.removeRow(linha_selecionada);
                calculaTotalVenda();
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL" + erTab.getMessage());
        }
    }
    
    private void calculaTotalVenda(){
        try{
            double total = 0;
            for(int cont = 0; cont < jtl_consultar_pro_selecionado.getRowCount(); cont++){
                total += (Double.parseDouble(String.valueOf(
                        jtl_consultar_pro_selecionado.getValueAt(cont, 2))) *
                        Integer.parseInt(String.valueOf(
                        jtl_consultar_pro_selecionado.getValueAt(cont, 3))));
            }
            TotalVenda.setText(String.valueOf(total));
        }catch(Exception erTab){
            System.out.println("Erro SQL" + erTab.getMessage());
        }
    }
    
    //Verificar se os campos estão preenchidos.
    private boolean verificaPreenchimento(){
        if(jtl_consultar_cli.getSelectedRowCount() <= 0){
            JOptionPane.showMessageDialog(null, "Deve ser selecionado um cliente.");
            jtl_consultar_cli.requestFocus();
            return false;
        }else{
            if(jtl_consultar_pro_selecionado.getRowCount() <= 0){
                JOptionPane.showMessageDialog(null, "É necessário adicionar pelo menos um produto no pedido.");
                jtl_consultar_pro_selecionado.requestFocus();
                return false;
            }else{
                int verifica = 0;
                for(int cont = 0; cont < jtl_consultar_pro_selecionado.getRowCount(); cont++){
                    if(String.valueOf(jtl_consultar_pro_selecionado.getValueAt(cont, 3)).equalsIgnoreCase("null")){
                        verifica++;
                    }
                }
                if(verifica > 0){
                    JOptionPane.showMessageDialog(null,
                            "A quantidade de cada produto vendido deve ser informada");
                            jtl_consultar_pro_selecionado.requestFocus();
                            return false;
                }else{
                    return true;
                }//Fecha else da quantidade de cada produto vendido.
            }//Fecha else jtl_consultar_pro_selecionado;
        }//Fecha else jtl_consultar_cli.
    }


    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_cli.setNumRows(0);
        modelo_jtl_consultar_pro.setNumRows(0);
        liberaBotoes(true, false, false, true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (verificaPreenchimento()) {
            gravar();
            limpaCampos();
            liberaCampos(false);
            liberaBotoes(true, false, false, true);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProActionPerformed
        preencheTabelaProduto(pesquisa_nome_pro.getText());
    }//GEN-LAST:event_btnPesquisarProActionPerformed

    private void btnPesquisarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCliActionPerformed
        preencheTabelaCliente(pesquisa_nome_cli.getText());
    }//GEN-LAST:event_btnPesquisarCliActionPerformed

    private void btnProAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProAddActionPerformed
        adicionaProdutoSelecionado(
                Integer.parseInt(String.valueOf(jtl_consultar_pro.getValueAt(
                        jtl_consultar_pro.getSelectedRow(), 0))),
                String.valueOf(jtl_consultar_pro.getValueAt(jtl_consultar_pro.getSelectedRow(), 1)),
                Double.parseDouble(String.valueOf(jtl_consultar_pro.getValueAt(
                        jtl_consultar_pro.getSelectedRow(), 2)))
        );
    }//GEN-LAST:event_btnProAddActionPerformed

    private void btnProRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProRemActionPerformed
        removeProdutoSelecionado(jtl_consultar_pro_selecionado.getSelectedRow());
    }//GEN-LAST:event_btnProRemActionPerformed

    private void jtl_consultar_cliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_cliMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtl_consultar_cliMouseClicked

    private void jtl_consultar_pro_selecionadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtl_consultar_pro_selecionadoKeyReleased
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            calculaTotalVenda();
        };
    }//GEN-LAST:event_jtl_consultar_pro_selecionadoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalVenda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarCli;
    private javax.swing.JButton btnPesquisarPro;
    private javax.swing.JButton btnProAdd;
    private javax.swing.JButton btnProRem;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtl_consultar_cli;
    private javax.swing.JTable jtl_consultar_pro;
    private javax.swing.JTable jtl_consultar_pro_selecionado;
    private javax.swing.JTextField pesquisa_nome_cli;
    private javax.swing.JTextField pesquisa_nome_pro;
    // End of variables declaration//GEN-END:variables
}
