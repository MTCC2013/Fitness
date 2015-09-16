/*--------------------------- Softness ---------------------------------------
    Rotina: Main
 Descrição: Janela Principal da aplicação
     Fonte: Principal.java
     @utor: Mauricio Pires Cardoso
Observação: 
---------------------------- Alteração ---------------------------------------
Data     Autor          Descrição
-------- -------------- ------------------------------------------------------
------------------------------------------------------------------------------*/

//Pacote
package Implementacao;

//Importações
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import javax.swing.JOptionPane;

//Classe Principal
public class Principal extends javax.swing.JFrame {

    boolean vcont;
    
    //Construtor
    public Principal() {
        initComponents();

        //Caracteristicas da Janela
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        //labelInformacao.setVisible(false);  
        
        //Icone na janela  
        URL url = this.getClass().getResource("/Icones/iconeArea.png");  
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(imagemTitulo); 
    }

    //Código Drag and Drop
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBackground = new javax.swing.JPanel();
        logotipoCentral = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        labelPop = new javax.swing.JLabel();
        labelInformacao = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        arquivo = new javax.swing.JMenu();
        logoff = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();
        cadastro = new javax.swing.JMenu();
        cliente = new javax.swing.JMenuItem();
        professor = new javax.swing.JMenuItem();
        equipamento = new javax.swing.JMenuItem();
        fornecedor = new javax.swing.JMenuItem();
        usuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOFTNESS");

        painelBackground.setBackground(new java.awt.Color(255, 255, 255));

        logotipoCentral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/LogoPequeno.jpg"))); // NOI18N

        labelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/info.png"))); // NOI18N
        labelInfo.setToolTipText("\n");
        labelInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInfoMouseClicked(evt);
            }
        });

        labelPop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pop.png"))); // NOI18N
        labelPop.setToolTipText("Manual de Instruções (HELP)");
        labelPop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPopMouseClicked(evt);
            }
        });

        labelInformacao.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelInformacao.setText("<html><b>Desenvolvido por:</b>Daiara Paes, Mauricio Cardoso, Mayara Oliveira      <b> Data:</b> Setembro/2015       <b>Versão:</b> 1.0");

        javax.swing.GroupLayout painelBackgroundLayout = new javax.swing.GroupLayout(painelBackground);
        painelBackground.setLayout(painelBackgroundLayout);
        painelBackgroundLayout.setHorizontalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(labelPop)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logotipoCentral)
                .addGap(349, 349, 349))
        );
        painelBackgroundLayout.setVerticalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(logotipoCentral)
                .addGap(192, 192, 192)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPop)
                    .addComponent(labelInfo)
                    .addComponent(labelInformacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        arquivo.setText("Arquivo");

        logoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/logoff.png"))); // NOI18N
        logoff.setText("Logoff");
        logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffActionPerformed(evt);
            }
        });
        arquivo.add(logoff);

        sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair.png"))); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        arquivo.add(sair);

        menu.add(arquivo);

        cadastro.setText("Cadastros");

        cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cliente.png"))); // NOI18N
        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        cadastro.add(cliente);

        professor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        professor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/professor.png"))); // NOI18N
        professor.setText("Professor");
        cadastro.add(professor);

        equipamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        equipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/equipamento.png"))); // NOI18N
        equipamento.setText("Equipamento");
        cadastro.add(equipamento);

        fornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fornecedor.png"))); // NOI18N
        fornecedor.setText("Fornecedor");
        fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorActionPerformed(evt);
            }
        });
        cadastro.add(fornecedor);

        usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/usuario.png"))); // NOI18N
        usuario.setText("Usuário");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        cadastro.add(usuario);

        menu.add(cadastro);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffActionPerformed

        //Verifica se o usuário deseja mesmo trocar de usuário
        int aux = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja trocar de usuário?", "LOGOFF", JOptionPane.YES_NO_OPTION);

        if (aux == JOptionPane.YES_OPTION) {
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logoffActionPerformed

    private void fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

        //Verifica se o usuário deseja mesmo sair
        int aux = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "SAIR", JOptionPane.YES_NO_OPTION);

        if (aux == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_sairActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        //Chama cadastro de Cliente
        Cliente cli = new Cliente();
        //painelBackground.add(cli);
        cli.setVisible(true);
    }//GEN-LAST:event_clienteActionPerformed

    private void labelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInfoMouseClicked

        if(vcont == false){
            labelInformacao.setVisible(false);
            vcont = true;
        }else{
            labelInformacao.setVisible(true);
            vcont = false;
        }
    }//GEN-LAST:event_labelInfoMouseClicked

    private void labelPopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPopMouseClicked
        File pdf = new File("C:\\Users\\Mauricio\\Desktop\\Projeto Tópicos\\sofitness\\src\\Documents\\MANUAL DE INSTRUÇÕES SOFTNESS.pdf");
        try {
            Desktop.getDesktop().open(pdf);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao abrir PDF: " + ex);
        }
    }//GEN-LAST:event_labelPopMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu arquivo;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem equipamento;
    private javax.swing.JMenuItem fornecedor;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelInformacao;
    private javax.swing.JLabel labelPop;
    private javax.swing.JMenuItem logoff;
    private javax.swing.JLabel logotipoCentral;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel painelBackground;
    private javax.swing.JMenuItem professor;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem usuario;
    // End of variables declaration//GEN-END:variables
}