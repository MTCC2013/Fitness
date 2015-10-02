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
package Implementacao;

import Classes.Fornecedor;
import Classes.FornecedorActionListener;

public class FornecedorIFrame extends javax.swing.JInternalFrame {

    private FornecedorActionListener listenerusuario = new FornecedorActionListener(this);

    public Fornecedor getFornecedor() {
        Fornecedor f = new Fornecedor();
        return f;
    }

    public Fornecedor setFornecedor() {
        Fornecedor f = new Fornecedor();
        return f;
    }

    public FornecedorIFrame() {
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
        btFecharTelaUsuario = new javax.swing.JLabel();
        btSalvarUsuario = new javax.swing.JButton();
        btLimparUsuario = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        labelRG = new javax.swing.JLabel();
        campoDtnasc = new javax.swing.JFormattedTextField();
        labelDatanasc = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        labelCelular = new javax.swing.JLabel();
        campoCelular = new javax.swing.JFormattedTextField();
        campoCPF = new javax.swing.JFormattedTextField();
        campoRG = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelEndereco = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        campoEndereco = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        checkAtivo = new javax.swing.JCheckBox();
        labelTitulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();

        setResizable(true);
        setTitle("Cadastro de Fornecedor");
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(840, 471));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        btFecharTelaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        btFecharTelaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFecharTelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFecharTelaUsuarioMouseClicked(evt);
            }
        });

        btSalvarUsuario.setBackground(new java.awt.Color(0, 51, 102));
        btSalvarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarUsuario.setText("Salvar");
        btSalvarUsuario.setContentAreaFilled(false);
        btSalvarUsuario.setOpaque(true);
        //Nova ActionListener
        btSalvarUsuario.addActionListener(listenerusuario);
        btSalvarUsuario.setActionCommand("salvar");

        btLimparUsuario.setBackground(new java.awt.Color(0, 51, 102));
        btLimparUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btLimparUsuario.setText("Limpar");
        btLimparUsuario.setContentAreaFilled(false);
        btLimparUsuario.setOpaque(true);
        //Nova ActionListener
        btLimparUsuario.addActionListener(listenerusuario);
        btLimparUsuario.setActionCommand("limpar");

        /*
        btLimparUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparUsuarioActionPerformed(evt);
            }
        });
        */

        labelNome.setText("Nome:");

        labelCPF.setText("CNPJ:");

        labelRG.setText("IE");

        try {
            campoDtnasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDtnasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDtnascActionPerformed(evt);
            }
        });

        labelDatanasc.setText("Contato:");

        labelTelefone.setText("Cidade");

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });

        labelCelular.setText("UF");

        try {
            campoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCelularActionPerformed(evt);
            }
        });

        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##.")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });

        try {
            campoRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRGActionPerformed(evt);
            }
        });

        labelEndereco.setText("Endereço:");

        labelEmail.setText("E-mail:");

        checkAtivo.setBackground(new java.awt.Color(255, 255, 255));
        checkAtivo.setText("Ativo");

        labelTitulo.setFont(new java.awt.Font("TEC-FONT D Helv", 1, 14)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setText("CADASTRO DE FORNECEDOR");

        labelCodigo.setText("Código:");

        campoCodigo.setEditable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 798, Short.MAX_VALUE)
                .addComponent(btFecharTelaUsuario)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEndereco)
                                    .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(campoEmail)
                                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(labelCodigo)
                                .addGap(388, 388, 388)
                                .addComponent(checkAtivo))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDatanasc)
                                    .addComponent(labelCPF)
                                    .addComponent(labelNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                                        .addGap(10, 10, 10)
                                        .addComponent(labelTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelCelular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(112, 112, 112)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btLimparUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvarUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFecharTelaUsuario)
                .addGap(57, 57, 57)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarUsuario)
                    .addComponent(btLimparUsuario))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(btFecharTelaUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btSalvarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btLimparUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoDtnasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelDatanasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(checkAtivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharTelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharTelaUsuarioMouseClicked
        this.dispose();
    }//GEN-LAST:event_btFecharTelaUsuarioMouseClicked

    private void btLimparUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparUsuarioActionPerformed


    }//GEN-LAST:event_btLimparUsuarioActionPerformed

    private void campoDtnascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDtnascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDtnascActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCelularActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed

    private void campoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRGActionPerformed


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
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
