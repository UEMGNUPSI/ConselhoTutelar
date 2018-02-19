/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Conexao;
import dao.ConselheiroDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.JOptionPane;
import MODEL.ConselheiroM;
import util.LimiteDigitos;

public class LoginView extends javax.swing.JFrame {

    ConselheiroM ConselheiroM;
    ConselheiroDAO ConselheiroDAO;

    public LoginView() {
         initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        URL url = this.getClass().getResource("/view/imagem/kids.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        
        ConselheiroM = new ConselheiroM();
        
        this.txtUsuario.requestFocus();
        ConselheiroDAO = new ConselheiroDAO();
       
        
        /* URL url = this.getClass().getResource("/view/icones/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);*/
        
        txtUsuario.setDocument(new LimiteDigitos(20));
        txtSenha.setDocument(new LimiteDigitos(20));
        txtUsuario.setText("root");
        txtSenha.setText("root");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/Usuario.png"))); // NOI18N
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/Chave.png"))); // NOI18N
        jLabel2.setText("Senha");

        txtUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/Cadeado.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        txtSenha.setText("root");
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtSenha))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnEntrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        ConselheiroM = null;
        try {
            if (txtUsuario.getText().isEmpty()) {
                //erro.setText("O nome do usuario deve ser preechido");
                JOptionPane.showMessageDialog(null, "O usuário deve ser preenchido", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                txtUsuario.requestFocus();

            } else if (txtSenha.getText().isEmpty()) {
                //erro.setText("A senha deve ser preechido");
                //erro.setVisible(true);
                JOptionPane.showMessageDialog(null, "A senha deve ser preenchida", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                txtSenha.requestFocus();
            } else {
                ConselheiroM = ConselheiroDAO.Valida(txtUsuario.getText(), txtSenha.getText());
                if(ConselheiroM == null){
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    txtUsuario.requestFocus();
                }else{
       
                    PrincipalView principal = new PrincipalView(ConselheiroM);
                    this.dispose();
                    
                }
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.requestFocus();
            ex.printStackTrace();
            
        }
        this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSenha.requestFocusInWindow();
        }     
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        ConselheiroM = null;
        try {
            if (txtUsuario.getText().isEmpty()) {
                //erro.setText("O nome do usuario deve ser preechido");
                JOptionPane.showMessageDialog(null, "O usuário deve ser preenchido", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                txtUsuario.requestFocus();

            } else if (txtSenha.getText().isEmpty()) {
                //erro.setText("A senha deve ser preechido");
                //erro.setVisible(true);
                JOptionPane.showMessageDialog(null, "A senha deve ser preenchida", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                txtSenha.requestFocus();
            } else {
                ConselheiroM = ConselheiroDAO.Valida(txtUsuario.getText(), txtSenha.getText());
                if(ConselheiroM == null){
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    txtUsuario.requestFocus();
                }else{
       
                    PrincipalView principal = new PrincipalView(ConselheiroM);
                    this.dispose();
                    
                }
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.requestFocus();
            ex.printStackTrace();
            
        }
        this.dispose();
    }
    }//GEN-LAST:event_txtSenhaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
