
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        pnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuRequerente = new javax.swing.JMenuItem();
        mnuConselheiro = new javax.swing.JMenuItem();
        mnuDireitos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conselho Tutelar Frutal");
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 357, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/conslhotutelar.png"))); // NOI18N

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
        );

        getContentPane().add(pnl);
        pnl.setBounds(0, 0, 1410, 710);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/folder-open.png"))); // NOI18N
        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        mnuRequerente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        mnuRequerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/4.png"))); // NOI18N
        mnuRequerente.setText("Requerente");
        mnuRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRequerenteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRequerente);

        mnuConselheiro.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        mnuConselheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/3.png"))); // NOI18N
        mnuConselheiro.setText("Conselheiro");
        mnuConselheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConselheiroActionPerformed(evt);
            }
        });
        jMenu1.add(mnuConselheiro);

        mnuDireitos.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        mnuDireitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/1.png"))); // NOI18N
        mnuDireitos.setText("Direitos");
        mnuDireitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDireitosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDireitos);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/5.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        mnuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

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

    private void mnuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_mnuSairMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuConselheiro;
    private javax.swing.JMenuItem mnuDireitos;
    private javax.swing.JMenuItem mnuRequerente;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
