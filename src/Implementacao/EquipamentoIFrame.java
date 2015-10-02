/*--------------------------- Softness ---------------------------------------
 Rotina: Equipamento
 Descrição: Janela Cadastro de Usuario do Sistema
 Fonte: Equipamento.java
 @utor: Mayara Oliveira
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacote
package Implementacao;

import Classes.Equipamento;
import Classes.EquipamentoActionListener;

public class EquipamentoIFrame extends javax.swing.JInternalFrame {

    private EquipamentoActionListener listenerusuario = new EquipamentoActionListener(this);

    public Equipamento getEquipamento() {
        Equipamento e = new Equipamento();
        return e;
    }

    public Equipamento setEquipamento() {
        Equipamento e = new Equipamento();
        return e;
    }

    public EquipamentoIFrame() {
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
        labelNomeUsuario = new javax.swing.JLabel();
        campoNomeUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btSalvarUsuario = new javax.swing.JButton();
        labelEmailUsuario = new javax.swing.JLabel();
        btLimparUsuario = new javax.swing.JButton();
        checkAtivoUsuario = new javax.swing.JCheckBox();
        labeAcessoUsuario = new javax.swing.JLabel();
        tituloUsuarios = new javax.swing.JLabel();
        comboNivelUsuario = new javax.swing.JComboBox();
        labelCodUsuario = new javax.swing.JLabel();
        codUsuario = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        labelEmailUsuario1 = new javax.swing.JLabel();
        labelEmailUsuario2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        comboNivelUsuario1 = new javax.swing.JComboBox();
        labeAcessoUsuario1 = new javax.swing.JLabel();
        labeAcessoUsuario2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setResizable(true);
        setTitle("Cadastro de Usuários");
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

        labelNomeUsuario.setText("Descrição:");

        btSalvarUsuario.setBackground(new java.awt.Color(0, 51, 102));
        btSalvarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarUsuario.setText("Salvar");
        btSalvarUsuario.setContentAreaFilled(false);
        btSalvarUsuario.setOpaque(true);
        //Nova ActionListener
        btSalvarUsuario.addActionListener(listenerusuario);
        btSalvarUsuario.setActionCommand("salvar");

        labelEmailUsuario.setText("Data de Fabricação:");

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

        checkAtivoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        checkAtivoUsuario.setText("Ativo");

        labeAcessoUsuario.setText("Fornecedor:");

        tituloUsuarios.setFont(new java.awt.Font("TEC-FONT D Helv", 1, 14)); // NOI18N
        tituloUsuarios.setForeground(new java.awt.Color(0, 51, 102));
        tituloUsuarios.setText("CADASTRO DE EQUIPAMENTOS");

        comboNivelUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "001 - Powerfit" }));
        comboNivelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNivelUsuarioActionPerformed(evt);
            }
        });

        labelCodUsuario.setText("Código:");

        codUsuario.setEditable(false);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelEmailUsuario1.setText("Marca:");

        labelEmailUsuario2.setText("Modelo:");

        comboNivelUsuario1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "001 - Academia" }));
        comboNivelUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNivelUsuario1ActionPerformed(evt);
            }
        });

        labeAcessoUsuario1.setText("Tipo:");

        labeAcessoUsuario2.setText("Observações:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 798, Short.MAX_VALUE)
                .addComponent(btFecharTelaUsuario)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tituloUsuarios)
                        .addGap(125, 125, 125))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labeAcessoUsuario)
                            .addComponent(labelCodUsuario)
                            .addComponent(labelNomeUsuario)
                            .addComponent(labelEmailUsuario)
                            .addComponent(labeAcessoUsuario2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(btLimparUsuario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btSalvarUsuario))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(codUsuario)
                                    .addGap(335, 335, 335)
                                    .addComponent(checkAtivoUsuario))
                                .addComponent(campoNomeUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelEmailUsuario1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelEmailUsuario2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(comboNivelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(labeAcessoUsuario1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboNivelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFecharTelaUsuario)
                .addGap(34, 34, 34)
                .addComponent(tituloUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAtivoUsuario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCodUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailUsuario)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmailUsuario1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmailUsuario2))
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeAcessoUsuario)
                    .addComponent(comboNivelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeAcessoUsuario1)
                    .addComponent(comboNivelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeAcessoUsuario2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarUsuario)
                    .addComponent(btLimparUsuario))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(btFecharTelaUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelNomeUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoNomeUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btSalvarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelEmailUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btLimparUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(checkAtivoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labeAcessoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tituloUsuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboNivelUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelCodUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(codUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jFormattedTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelEmailUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelEmailUsuario2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboNivelUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labeAcessoUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labeAcessoUsuario2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void comboNivelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNivelUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNivelUsuarioActionPerformed

    private void btFecharTelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharTelaUsuarioMouseClicked
        this.dispose();
    }//GEN-LAST:event_btFecharTelaUsuarioMouseClicked

    private void btLimparUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparUsuarioActionPerformed


    }//GEN-LAST:event_btLimparUsuarioActionPerformed

    private void comboNivelUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNivelUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNivelUsuario1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btFecharTelaUsuario;
    private javax.swing.JButton btLimparUsuario;
    private javax.swing.JButton btSalvarUsuario;
    private javax.swing.JTextField campoNomeUsuario;
    private javax.swing.JCheckBox checkAtivoUsuario;
    private javax.swing.JTextField codUsuario;
    private javax.swing.JComboBox comboNivelUsuario;
    private javax.swing.JComboBox comboNivelUsuario1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labeAcessoUsuario;
    private javax.swing.JLabel labeAcessoUsuario1;
    private javax.swing.JLabel labeAcessoUsuario2;
    private javax.swing.JLabel labelCodUsuario;
    private javax.swing.JLabel labelEmailUsuario;
    private javax.swing.JLabel labelEmailUsuario1;
    private javax.swing.JLabel labelEmailUsuario2;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel tituloUsuarios;
    // End of variables declaration//GEN-END:variables
}
