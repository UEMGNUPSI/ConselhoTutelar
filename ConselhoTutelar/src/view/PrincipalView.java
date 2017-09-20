
package view;

import MODEL.ConselheiroM;
import javax.swing.JFrame;


public class PrincipalView extends javax.swing.JFrame {

    ConselheiroM conselheiroAtivo = new ConselheiroM();
    
    public PrincipalView(ConselheiroM conselheiro) {
        
                initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnl = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuRequerente = new javax.swing.JMenuItem();
        mnuConselheiro = new javax.swing.JMenuItem();
        mnuDireitos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conselho Tutelar Frutal");

        jLabel1.setToolTipText("");

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        mnuRequerente.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuRequerente.setText("Requerente");
        mnuRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRequerenteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRequerente);

        mnuConselheiro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuConselheiro.setText("Conselheiro");
        mnuConselheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConselheiroActionPerformed(evt);
            }
        });
        jMenu1.add(mnuConselheiro);

        mnuDireitos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(581, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRequerenteActionPerformed
        RequerenteView req = new RequerenteView();
        pnl.removeAll();
        pnl.add(req);
        pnl.updateUI();
    }//GEN-LAST:event_mnuRequerenteActionPerformed

    private void mnuConselheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConselheiroActionPerformed
       ConselheiroView cons = new ConselheiroView();
       pnl.removeAll();
       pnl.add(cons);
       pnl.updateUI();
    }//GEN-LAST:event_mnuConselheiroActionPerformed

    private void mnuDireitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDireitosActionPerformed
       DireitosView dir = new DireitosView();
       pnl.removeAll();
       pnl.add(dir);
       pnl.updateUI();
    }//GEN-LAST:event_mnuDireitosActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuConselheiro;
    private javax.swing.JMenuItem mnuDireitos;
    private javax.swing.JMenuItem mnuRequerente;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
