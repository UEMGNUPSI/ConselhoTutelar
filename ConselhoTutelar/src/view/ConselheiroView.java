package view;

import MODEL.ConselheiroM;
import dao.ConselheiroDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;


public class ConselheiroView extends javax.swing.JInternalFrame {

    ConselheiroM conselheiro = new ConselheiroM();
    ConselheiroDAO conselheirodao = new ConselheiroDAO();
    List<ConselheiroM> listaconselheiro;
    public ConselheiroView() {
        initComponents();
        this.setVisible(true);
        listaconselheiro = new ArrayList<>();
        
        txtId.setVisible(false);
        AtualizaTabelaConselheiro();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtId = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblConselheiro = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();

        setClosable(true);
        setTitle("Conselheiro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        txtNome.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNome.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Celular:");

        txtTelefone.setFormatterFactory(setFormatoTelefone());
        txtTelefone.setEnabled(false);
        txtTelefone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        txtCelular.setFormatterFactory(setFormatoCelular());
        txtCelular.setEnabled(false);
        txtCelular.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        txtId.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblConselheiro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblConselheiro.setModel(new javax.swing.table.DefaultTableModel(
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
        tblConselheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConselheiroMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblConselheiro);

        btnExcluir.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca"));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel7.setText("Nome:");

        txtBusca.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar)
                .addGap(78, 78, 78))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnLimpar))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Login:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setText("Senha:");

        txtLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtLogin.setEnabled(false);

        txtSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtSenha.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLogin)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    limparCampos();
    prepararNovo();
    ativaCampos();
    btnAlterar.setEnabled(false);
    btnExcluir.setEnabled(false);
    txtNome.requestFocusInWindow(); 
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    conselheiro = new ConselheiroM();
        if (txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            txtNome.requestFocusInWindow();          
        }
        else if (txtId.getText().isEmpty()){
            conselheiro.setNome(txtNome.getText());
            conselheiro.setTelefone(txtTelefone.getText());
            conselheiro.setCelular(txtCelular.getText());
            conselheiro.setLogin(txtLogin.getText());
            conselheiro.setSenha(txtSenha.getText());
      
            try{
                conselheirodao.Salvar(conselheiro);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!");   
                txtNome.requestFocusInWindow();
            }
            catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        AtualizaTabelaConselheiro();
        prepararSalvareCancelar();
        desativaCampos();
        limparCampos();
       }
        else{
            conselheiro.setId(Integer.parseInt(txtId.getText()));
            conselheiro.setNome(txtNome.getText());
            conselheiro.setTelefone(txtTelefone.getText());
            conselheiro.setCelular(txtCelular.getText());
            conselheiro.setLogin(txtLogin.getText());
            conselheiro.setSenha(txtSenha.getText());
       
            try{
                conselheirodao.Alterar(conselheiro);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");  
            }
            catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        }
       AtualizaTabelaConselheiro();
       prepararSalvareCancelar();
       desativaCampos();
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        prepararAlterar();
        ativaCampos();
        txtNome.requestFocusInWindow(); 
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        prepararSalvareCancelar();
        desativaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if (txtId.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione um Conselheiro!");
       }
       else {
           conselheiro.setId(Integer.parseInt(txtId.getText()));
           int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: " + txtNome.getText());
           if (confirma == 0){
               try{
                   conselheirodao.Excluir(conselheiro);
                   limparCampos();
                   txtNome.requestFocusInWindow();
               }
               catch (SQLException ex){
                   JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
               }
               AtualizaTabelaConselheiro();
               prepararExcluir();
           }
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblConselheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConselheiroMouseClicked
        limparCampos();
        conselheiro = new ConselheiroM();

        try{
            conselheiro = conselheirodao.busca(Integer.parseInt(tblConselheiro.getValueAt(tblConselheiro.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
   
        tblConselheiro.getTableHeader().setReorderingAllowed(false);
        txtId.setText(Integer.toString(conselheiro.getId()));
        txtNome.setText(conselheiro.getNome());
        txtTelefone.setText(conselheiro.getTelefone());
        txtCelular.setText(conselheiro.getCelular());
        txtLogin.setText(conselheiro.getLogin());
        txtSenha.setText(conselheiro.getSenha());
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tblConselheiroMouseClicked

    public void AtualizaTabelaConselheiro(){
        
        conselheiro = new ConselheiroM();
        try {
            listaconselheiro = conselheirodao.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaconselheiro.size()][5];
            int i = 0;
            for (ConselheiroM setor : listaconselheiro) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = setor.getTelefone();
                dados[i][3] = setor.getCelular();
                dados[i][4] = setor.getLogin();

                i++;
            }
           String tituloColuna[] = {"ID", "Nome", "Telefone", "Celular", "Login"};
            DefaultTableModel tabelaConselheiro = new DefaultTableModel();
            tabelaConselheiro.setDataVector(dados, tituloColuna);
            tblConselheiro.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblConselheiro.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblConselheiro.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblConselheiro.getColumnModel().getColumn(2).setPreferredWidth(15);
      
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblConselheiro.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblConselheiro.setRowHeight(25);
            tblConselheiro.updateUI();
        
                
    }
    
     //Mascara que formata para regularizar como é inserido o telefone
    public static DefaultFormatterFactory setFormatoTelefone(){  
        MaskFormatter comFoco = null;  
        try   
        {   
            comFoco = new MaskFormatter("(##)####-####"); 
            comFoco.setPlaceholderCharacter('_');
        }   
        catch (Exception pe) { }  
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);  
        return factory;  
    }
    
    //Mascara que formata para regularizar como é inserido o celular
    public static DefaultFormatterFactory setFormatoCelular(){  
        MaskFormatter comFoco = null;  
        try   
        {   
            comFoco = new MaskFormatter("(##)9####-####"); 
            comFoco.setPlaceholderCharacter('_');
        }   
        catch (Exception pe) { }  
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);  
        return factory;  
    } 
    
    
    public void limparCampos(){
        txtId.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtLogin.setText("");
        txtSenha.setText("");      
    }
    
    public void ativaCampos(){
        txtNome.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCelular.setEnabled(true);
        txtLogin.setEnabled(true);
        txtSenha.setEnabled(true);        
    }

    public void desativaCampos(){
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCelular.setEnabled(false);
        txtLogin.setEnabled(false);
        txtSenha.setEnabled(false);        
    }

    public void prepararNovo() {
       btnNovo.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       tblConselheiro.setEnabled(false);
       tblConselheiro.clearSelection();
    }

    public void prepararSalvareCancelar() {
       btnNovo.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
       tblConselheiro.setEnabled(true);
    }

    public void prepararSelecaoTabela(){
       btnNovo.setEnabled(true);
       btnExcluir.setEnabled(true);
       btnAlterar.setEnabled(true);
    }

    public void prepararAlterar(){
       btnNovo.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnAlterar.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       tblConselheiro.setEnabled(false);
       tblConselheiro.clearSelection();
    }

    public void prepararExcluir(){
       btnExcluir.setEnabled(false);
       btnAlterar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblConselheiro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
