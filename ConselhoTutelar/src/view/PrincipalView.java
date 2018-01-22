
package view;

import MODEL.ConselheiroM;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PrincipalView extends javax.swing.JFrame {

    ConselheiroM conselheiroAtivo = new ConselheiroM();
    
    public PrincipalView(ConselheiroM conselheiro) {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        URL url = this.getClass().getResource("/view/imagem/kids.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuAtendimento = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conselho Tutelar Frutal");
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/conslhotutelar.png"))); // NOI18N

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        getContentPane().add(pnl);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/if_kuser_1400.png"))); // NOI18N
        jMenu1.setText("Requerente");
        jMenu1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/if_administrator_43663.png"))); // NOI18N
        jMenu2.setText("Conselheiro");
        jMenu2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/if_Rules of Fight Club_27667.png"))); // NOI18N
        jMenu3.setText("Direitos");
        jMenu3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.add(jSeparator3);

        jMenuBar1.add(jMenu3);

        mnuAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/if_Application_46710.png"))); // NOI18N
        mnuAtendimento.setText("Atendimento");
        mnuAtendimento.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        mnuAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAtendimentoMouseClicked(evt);
            }
        });
        mnuAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAtendimentoActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuAtendimento);

        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/if_Gnome-Application-Exit-48_55222.png"))); // NOI18N
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

    private void mnuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSairMouseClicked
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_OPTION);
    
        if(opcao == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_mnuSairMouseClicked

    private void mnuAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAtendimentoActionPerformed
        
        
    }//GEN-LAST:event_mnuAtendimentoActionPerformed

    private void mnuAtendimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAtendimentoMouseClicked
    AtendimentoView ate = new AtendimentoView();
        pnl.removeAll();
        pnl.add(ate);
        pnl.updateUI();
    }//GEN-LAST:event_mnuAtendimentoMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        RequerenteView requerente = new RequerenteView();
        pnl.removeAll(); 
        pnl.add(requerente); 
        pnl.updateUI();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        ConselheiroView conselheiro = new ConselheiroView();
        pnl.removeAll(); 
        pnl.add(conselheiro); 
        pnl.updateUI();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        DireitosView direitos = new DireitosView();
        pnl.removeAll(); 
        pnl.add(direitos); 
        pnl.updateUI();
    }//GEN-LAST:event_jMenu3MouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu mnuAtendimento;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
