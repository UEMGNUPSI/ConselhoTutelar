
package VIEW;

import javax.swing.JFrame;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuRequerente = new javax.swing.JMenuItem();
        mnuConselheiro = new javax.swing.JMenuItem();
        mnuDireitos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Arquivo");

        mnuRequerente.setText("Requerente");
        mnuRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRequerenteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRequerente);

        mnuConselheiro.setText("Conselheiro");
        mnuConselheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConselheiroActionPerformed(evt);
            }
        });
        jMenu1.add(mnuConselheiro);

        mnuDireitos.setText("Direitos");
        mnuDireitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDireitosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDireitos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1232, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRequerenteActionPerformed
        RequerenteView req = new RequerenteView();
    }//GEN-LAST:event_mnuRequerenteActionPerformed

    private void mnuConselheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConselheiroActionPerformed
       ConselheiroView cons = new ConselheiroView();
    }//GEN-LAST:event_mnuConselheiroActionPerformed

    private void mnuDireitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDireitosActionPerformed
       DireitosView dir = new DireitosView();
    }//GEN-LAST:event_mnuDireitosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuConselheiro;
    private javax.swing.JMenuItem mnuDireitos;
    private javax.swing.JMenuItem mnuRequerente;
    // End of variables declaration//GEN-END:variables
}
