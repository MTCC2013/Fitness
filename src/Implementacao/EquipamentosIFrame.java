/*--------------------------- Softness ---------------------------------------
 Rotina: Equipamentos
 Descrição: Janela Cadastro de Equipamentos
 Fonte: Equipamento.java
 @utor: Mayara Oliveira
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacote
package Implementacao;

public class EquipamentosIFrame extends javax.swing.JInternalFrame {

    public EquipamentosIFrame() {
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

    //Código Drag and Drop
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btFecharTelaEquip = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        descricaoEquipamento = new javax.swing.JTextField();
        campoDataFabricacao = new javax.swing.JFormattedTextField();
        labelDataFabricacao = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btSalvarEquip = new javax.swing.JButton();
        btLimparEquip = new javax.swing.JButton();
        checkAtivoEquipamento = new javax.swing.JCheckBox();
        laelFornEquipamento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboFornEquipamento = new javax.swing.JComboBox();
        labelCodEquipamento = new javax.swing.JLabel();
        CodEquipamento = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        campoModelo = new javax.swing.JTextField();
        labelResticoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoObs = new javax.swing.JTextArea();
        comboTipo = new javax.swing.JComboBox();

        setResizable(true);
        setTitle("Cadastro de Equipamentos");
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        btFecharTelaEquip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        btFecharTelaEquip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFecharTelaEquip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFecharTelaEquipMouseClicked(evt);
            }
        });

        labelDescricao.setText("Descrição:");

        try {
            campoDataFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataFabricacao.setText("Data de Fabricação:");

        labelMarca.setText("Marca:");

        btSalvarEquip.setBackground(new java.awt.Color(0, 51, 102));
        btSalvarEquip.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarEquip.setText("Salvar");
        btSalvarEquip.setContentAreaFilled(false);
        btSalvarEquip.setOpaque(true);

        btLimparEquip.setBackground(new java.awt.Color(0, 51, 102));
        btLimparEquip.setForeground(new java.awt.Color(255, 255, 255));
        btLimparEquip.setText("Limpar");
        btLimparEquip.setContentAreaFilled(false);
        btLimparEquip.setOpaque(true);

        checkAtivoEquipamento.setBackground(new java.awt.Color(255, 255, 255));
        checkAtivoEquipamento.setText("Ativo");

        laelFornEquipamento.setText("Fornecedor:");

        jLabel1.setFont(new java.awt.Font("TEC-FONT D Helv", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("CADASTRO DE EQUIPAMENTOS");

        comboFornEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Masculino", "Feminino" }));
        comboFornEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFornEquipamentoActionPerformed(evt);
            }
        });

        labelCodEquipamento.setText("Código:");

        CodEquipamento.setEditable(false);

        labelModelo.setText("Modelo:");

        labelTipo.setText("Tipo:");

        labelResticoes.setText("Observações/ Restrições:");

        campoObs.setColumns(20);
        campoObs.setRows(5);
        jScrollPane1.setViewportView(campoObs);

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Masculino", "Feminino" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btFecharTelaEquip)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btLimparEquip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSalvarEquip))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(labelCodEquipamento)
                                .addGap(388, 388, 388)
                                .addComponent(checkAtivoEquipamento))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 68, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDataFabricacao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(laelFornEquipamento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelResticoes, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(descricaoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                    .addComponent(campoDataFabricacao)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(labelMarca)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(labelModelo))
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                    .addComponent(comboFornEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelTipo)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(2, 2, 2)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(110, 110, 110))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFecharTelaEquip)
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAtivoEquipamento)
                    .addComponent(labelCodEquipamento)
                    .addComponent(CodEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescricao)
                    .addComponent(descricaoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataFabricacao)
                    .addComponent(campoDataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModelo)
                    .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laelFornEquipamento)
                    .addComponent(comboFornEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipo)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelResticoes))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarEquip)
                    .addComponent(btLimparEquip))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(btFecharTelaEquip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(descricaoEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoDataFabricacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelDataFabricacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btSalvarEquip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btLimparEquip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(checkAtivoEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(laelFornEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboFornEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelCodEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CodEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelResticoes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void btFecharTelaEquipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharTelaEquipMouseClicked
        this.dispose();
    }//GEN-LAST:event_btFecharTelaEquipMouseClicked

    private void comboFornEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFornEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFornEquipamentoActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodEquipamento;
    private javax.swing.JLabel btFecharTelaEquip;
    private javax.swing.JButton btLimparEquip;
    private javax.swing.JButton btSalvarEquip;
    private javax.swing.JFormattedTextField campoDataFabricacao;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextArea campoObs;
    private javax.swing.JCheckBox checkAtivoEquipamento;
    private javax.swing.JComboBox comboFornEquipamento;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JTextField descricaoEquipamento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCodEquipamento;
    private javax.swing.JLabel labelDataFabricacao;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelResticoes;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel laelFornEquipamento;
    // End of variables declaration//GEN-END:variables
}
