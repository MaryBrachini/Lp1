package br.comAvaliancaoLP1.view;

import javax.swing.JOptionPane;

public class PrincipalVIEW extends javax.swing.JFrame {

    public PrincipalVIEW() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void abreCurriculoVIEW() {
        CurriculoVIEW curriculoVIEW = new CurriculoVIEW();
        this.desktopPane.add(curriculoVIEW);
        curriculoVIEW.setVisible(true);
        curriculoVIEW.setPosicao();
    }

    private void sair() {
        Object[] options = {"Sair", "Cancelar"};
        if (JOptionPane.showOptionDialog(null, "Deseja realmente sair do sistema?", "!!!Informações!!!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0) {
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        Cadastrar = new javax.swing.JMenu();
        Curriculo = new javax.swing.JMenuItem();
        sairPrincipal = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastrar.setMnemonic('f');
        Cadastrar.setText("Cadastrar");

        Curriculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        Curriculo.setMnemonic('o');
        Curriculo.setText("Curriculo");
        Curriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurriculoActionPerformed(evt);
            }
        });
        Cadastrar.add(Curriculo);

        menuBar.add(Cadastrar);

        sairPrincipal.setMnemonic('e');
        sairPrincipal.setText("Sair");
        sairPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairPrincipalMouseClicked(evt);
            }
        });
        menuBar.add(sairPrincipal);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CurriculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurriculoActionPerformed
        abreCurriculoVIEW();
    }//GEN-LAST:event_CurriculoActionPerformed

    private void sairPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPrincipalMouseClicked
        sair(); // fechar o sistema
    }//GEN-LAST:event_sairPrincipalMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastrar;
    private javax.swing.JMenuItem Curriculo;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu sairPrincipal;
    // End of variables declaration//GEN-END:variables

}
