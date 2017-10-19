package View;


import Dao.MarcaVeiculoDao;
import Dao.ModeloVeiculoDao;
import Model.ColorStatus;
import Model.MarcaVeiculo;
import Model.ModeloVeiculo;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class NovoVeiculo extends javax.swing.JInternalFrame {

    ColorStatus color = new ColorStatus();

    List<MarcaVeiculo> listaMarcaVeiculo;
    List<ModeloVeiculo> listaModeloVeiculo;
    MarcaVeiculoDao marcaVeiculoDao = new MarcaVeiculoDao();
    ModeloVeiculoDao modeloVeiculoDao = new ModeloVeiculoDao();
    
    public NovoVeiculo() {
        initComponents();
        
        this.setLocation((1080 - this.getSize().width) / 2, (370 - this.getSize().height) / 2);
        
        btnNovaMarca.setUI(new BasicButtonUI());
        btnNovoModelo.setUI(new BasicButtonUI());
        btnNovoVeiculo.setUI(new BasicButtonUI());
        btnSalvarMarca.setUI(new BasicButtonUI());
        btnCancelarMarca.setUI(new BasicButtonUI());
        
        pnlMarca.setVisible(false);
        pnlModelo.setVisible(false);
        pnlVeiculo.setVisible(false);
        
        cbxMarca1.setUI(new BasicComboBoxUI());
        cbxMarca2.setUI(new BasicComboBoxUI());
        
        atualizaBoxMarca();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grpRadioTipo = new javax.swing.ButtonGroup();
        Scroll = new javax.swing.JScrollPane();
        Fundo = new javax.swing.JPanel();
        FundoNovo = new javax.swing.JPanel();
        lblTituloFrame = new javax.swing.JLabel();
        pnlFundoOpt = new javax.swing.JPanel();
        btnNovaMarca = new javax.swing.JButton();
        btnNovoModelo = new javax.swing.JButton();
        btnNovoVeiculo = new javax.swing.JButton();
        pnlMarca = new javax.swing.JPanel();
        lblTituloPanel = new javax.swing.JLabel();
        lblMarca1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        brdMarca = new javax.swing.JSeparator();
        btnSalvarMarca = new javax.swing.JButton();
        btnCancelarMarca = new javax.swing.JButton();
        pnlModelo = new javax.swing.JPanel();
        lblTituloPanel2 = new javax.swing.JLabel();
        lblModelo2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        brdModelo = new javax.swing.JSeparator();
        btnSalvarModelo = new javax.swing.JButton();
        btnCancelarModelo = new javax.swing.JButton();
        lblModelo1 = new javax.swing.JLabel();
        cbxMarca1 = new javax.swing.JComboBox<>();
        pnlVeiculo = new javax.swing.JPanel();
        lblTituloPanel1 = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        brdAno = new javax.swing.JSeparator();
        btnSalvarVeiculo = new javax.swing.JButton();
        btnCancelarVeiculo = new javax.swing.JButton();
        lblModelo = new javax.swing.JLabel();
        cbxModelo = new javax.swing.JComboBox<>();
        lblModelo3 = new javax.swing.JLabel();
        cbxMarca2 = new javax.swing.JComboBox<>();
        lblPortas = new javax.swing.JLabel();
        cbxPortas = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(244, 244, 244));
        setBorder(null);

        Scroll.setBackground(new java.awt.Color(234, 234, 234));
        Scroll.setBorder(null);
        Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Fundo.setBackground(new java.awt.Color(244, 244, 244));
        Fundo.setLayout(new java.awt.GridBagLayout());

        FundoNovo.setBackground(new java.awt.Color(249, 249, 249));
        FundoNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        FundoNovo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloFrame.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        lblTituloFrame.setForeground(new java.awt.Color(45, 47, 61));
        lblTituloFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloFrame.setText("SELECIONE A AÇÃO QUE DESEJA");
        FundoNovo.add(lblTituloFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1000, -1));

        pnlFundoOpt.setBackground(new java.awt.Color(209, 222, 244));
        pnlFundoOpt.setLayout(new java.awt.GridLayout(1, 0));

        btnNovaMarca.setBackground(new java.awt.Color(103, 148, 192));
        btnNovaMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnNovaMarca.png"))); // NOI18N
        btnNovaMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 122, 160)));
        btnNovaMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaMarca.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnNovaMarcaHover.png"))); // NOI18N
        btnNovaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaMarcaActionPerformed(evt);
            }
        });
        pnlFundoOpt.add(btnNovaMarca);

        btnNovoModelo.setBackground(new java.awt.Color(103, 148, 192));
        btnNovoModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnNovoModelo.png"))); // NOI18N
        btnNovoModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 122, 160)));
        btnNovoModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoModelo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnNovoModeloHover.png"))); // NOI18N
        btnNovoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoModeloActionPerformed(evt);
            }
        });
        pnlFundoOpt.add(btnNovoModelo);

        btnNovoVeiculo.setBackground(new java.awt.Color(103, 148, 192));
        btnNovoVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnNovoVeiculo.png"))); // NOI18N
        btnNovoVeiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 122, 160)));
        btnNovoVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoVeiculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnNovoVeiculoHover.png"))); // NOI18N
        btnNovoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoVeiculoActionPerformed(evt);
            }
        });
        pnlFundoOpt.add(btnNovoVeiculo);

        FundoNovo.add(pnlFundoOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 790, 50));

        pnlMarca.setBackground(new java.awt.Color(249, 249, 249));
        pnlMarca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPanel.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        lblTituloPanel.setForeground(new java.awt.Color(60, 61, 72));
        lblTituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPanel.setText("NOVA MARCA");
        pnlMarca.add(lblTituloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        lblMarca1.setFont(new java.awt.Font("Lato Black", 0, 12)); // NOI18N
        lblMarca1.setForeground(new java.awt.Color(102, 105, 127));
        lblMarca1.setText("NOME");
        pnlMarca.add(lblMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        txtMarca.setBackground(new java.awt.Color(249, 249, 249));
        txtMarca.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(102, 105, 127));
        txtMarca.setToolTipText("Preencha com o nome completo.");
        txtMarca.setBorder(null);
        txtMarca.setSelectionColor(new java.awt.Color(51, 154, 209));
        txtMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMarcaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMarcaFocusLost(evt);
            }
        });
        pnlMarca.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 230, 30));

        brdMarca.setBackground(new java.awt.Color(68, 88, 178));
        brdMarca.setForeground(new java.awt.Color(249, 249, 249));
        pnlMarca.add(brdMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 250, 10));

        btnSalvarMarca.setBackground(new java.awt.Color(249, 249, 249));
        btnSalvarMarca.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnSalvarMarca.setForeground(new java.awt.Color(50, 87, 138));
        btnSalvarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnSalvar.png"))); // NOI18N
        btnSalvarMarca.setToolTipText("Salva o novo cliente!");
        btnSalvarMarca.setBorder(null);
        btnSalvarMarca.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSalvarMarca.setIconTextGap(6);
        btnSalvarMarca.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSalvarMarca.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnSalvarHover.png"))); // NOI18N
        btnSalvarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMarcaActionPerformed(evt);
            }
        });
        pnlMarca.add(btnSalvarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 120, 30));

        btnCancelarMarca.setBackground(new java.awt.Color(249, 249, 249));
        btnCancelarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnCancelar.png"))); // NOI18N
        btnCancelarMarca.setToolTipText("Cancela todo o progresso.");
        btnCancelarMarca.setBorder(null);
        btnCancelarMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarMarca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarMarca.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnCancelarHover.png"))); // NOI18N
        btnCancelarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMarcaActionPerformed(evt);
            }
        });
        pnlMarca.add(btnCancelarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 120, 30));

        FundoNovo.add(pnlMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 920, 180));

        pnlModelo.setBackground(new java.awt.Color(249, 249, 249));
        pnlModelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPanel2.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        lblTituloPanel2.setForeground(new java.awt.Color(60, 61, 72));
        lblTituloPanel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPanel2.setText("NOVO MODELO");
        pnlModelo.add(lblTituloPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        lblModelo2.setFont(new java.awt.Font("Lato Black", 0, 12)); // NOI18N
        lblModelo2.setForeground(new java.awt.Color(102, 105, 127));
        lblModelo2.setText("MARCA");
        pnlModelo.add(lblModelo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        txtModelo.setBackground(new java.awt.Color(249, 249, 249));
        txtModelo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(102, 105, 127));
        txtModelo.setToolTipText("Preencha com o nome completo.");
        txtModelo.setBorder(null);
        txtModelo.setSelectionColor(new java.awt.Color(51, 154, 209));
        txtModelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModeloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtModeloFocusLost(evt);
            }
        });
        pnlModelo.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 230, 30));

        brdModelo.setBackground(new java.awt.Color(68, 88, 178));
        brdModelo.setForeground(new java.awt.Color(249, 249, 249));
        pnlModelo.add(brdModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 250, 10));

        btnSalvarModelo.setBackground(new java.awt.Color(249, 249, 249));
        btnSalvarModelo.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnSalvarModelo.setForeground(new java.awt.Color(50, 87, 138));
        btnSalvarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnSalvar.png"))); // NOI18N
        btnSalvarModelo.setToolTipText("Salva o novo cliente!");
        btnSalvarModelo.setBorder(null);
        btnSalvarModelo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSalvarModelo.setIconTextGap(6);
        btnSalvarModelo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSalvarModelo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnSalvarHover.png"))); // NOI18N
        btnSalvarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarModeloActionPerformed(evt);
            }
        });
        pnlModelo.add(btnSalvarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 120, 30));

        btnCancelarModelo.setBackground(new java.awt.Color(249, 249, 249));
        btnCancelarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnCancelar.png"))); // NOI18N
        btnCancelarModelo.setToolTipText("Cancela todo o progresso.");
        btnCancelarModelo.setBorder(null);
        btnCancelarModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarModelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarModelo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnCancelarHover.png"))); // NOI18N
        btnCancelarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModeloActionPerformed(evt);
            }
        });
        pnlModelo.add(btnCancelarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 120, 30));

        lblModelo1.setFont(new java.awt.Font("Lato Black", 0, 12)); // NOI18N
        lblModelo1.setForeground(new java.awt.Color(102, 105, 127));
        lblModelo1.setText("NOME");
        pnlModelo.add(lblModelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        cbxMarca1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cbxMarca1.setForeground(new java.awt.Color(102, 105, 127));
        cbxMarca1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxMarca1.setBorder(null);
        pnlModelo.add(cbxMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 190, 30));

        FundoNovo.add(pnlModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 920, 180));

        pnlVeiculo.setBackground(new java.awt.Color(249, 249, 249));
        pnlVeiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPanel1.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        lblTituloPanel1.setForeground(new java.awt.Color(60, 61, 72));
        lblTituloPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPanel1.setText("NOVO VEÍCULO");
        pnlVeiculo.add(lblTituloPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        lblAno.setFont(new java.awt.Font("Lato Black", 0, 12)); // NOI18N
        lblAno.setForeground(new java.awt.Color(102, 105, 127));
        lblAno.setText("ANO");
        pnlVeiculo.add(lblAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        txtAno.setBackground(new java.awt.Color(249, 249, 249));
        txtAno.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtAno.setForeground(new java.awt.Color(102, 105, 127));
        txtAno.setToolTipText("Preencha com o nome completo.");
        txtAno.setBorder(null);
        txtAno.setSelectionColor(new java.awt.Color(51, 154, 209));
        txtAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnoFocusLost(evt);
            }
        });
        pnlVeiculo.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 70, 30));

        brdAno.setBackground(new java.awt.Color(68, 88, 178));
        brdAno.setForeground(new java.awt.Color(249, 249, 249));
        pnlVeiculo.add(brdAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 90, 10));

        btnSalvarVeiculo.setBackground(new java.awt.Color(249, 249, 249));
        btnSalvarVeiculo.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnSalvarVeiculo.setForeground(new java.awt.Color(50, 87, 138));
        btnSalvarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnSalvar.png"))); // NOI18N
        btnSalvarVeiculo.setToolTipText("Salva o novo cliente!");
        btnSalvarVeiculo.setBorder(null);
        btnSalvarVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSalvarVeiculo.setIconTextGap(6);
        btnSalvarVeiculo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSalvarVeiculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnSalvarHover.png"))); // NOI18N
        btnSalvarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVeiculoActionPerformed(evt);
            }
        });
        pnlVeiculo.add(btnSalvarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 120, 30));

        btnCancelarVeiculo.setBackground(new java.awt.Color(249, 249, 249));
        btnCancelarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnCancelar.png"))); // NOI18N
        btnCancelarVeiculo.setToolTipText("Cancela todo o progresso.");
        btnCancelarVeiculo.setBorder(null);
        btnCancelarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarVeiculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buttons/btnCancelarHover.png"))); // NOI18N
        btnCancelarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVeiculoActionPerformed(evt);
            }
        });
        pnlVeiculo.add(btnCancelarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 120, 30));

        lblModelo.setFont(new java.awt.Font("Lato Black", 0, 12)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(102, 105, 127));
        lblModelo.setText("MODELO");
        pnlVeiculo.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        cbxModelo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cbxModelo.setForeground(new java.awt.Color(102, 105, 127));
        cbxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxModelo.setBorder(null);
        pnlVeiculo.add(cbxModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 190, 30));

        lblModelo3.setFont(new java.awt.Font("Lato Black", 0, 12)); // NOI18N
        lblModelo3.setForeground(new java.awt.Color(102, 105, 127));
        lblModelo3.setText("MARCA");
        pnlVeiculo.add(lblModelo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cbxMarca2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cbxMarca2.setForeground(new java.awt.Color(102, 105, 127));
        cbxMarca2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxMarca2.setBorder(null);
        pnlVeiculo.add(cbxMarca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 30));

        lblPortas.setFont(new java.awt.Font("Lato Black", 0, 12)); // NOI18N
        lblPortas.setForeground(new java.awt.Color(102, 105, 127));
        lblPortas.setText("PORTAS");
        pnlVeiculo.add(lblPortas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        cbxPortas.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cbxPortas.setForeground(new java.awt.Color(102, 105, 127));
        cbxPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5" }));
        cbxPortas.setBorder(null);
        pnlVeiculo.add(cbxPortas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 90, 30));

        FundoNovo.add(pnlVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 920, 180));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 22, 24);
        Fundo.add(FundoNovo, gridBagConstraints);

        Scroll.setViewportView(Fundo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaBoxMarca(){
       
        cbxMarca1.removeAllItems();
       
        try {
            listaMarcaVeiculo = marcaVeiculoDao.ListarTodos();

        String dados[][] = new String[listaMarcaVeiculo.size()][2];
        for (MarcaVeiculo marca : listaMarcaVeiculo) {
            cbxMarca1.addItem(marca.getNome());
        }
        } catch (SQLException ex) {
            Logger.getLogger(NovoVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void atualizaBoxModelo(){
       
        cbxMarca1.removeAllItems();
       
        try {
            marcaVeiculoDao = marcaVeiculoDao.buscaMarcaNome(String.valueOf(cbxMarca2.getSelectedItem()));
            listaMarcaVeiculo = marcaVeiculoDao.ListarTodos();

        String dados[][] = new String[listaMarcaVeiculo.size()][2];
        for (MarcaVeiculo marca : listaMarcaVeiculo) {
            cbxMarca1.addItem(marca.getNome());
        }
        } catch (SQLException ex) {
            Logger.getLogger(NovoVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    private void btnNovaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaMarcaActionPerformed
        // Exibe registar marca!
        
        pnlMarca.setVisible(true);
        pnlModelo.setVisible(false);
        pnlVeiculo.setVisible(false);
    }//GEN-LAST:event_btnNovaMarcaActionPerformed

    private void txtMarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarcaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaFocusGained

    private void txtMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarcaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaFocusLost

    private void btnSalvarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMarcaActionPerformed
        if(txtMarca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Existem campos vazios!");
        }
        else{
            MarcaVeiculo marcaveiculo = new MarcaVeiculo();
            marcaveiculo.setNome(txtMarca.getText());
            try {                
                marcaVeiculoDao.salvar(marcaveiculo);
                JOptionPane.showMessageDialog(null, "Cadastrador com sucesso!", "CADASTRO REALIZADO",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(NovoVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
       }
        atualizaBoxMarca();
    }//GEN-LAST:event_btnSalvarMarcaActionPerformed

    private void btnCancelarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMarcaActionPerformed
        pnlMarca.setVisible(false);
    }//GEN-LAST:event_btnCancelarMarcaActionPerformed

    private void txtAnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoFocusGained

    private void txtAnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoFocusLost

    private void btnSalvarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVeiculoActionPerformed
       if(cbxMarca2.getSelectedIndex() == 0 || cbxModelo.getSelectedIndex() == 0
               || txtAno.getText().equals("") || cbxPortas.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Existem campos vazios!");
        }
    }//GEN-LAST:event_btnSalvarVeiculoActionPerformed

    private void btnCancelarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVeiculoActionPerformed
        pnlVeiculo.setVisible(false);
    }//GEN-LAST:event_btnCancelarVeiculoActionPerformed

    private void txtModeloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModeloFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloFocusGained

    private void txtModeloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModeloFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloFocusLost

    private void btnSalvarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarModeloActionPerformed
        if( txtModelo.getText().equals("")){   //cbxMarca1.getSelectedIndex() == 0 ||
            JOptionPane.showMessageDialog(null, "Existem campos vazios!");
        }else{
            ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
            modeloVeiculo.setNome(txtModelo.getText());
            //modeloVeiculo.setIdMarca(Integer.valueOf(cbxMarca1.getSelectedIndex()));
            try {                
                modeloVeiculoDao.salvar(modeloVeiculo);
                JOptionPane.showMessageDialog(null, "Cadastrador com sucesso!", "CADASTRO REALIZADO",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(NovoVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
       }
        
    }//GEN-LAST:event_btnSalvarModeloActionPerformed

    private void btnCancelarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModeloActionPerformed
        pnlModelo.setVisible(false);
    }//GEN-LAST:event_btnCancelarModeloActionPerformed

    private void btnNovoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoModeloActionPerformed
        pnlMarca.setVisible(false);
        pnlModelo.setVisible(true);
        pnlVeiculo.setVisible(false);
        atualizaBoxMarca();
    }//GEN-LAST:event_btnNovoModeloActionPerformed

    private void btnNovoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoVeiculoActionPerformed
        pnlMarca.setVisible(false);
        pnlModelo.setVisible(false);
        pnlVeiculo.setVisible(true);
        atualizaBoxMarca();
        atualizaBoxModelo();
    }//GEN-LAST:event_btnNovoVeiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fundo;
    private javax.swing.JPanel FundoNovo;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JSeparator brdAno;
    private javax.swing.JSeparator brdMarca;
    private javax.swing.JSeparator brdModelo;
    private javax.swing.JButton btnCancelarMarca;
    private javax.swing.JButton btnCancelarModelo;
    private javax.swing.JButton btnCancelarVeiculo;
    private javax.swing.JButton btnNovaMarca;
    private javax.swing.JButton btnNovoModelo;
    private javax.swing.JButton btnNovoVeiculo;
    private javax.swing.JButton btnSalvarMarca;
    private javax.swing.JButton btnSalvarModelo;
    private javax.swing.JButton btnSalvarVeiculo;
    private javax.swing.JComboBox<String> cbxMarca1;
    private javax.swing.JComboBox<String> cbxMarca2;
    private javax.swing.JComboBox<String> cbxModelo;
    private javax.swing.JComboBox<String> cbxPortas;
    private javax.swing.ButtonGroup grpRadioTipo;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblModelo1;
    private javax.swing.JLabel lblModelo2;
    private javax.swing.JLabel lblModelo3;
    private javax.swing.JLabel lblPortas;
    private javax.swing.JLabel lblTituloFrame;
    private javax.swing.JLabel lblTituloPanel;
    private javax.swing.JLabel lblTituloPanel1;
    private javax.swing.JLabel lblTituloPanel2;
    private javax.swing.JPanel pnlFundoOpt;
    private javax.swing.JPanel pnlMarca;
    private javax.swing.JPanel pnlModelo;
    private javax.swing.JPanel pnlVeiculo;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
