package view;

import MODEL.RequerenteM;
import dao.RequerenteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class RequerenteView extends javax.swing.JInternalFrame {

    RequerenteM requerente = new RequerenteM();
    RequerenteDAO requerentedao = new RequerenteDAO();
    List<RequerenteM> listaRequerente;
    public RequerenteView() {
        initComponents();
        this.setVisible(true);
        listaRequerente = new ArrayList<>();
        AtualizaTabelaRequerente();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequerente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtlabelbusca = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTel2 = new javax.swing.JFormattedTextField();
        txtTel1 = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblRequerente.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRequerente.setEnabled(false);
        tblRequerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRequerenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRequerente);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca"));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");

        txtlabelbusca.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtlabelbusca)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnLimpar)
                    .addComponent(txtlabelbusca))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        txtNome.setEnabled(false);

        jLabel2.setText("Nome:");

        txtNascimento.setEnabled(false);

        jLabel7.setText("Nascimento:");

        jLabel15.setText("Estado cívil:");

        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)" }));
        cbxEstadoCivil.setEnabled(false);

        txtId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereços e Telefone"));

        jLabel8.setText("Endereço:");

        txtEndereco.setEnabled(false);

        jLabel16.setText("Numero:");

        txtNumero.setEnabled(false);

        txtBairro.setEnabled(false);

        jLabel9.setText("Bairro:");

        jLabel12.setText("Telefone 1:");

        jLabel13.setText("Telefone 2:");

        jLabel14.setText("Celular:");

        jLabel10.setText("Cidade:");

        txtCidade.setEnabled(false);

        txtEstado.setEnabled(false);

        jLabel11.setText("Estado:");

        txtTel2.setFormatterFactory(setFormatoTelefone());

        txtTel1.setFormatterFactory(setFormatoTelefone());

        txtCelular.setFormatterFactory(setFormatoCelular());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtBairro)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(txtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Mais Informação"));

        txtObs.setColumns(20);
        txtObs.setRows(5);
        txtObs.setEnabled(false);
        jScrollPane2.setViewportView(txtObs);

        jLabel4.setText("Observação:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnCancelar)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnAlterar)
                        .addComponent(btnExcluir)
                        .addComponent(btnCancelar))
                    .addComponent(btnNovo))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    limparCampos();
    prepararNovo();
    ativaCampos();
    btnAlterar.setEnabled(false);
    btnExcluir.setEnabled(false);
    txtNome.requestFocusInWindow(); 
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    requerente = new RequerenteM();
        if (txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            txtNome.requestFocusInWindow();          
        }
        else if (txtId.getText().isEmpty()){
            requerente.setNome(txtNome.getText());
            requerente.setNascimento(txtNascimento.getText());
            requerente.setTelefone1(txtTel1.getText());
            requerente.setTelefone2(txtTel2.getText());
            requerente.setCelular(txtCelular.getText());
            requerente.setEndereço(txtEndereco.getText());
            requerente.setNumero(txtNumero.getText());
            requerente.setBairro(txtBairro.getText());
            requerente.setCidade(txtCidade.getText());
            requerente.setEstado(txtEstado.getText());
            requerente.setEstadoCivil(String.valueOf(cbxEstadoCivil.getSelectedIndex()));
            requerente.setObservação(txtObs.getText());
      
            try{
                requerentedao.Salvar(requerente);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!");   
                txtNome.requestFocusInWindow();
            }
            catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        AtualizaTabelaRequerente();
        prepararSalvareCancelar();
        desativaCampos();
        limparCampos();
       }
        else{
            requerente.setId(Integer.parseInt(txtId.getText()));
            requerente.setNome(txtNome.getText());
            requerente.setNascimento(txtNascimento.getText());
            requerente.setTelefone1(txtTel1.getText());
            requerente.setTelefone2(txtTel2.getText());
            requerente.setCelular(txtCelular.getText());
            requerente.setEndereço(txtEndereco.getText());
            requerente.setNumero(txtNumero.getText());
            requerente.setBairro(txtBairro.getText());
            requerente.setCidade(txtCidade.getText());
            requerente.setEstado(txtEstado.getText());
            requerente.setEstadoCivil(String.valueOf(cbxEstadoCivil.getSelectedIndex()));
            requerente.setObservação(txtObs.getText());
       
            try{
                requerentedao.Alterar(requerente);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");  
            }
            catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        }
       AtualizaTabelaRequerente();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if (txtId.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione um Requerente!");
       }
       else {
           requerente.setId(Integer.parseInt(txtId.getText()));
           int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: " + txtNome.getText());
           if (confirma == 0){
               try{
                   requerentedao.Excluir(requerente);
                   limparCampos();
                   txtNome.requestFocusInWindow();
               }
               catch (SQLException ex){
                   JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
               }
               AtualizaTabelaRequerente();
               prepararExcluir();
           }
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblRequerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequerenteMouseClicked
        limparCampos();
        requerente = new RequerenteM();

        txtId.setText(tblRequerente.getValueAt(tblRequerente.getSelectedRow(),0).toString());
        String integer = txtId.getText();
        int id = Integer.parseInt(integer);
        requerente.setId(id);
        
        try{
            requerente = requerentedao.busca(id);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
   
        tblRequerente.getTableHeader().setReorderingAllowed(false);
        txtId.setText(Integer.toString(requerente.getId()));
        txtNome.setText(requerente.getNome());
        txtTel1.setText(requerente.getTelefone1());
        txtTel2.setText(requerente.getTelefone2());
        txtCelular.setText(requerente.getCelular());
        txtEndereco.setText(requerente.getEndereço());
        txtBairro.setText(requerente.getBairro());
        txtCidade.setText(requerente.getCidade());
        txtEstado.setText(requerente.getEstado());
        cbxEstadoCivil.setSelectedItem(requerente.getEstadoCivil());
        txtObs.setText(requerente.getObservação());
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tblRequerenteMouseClicked
    
    public void AtualizaTabelaRequerente(){
        
        requerente = new RequerenteM();
        try {
            listaRequerente = requerentedao.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaRequerente.size()][6];
            int i = 0;
            for (RequerenteM setor : listaRequerente) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = setor.getTelefone1();
                dados[i][3] = setor.getEndereço();
                dados[i][4] = setor.getCidade();
                dados[i][5] = setor.getEstado();
                i++;
            }
           String tituloColuna[] = {"ID", "Nome", "Telefone 1", "Endereço", "Cidade", "Estado"};
            DefaultTableModel tabelaRequerente = new DefaultTableModel();
            tabelaRequerente.setDataVector(dados, tituloColuna);
            tblRequerente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblRequerente.getColumnModel().getColumn(0).setPreferredWidth(10);
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblRequerente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblRequerente.setRowHeight(25);
            tblRequerente.updateUI();     
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
        txtNome.setText("");
        txtNascimento.setText("");
        cbxEstadoCivil.setSelectedItem(false);
        txtEndereco.setText("");
        txtCelular.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtTel1.setText("");
        txtTel2.setText("");
        txtCelular.setText("");
        txtObs.setText("");          
    }
    public void ativaCampos(){
        txtNome.setEnabled(true);
        txtNascimento.setEnabled(true);
        cbxEstadoCivil.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtCelular.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtEstado.setEnabled(true);
        txtTel1.setEnabled(true);
        txtTel2.setEnabled(true);
        txtCelular.setEnabled(true);
        txtObs.setEnabled(true);            
    }
        
    public void desativaCampos(){
        txtNome.setEnabled(false);
        txtNascimento.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCelular.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtEstado.setEnabled(false);
        txtTel1.setEnabled(false);
        txtTel2.setEnabled(false);
        txtCelular.setEnabled(false);
        txtObs.setEnabled(false);            
    }
         
    public void prepararNovo() {
       btnNovo.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       tblRequerente.setEnabled(false);
       tblRequerente.clearSelection();
    }
   
    public void prepararSalvareCancelar() {
       btnNovo.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
       tblRequerente.setEnabled(true);
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
       tblRequerente.setEnabled(false);
       tblRequerente.clearSelection();
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
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRequerente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JFormattedTextField txtTel1;
    private javax.swing.JFormattedTextField txtTel2;
    private javax.swing.JLabel txtlabelbusca;
    // End of variables declaration//GEN-END:variables
}
