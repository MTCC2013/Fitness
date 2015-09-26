/*--------------------------- Softness ---------------------------------------
 Rotina: Cadastros
 Descrição: Janela Cadastro de Cliente
 Fonte: Cliente.java
 @utor: Mauricio Pires Cardoso
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacote
package Implementacao;

import Classes.Professor;
import Classes.ProfessorActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProfessorIFrame extends javax.swing.JInternalFrame {
    
    
   private ProfessorActionListener listenerprof = 
                    new ProfessorActionListener(this);
   
    
    
    public Professor getProfessor(){
        Professor p = new Professor();
       // p.setCodigo(Integer.valueOf(jTextField1.getText()));
       // p.setNome(jTextField2.getText());
        return p;
    }

    public ProfessorIFrame() {
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

        painelDesktop = new javax.swing.JDesktopPane();
        btSair = new javax.swing.JLabel();
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
        Saalvar = new javax.swing.JButton();
        labelEmail = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        campoEmail = new javax.swing.JTextField();
        checkAtivo = new javax.swing.JCheckBox();
        labelTitulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        selectSexo = new javax.swing.JComboBox();
        labelEmail1 = new javax.swing.JLabel();
        labelEndereco1 = new javax.swing.JLabel();
        selectSexo1 = new javax.swing.JComboBox();
        labelEndereco2 = new javax.swing.JLabel();
        labelEndereco3 = new javax.swing.JLabel();
        selectSexo2 = new javax.swing.JComboBox();
        selectSexo3 = new javax.swing.JComboBox();

        setForeground(new java.awt.Color(0, 51, 102));
        setTitle("Cadastro de Professores");
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        setVisible(true);

        painelDesktop.setBackground(new java.awt.Color(255, 255, 255));

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairMouseClicked(evt);
            }
        });

        labelNome.setText("Nome:");

        labelCPF.setText("CPF:");

        labelRG.setText("RG");

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

        labelDatanasc.setText("Data de nascimento: ");

        labelTelefone.setText("Telefoe ");

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

        labelCelular.setText("Celular ");

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

        Saalvar.setBackground(new java.awt.Color(0, 0, 0));
        Saalvar.setForeground(new java.awt.Color(255, 255, 255));
        Saalvar.setText("Salvar");
        Saalvar.setContentAreaFilled(false);
        Saalvar.addActionListener(listenerprof);
        Saalvar.setActionCommand("salvar");
        Saalvar.setOpaque(true);

        labelEmail.setText("E-mail:");

        Cancelar.setBackground(new java.awt.Color(0, 0, 0));
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar ");
        Cancelar.setContentAreaFilled(false);
        Cancelar.addActionListener(listenerprof);
        Cancelar.setActionCommand("limpar");
        Cancelar.setOpaque(true);
        /*
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        checkAtivo.setBackground(new java.awt.Color(255, 255, 255));
        checkAtivo.setText("Ativo");

        labelTitulo.setFont(new java.awt.Font("TEC-FONT D Helv", 1, 14)); // NOI18N
        labelTitulo.setText("PROFESSOR");

        labelCodigo.setText("Código:");

        campoCodigo.setEditable(false);

        selectSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Masculino", "Feminino" }));
        selectSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSexoActionPerformed(evt);
            }
        });

        labelEmail1.setText("Sexo:");

        labelEndereco1.setText("Carga Horária:");

        selectSexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Masculino", "Feminino" }));
        selectSexo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSexo1ActionPerformed(evt);
            }
        });

        labelEndereco2.setText("Área da atuação:");

        labelEndereco3.setText("Base Salarial:");

        selectSexo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Masculino", "Feminino" }));
        selectSexo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSexo2ActionPerformed(evt);
            }
        });

        selectSexo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Masculino", "Feminino" }));
        selectSexo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSexo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDesktopLayout = new javax.swing.GroupLayout(painelDesktop);
        painelDesktop.setLayout(painelDesktopLayout);
        painelDesktopLayout.setHorizontalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopLayout.createSequentialGroup()
                        .addComponent(btSair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopLayout.createSequentialGroup()
                        .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDesktopLayout.createSequentialGroup()
                                .addComponent(Cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(Saalvar)))
                        .addGap(112, 112, 112))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopLayout.createSequentialGroup()
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDesktopLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jSeparator1))
                    .addGroup(painelDesktopLayout.createSequentialGroup()
                        .addGap(11, 107, Short.MAX_VALUE)
                        .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelDesktopLayout.createSequentialGroup()
                                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEndereco)
                                    .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEmail1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEndereco1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoEmail)
                                        .addComponent(campoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                                    .addGroup(painelDesktopLayout.createSequentialGroup()
                                        .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(selectSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(selectSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(69, 69, 69)
                                        .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelEndereco2)
                                            .addComponent(labelEndereco3))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(selectSexo3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(selectSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(painelDesktopLayout.createSequentialGroup()
                                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDatanasc)
                                    .addComponent(labelCPF)
                                    .addComponent(labelNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopLayout.createSequentialGroup()
                                            .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelRG)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(painelDesktopLayout.createSequentialGroup()
                                            .addComponent(campoDtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(labelTelefone)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labelCelular)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(painelDesktopLayout.createSequentialGroup()
                                .addComponent(labelCodigo)
                                .addGap(388, 388, 388)
                                .addComponent(checkAtivo))
                            .addGroup(painelDesktopLayout.createSequentialGroup()
                                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)))))
                .addGap(110, 110, 110))
        );
        painelDesktopLayout.setVerticalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSair)
                .addGap(53, 53, 53)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAtivo)
                    .addComponent(labelCodigo)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(labelRG)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDatanasc)
                    .addComponent(labelTelefone)
                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCelular)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail1)
                    .addComponent(selectSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndereco2)
                    .addComponent(selectSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelEndereco1)
                        .addComponent(labelEndereco3)
                        .addComponent(selectSexo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Saalvar))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        painelDesktop.setLayer(btSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(campoNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(campoDtnasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelDatanasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(campoTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(campoCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(campoCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(campoRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(campoEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(Saalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(Cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        */
        painelDesktop.setLayer(campoEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(checkAtivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(campoCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(selectSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelEmail1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelEndereco1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(selectSexo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelEndereco2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(labelEndereco3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(selectSexo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDesktop.setLayer(selectSexo3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_btSairMouseClicked

    private void campoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCelularActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void campoDtnascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDtnascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDtnascActionPerformed

    private void campoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRGActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed

    private void selectSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSexoActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void selectSexo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSexo1ActionPerformed

    private void selectSexo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSexo2ActionPerformed

    private void selectSexo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSexo3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Saalvar;
    private javax.swing.JLabel btSair;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDatanasc;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEndereco1;
    private javax.swing.JLabel labelEndereco2;
    private javax.swing.JLabel labelEndereco3;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JDesktopPane painelDesktop;
    private javax.swing.JComboBox selectSexo;
    private javax.swing.JComboBox selectSexo1;
    private javax.swing.JComboBox selectSexo2;
    private javax.swing.JComboBox selectSexo3;
    // End of variables declaration//GEN-END:variables
}
                

        
