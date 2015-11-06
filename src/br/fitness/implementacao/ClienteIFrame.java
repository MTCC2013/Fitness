/*--------------------------- Softness ---------------------------------------
 Rotina: Usuario
 Descrição: Janela Cadastro de Usuario do Sistema
 Fonte: Usuario.java
 @utor: Mayara Oliveira
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacote
package br.fitness.implementacao;

import br.fitness.classes.Cliente;
import br.fitness.classes.ClienteActionListener;

public class ClienteIFrame extends javax.swing.JInternalFrame {

    private ClienteActionListener listenercliente = new ClienteActionListener(this);

    public Cliente getCliente() {
        Cliente c = new Cliente();
        //c.setCli_codigo(Integer.valueOf(campoCodigo.getText()));
        c.setCli_descricao(campoNome.getText());
        return c;
    }

    public Cliente setCliente() {
        Cliente c = new Cliente();
        return c;
    }

    public ClienteIFrame() {
        initComponents();       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    //Implementação do ActionListener
    //Código Drag and Drop
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btSalvarUsuario = new javax.swing.JButton();
        btLimparUsuario = new javax.swing.JButton();
        labelRG = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        labelDatanasc = new javax.swing.JLabel();
        selectTpcliente = new javax.swing.JComboBox();
        campoCodigo = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JFormattedTextField();
        campoNome = new javax.swing.JTextField();
        labelTpcliente = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        checkAtivo = new javax.swing.JCheckBox();
        campoDtnasc = new javax.swing.JFormattedTextField();
        campoRG = new javax.swing.JFormattedTextField();
        labelCelular = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        labelCodigo = new javax.swing.JLabel();
        selectSexo = new javax.swing.JComboBox();
        sexoLabel = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        campoCelular = new javax.swing.JFormattedTextField();
        labelEndereco = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelUsuarioLogin1 = new javax.swing.JLabel();
        btFecharTelaUsuario = new javax.swing.JLabel();

        setBorder(null);
        setResizable(true);
        setTitle("Softness.Cadastros");
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        setRequestFocusEnabled(false);
        setVisible(true);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        btSalvarUsuario.setBackground(new java.awt.Color(0, 51, 102));
        btSalvarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarUsuario.setText("Salvar");
        btSalvarUsuario.setContentAreaFilled(false);
        btSalvarUsuario.setOpaque(true);
        //Nova ActionListener
        btSalvarUsuario.addActionListener(listenercliente);
        btSalvarUsuario.setActionCommand("salvar");
        btSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarUsuarioActionPerformed(evt);
            }
        });

        btLimparUsuario.setBackground(new java.awt.Color(0, 51, 102));
        btLimparUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btLimparUsuario.setText("Limpar");
        btLimparUsuario.setContentAreaFilled(false);
        btLimparUsuario.setOpaque(true);
        //Nova ActionListener
        btLimparUsuario.addActionListener(listenercliente);
        btLimparUsuario.setActionCommand("limpar");

        /*
        btLimparUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparUsuarioActionPerformed(evt);
            }
        });
        */

        labelRG.setText("RG:");

        labelDatanasc.setText("Data de Nasc.:");

        selectTpcliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Mensalista", "Por Hora/Aula", "Por sessão" }));
        selectTpcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTpclienteActionPerformed(evt);
            }
        });

        campoCodigo.setEditable(false);

        labelCPF.setText("CPF:");

        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##.")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelTpcliente.setText("Tipo de Cliente:");

        labelNome.setText("Nome:");

        labelTelefone.setText("Telefone:");

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        checkAtivo.setBackground(new java.awt.Color(255, 255, 255));
        checkAtivo.setText("Ativo");

        try {
            campoDtnasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelCelular.setText("Celular:");

        labelCodigo.setText("Código:");

        selectSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Masculino", "Feminino" }));
        selectSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSexoActionPerformed(evt);
            }
        });

        sexoLabel.setText("Sexo:");

        labelEmail.setText("E-mail:");

        try {
            campoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelEndereco.setText("Endereço:");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(labelCodigo)
                        .addGap(388, 388, 388)
                        .addComponent(checkAtivo))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDatanasc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelRG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(campoDtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco)
                            .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoEmail)
                                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(selectSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelTpcliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(selectTpcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btLimparUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvarUsuario)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAtivo)
                    .addComponent(labelCodigo)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(labelRG)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDatanasc)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoLabel)
                    .addComponent(selectSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTpcliente)
                    .addComponent(selectTpcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarUsuario)
                    .addComponent(btLimparUsuario))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(btSalvarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btLimparUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelDatanasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(selectTpcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelTpcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(checkAtivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoDtnasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(selectSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(sexoLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        labelUsuarioLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuarioLogin1.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuarioLogin1.setText("Cadastro de Clientes");

        btFecharTelaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/fitness/icon/sair.png"))); // NOI18N
        btFecharTelaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFecharTelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFecharTelaUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUsuarioLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFecharTelaUsuario)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelUsuarioLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(btFecharTelaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharTelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharTelaUsuarioMouseClicked
        this.dispose();
    }//GEN-LAST:event_btFecharTelaUsuarioMouseClicked

    private void btLimparUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparUsuarioActionPerformed


    }//GEN-LAST:event_btLimparUsuarioActionPerformed

    private void selectSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSexoActionPerformed

    private void selectTpclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTpclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectTpclienteActionPerformed

    private void btSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btFecharTelaUsuario;
    private javax.swing.JButton btLimparUsuario;
    private javax.swing.JButton btSalvarUsuario;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JFormattedTextField campoCelular;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JFormattedTextField campoDtnasc;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoRG;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDatanasc;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTpcliente;
    private javax.swing.JLabel labelUsuarioLogin1;
    private javax.swing.JComboBox selectSexo;
    private javax.swing.JComboBox selectTpcliente;
    private javax.swing.JLabel sexoLabel;
    // End of variables declaration//GEN-END:variables
}
