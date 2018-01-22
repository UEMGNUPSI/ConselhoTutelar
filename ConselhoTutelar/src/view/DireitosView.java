package view;

import MODEL.DireitosM;
import MODEL.RequerenteM;
import dao.DireitosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import util.LimiteDigitos;


public class DireitosView extends javax.swing.JInternalFrame {

    DireitosM direitos = new DireitosM();
    DireitosDAO direitosdao = new DireitosDAO();
    List<DireitosM> listaDireitos;
    public DireitosView() {
        initComponents();
        this.setVisible(true);
        listaDireitos = new ArrayList<>();
        txtId.setVisible(false);
        AtualizaTabelaDireitos();
        
        txtArtigo.setDocument(new LimiteDigitos(10));
        txtDescricao.setDocument(new LimiteDigitos(300));
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtArtigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDireitos = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();

        setBackground(new java.awt.Color(211, 211, 211));
        setClosable(true);
        setTitle("Direitos");

        btnAlterar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(211, 211, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)), "Informações"));

        txtArtigo.setBackground(new java.awt.Color(231, 233, 237));
        txtArtigo.setEnabled(false);

        jLabel2.setText("Nº do artigo:");

        jLabel3.setText("Descrição:");

        txtId.setEnabled(false);

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtDescricao.setEnabled(false);
        jScrollPane3.setViewportView(txtDescricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(235, 235, 235)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(txtArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnExcluir.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(211, 211, 211));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)), "Informações"));

        jLabel7.setText("Nº do artigo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpar))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        btnNovo.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tblDireitos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDireitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDireitosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDireitos);

        btnSalvar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 129, 164)));
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    limparCampos();
    prepararNovo();
    ativaCampos();
    btnAlterar.setEnabled(false);
    btnExcluir.setEnabled(false);
    txtArtigo.requestFocusInWindow(); 
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    direitos = new DireitosM();
        if (txtDescricao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            txtDescricao.requestFocusInWindow();          
        }
        else if (txtId.getText().isEmpty()){
            direitos.setDescrição(txtDescricao.getText());
            direitos.setNumero(txtArtigo.getText());
      
            try{
                direitosdao.Salvar(direitos);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!");   
                txtId.requestFocusInWindow();
            }
            catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        AtualizaTabelaDireitos();
        prepararSalvareCancelar();
        desativaCampos();
        limparCampos();
       }
        else{
            direitos.setId(Integer.parseInt(txtId.getText()));
            direitos.setDescrição(txtDescricao.getText());
            direitos.setNumero(txtArtigo.getText());
       
            try{
                direitosdao.Alterar(direitos);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");  
            }
            catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        }
       AtualizaTabelaDireitos();
       prepararSalvareCancelar();
       desativaCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        prepararAlterar();
        ativaCampos();
        txtDescricao.requestFocusInWindow(); 
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        prepararSalvareCancelar();
        desativaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if (txtId.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione um Direito!");
       }
       else {
           direitos.setId(Integer.parseInt(txtId.getText()));
           int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir artigo " + txtArtigo.getText() + "?");
           if (confirma == 0){
               try{
                   direitosdao.Excluir(direitos);
                   limparCampos();
                   txtDescricao.requestFocusInWindow();
               }
               catch (SQLException ex){
                    Logger.getLogger(DireitosView.class.getName()).log(Level.SEVERE, null, ex);
                   if (ex.getErrorCode() == 1451) {
                        JOptionPane.showMessageDialog(null, "Impossível excluir direito que esteja em uso.", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
                    }
               }
               AtualizaTabelaDireitos();
               prepararExcluir();
           }
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    listaDireitos = null;
        if(txtBusca.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
            AtualizaTabelaDireitos();
        }
        else
        {
            try{
                
                listaDireitos = direitosdao.FiltroBusca(txtBusca.getText());
                if(listaDireitos == null){
                    
                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    AtualizaTabelaDireitos();
                    
                }else{
                    
                AtualizaTabelaDireitosBusca();
                
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblDireitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDireitosMouseClicked
        limparCampos();
        direitos = new DireitosM();
        
        try{
            direitos = direitosdao.busca(Integer.parseInt(tblDireitos.getValueAt(tblDireitos.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
   
        tblDireitos.getTableHeader().setReorderingAllowed(false);
        txtId.setText(Integer.toString(direitos.getId()));
        txtArtigo.setText(direitos.getNumero());
        txtDescricao.setText(direitos.getDescrição());
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tblDireitosMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
    txtBusca.setText("");
        AtualizaTabelaDireitos();
    txtBusca.requestFocusInWindow(); 
    }//GEN-LAST:event_btnLimparActionPerformed

    
    public void AtualizaTabelaDireitos(){
        direitos = new DireitosM();
        
        try {
            listaDireitos = direitosdao.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaDireitos.size()][3];
            int i = 0;
            for (DireitosM setor : listaDireitos) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNumero();
                dados[i][2] = setor.getDescrição();
                
               
                i++;
            }
           String tituloColuna[] = {"ID", "Número", "Descrição"};
            DefaultTableModel tabelaDireitos = new DefaultTableModel();
            tabelaDireitos.setDataVector(dados, tituloColuna);
            tblDireitos.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
            tblDireitos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblDireitos.getColumnModel().getColumn(0).setMinWidth(0);
            tblDireitos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblDireitos.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblDireitos.getColumnModel().getColumn(2).setPreferredWidth(15);
      
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblDireitos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblDireitos.setRowHeight(25);
            tblDireitos.updateUI();
    }
    
    public void AtualizaTabelaDireitosBusca(){ 
        direitos = new DireitosM();
        
        String dados[][] = new String[listaDireitos.size()][3];
            int i = 0;
            for (DireitosM setor : listaDireitos) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNumero();
                dados[i][2] = setor.getDescrição();
                
               
                i++;
            }
           String tituloColuna[] = {"ID", "Número", "Descrição"};
            DefaultTableModel tabelaDireitos = new DefaultTableModel();
            tabelaDireitos.setDataVector(dados, tituloColuna);
            tblDireitos.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblDireitos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblDireitos.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblDireitos.getColumnModel().getColumn(2).setPreferredWidth(15);
      
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblDireitos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblDireitos.setRowHeight(25);
            tblDireitos.updateUI();
 
    }
    
    
    public void limparCampos(){
        txtId.setText("");
        txtArtigo.setText("");
        txtDescricao.setText("");
    }
    
    public void ativaCampos(){
        txtId.setEnabled(true);
        txtArtigo.setEnabled(true);
        txtDescricao.setEnabled(true);
    }
    
     public void desativaCampos(){
        txtId.setEnabled(false);
        txtArtigo.setEnabled(false);
        txtDescricao.setEnabled(false);
    }
     
       
    public void prepararNovo() {
       btnNovo.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       tblDireitos.setEnabled(false);
       tblDireitos.clearSelection();
    }
   
    public void prepararSalvareCancelar() {
       btnNovo.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
       tblDireitos.setEnabled(true);
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
       tblDireitos.setEnabled(false);
       tblDireitos.clearSelection();
    }
   
    public void prepararExcluir(){
       btnExcluir.setEnabled(false);
       btnAlterar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDireitos;
    private javax.swing.JTextField txtArtigo;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
