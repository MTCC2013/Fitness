/*--------------------------- Softness ---------------------------------------
 Rotina: Acesso
 Descrição: Janela de acesso ao sistema
 Fonte: Login.java
 @utor: Mauricio Pires Cardoso
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacote
package br.fitness.implementacao;

//Importações
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import br.fitness.classes.Login;

//Classe Login
public class ConfigFrame extends javax.swing.JFrame {
   
    public Login getLogin() {
        Login l = new Login();
        l.setLgn_usuario(campoUsuarioLogin.getText());

        return l;
    }

    public Login setLogin() {
        Login l = new Login();
        return l;
    }

    public ConfigFrame() {

        initComponents();

        //Caracteristicas da Janela
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);

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
        jPanel1 = new javax.swing.JPanel();
        labelUsuarioLogin1 = new javax.swing.JLabel();
        campoUsuarioLogin = new javax.swing.JTextField();
        labelSenhaLogin = new javax.swing.JLabel();
        labelSenhaLogin1 = new javax.swing.JLabel();
        labelSenhaLogin2 = new javax.swing.JLabel();
        labelSenhaLogin3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        campoUsuarioLogin1 = new javax.swing.JTextField();
        campoUsuarioLogin2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Softness.Configurações");

        painelBackground.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        labelUsuarioLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuarioLogin1.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuarioLogin1.setText("Configurações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUsuarioLogin1)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelUsuarioLogin1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        campoUsuarioLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoUsuarioLogin.setText("./src/br.fitness.password/");
        campoUsuarioLogin.setEnabled(false);
        campoUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioLoginActionPerformed(evt);
            }
        });

        labelSenhaLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelSenhaLogin.setText("Senhas:");

        labelSenhaLogin1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelSenhaLogin1.setText("Manual:");

        labelSenhaLogin2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelSenhaLogin2.setText("Logs:");

        labelSenhaLogin3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelSenhaLogin3.setText("Diretórios");

        campoUsuarioLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoUsuarioLogin1.setText("./src/br.fitness.documents/");
        campoUsuarioLogin1.setEnabled(false);
        campoUsuarioLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioLogin1ActionPerformed(evt);
            }
        });

        campoUsuarioLogin2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoUsuarioLogin2.setText("./src/br.fitness.log/");
        campoUsuarioLogin2.setEnabled(false);
        campoUsuarioLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioLogin2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBackgroundLayout = new javax.swing.GroupLayout(painelBackground);
        painelBackground.setLayout(painelBackgroundLayout);
        painelBackgroundLayout.setHorizontalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenhaLogin3)
                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelBackgroundLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelSenhaLogin1)
                                    .addComponent(labelSenhaLogin2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoUsuarioLogin2)
                                    .addComponent(campoUsuarioLogin1)))
                            .addGroup(painelBackgroundLayout.createSequentialGroup()
                                .addComponent(labelSenhaLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        painelBackgroundLayout.setVerticalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(labelSenhaLogin3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenhaLogin)
                    .addComponent(campoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenhaLogin1)
                    .addComponent(campoUsuarioLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenhaLogin2)
                    .addComponent(campoUsuarioLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

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

    private void campoUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioLoginActionPerformed

    private void campoUsuarioLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioLogin1ActionPerformed

    private void campoUsuarioLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioLogin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioLogin2ActionPerformed

    //Inicialização
    public static void main(String args[]) {

        //Interface gráfica (Windows)
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfigFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoUsuarioLogin;
    private javax.swing.JTextField campoUsuarioLogin1;
    private javax.swing.JTextField campoUsuarioLogin2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelSenhaLogin;
    private javax.swing.JLabel labelSenhaLogin1;
    private javax.swing.JLabel labelSenhaLogin2;
    private javax.swing.JLabel labelSenhaLogin3;
    private javax.swing.JLabel labelUsuarioLogin1;
    private javax.swing.JPanel painelBackground;
    // End of variables declaration//GEN-END:variables
}
