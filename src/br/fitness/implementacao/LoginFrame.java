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
import br.fitness.classes.LoginActionListener;

//Classe Login
public class LoginFrame extends javax.swing.JFrame {

    private LoginActionListener listenerlogin = new LoginActionListener(this);
    
    public Login getLogin() {
        Login l = new Login();
        l.setLgn_usuario(campoUsuarioLogin.getText());
        l.setLgn_senha(campoSenhaLogin.getText());
        return l;
    }

    public Login setLogin() {
        Login l = new Login();
        return l;
    }

    public LoginFrame() {

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
        logotipoLogin = new javax.swing.JLabel();
        labelSenhaLogin = new javax.swing.JLabel();
        labelUsuarioLogin1 = new javax.swing.JLabel();
        campoUsuarioLogin = new javax.swing.JTextField();
        botaoAcessarLogin = new javax.swing.JButton();
        botaoCancelarLogin = new javax.swing.JButton();
        campoSenhaLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SOFTNESS");

        painelBackground.setBackground(new java.awt.Color(255, 255, 255));

        logotipoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/LogoPequeno.jpg"))); // NOI18N

        labelSenhaLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenhaLogin.setText("Senha:");

        labelUsuarioLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuarioLogin1.setText("Usuário:");

        campoUsuarioLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botaoAcessarLogin.setBackground(new java.awt.Color(0, 51, 102));
        botaoAcessarLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoAcessarLogin.setText("Acessar");
        botaoAcessarLogin.setContentAreaFilled(false);
        botaoAcessarLogin.setOpaque(true);
        //Nova ActionListener
        botaoAcessarLogin.addActionListener(listenerlogin);
        botaoAcessarLogin.setActionCommand("acessar");
        botaoAcessarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessarLoginActionPerformed(evt);
            }
        });
        botaoAcessarLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoAcessarLoginKeyPressed(evt);
            }
        });

        botaoCancelarLogin.setBackground(new java.awt.Color(0, 51, 102));
        botaoCancelarLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarLogin.setText("Cancelar");
        botaoCancelarLogin.setContentAreaFilled(false);
        botaoCancelarLogin.setOpaque(true);
        //Nova ActionListener
        botaoCancelarLogin.addActionListener(listenerlogin);
        botaoCancelarLogin.setActionCommand("cancelar");
        botaoCancelarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarLoginActionPerformed(evt);
            }
        });

        campoSenhaLogin.setPreferredSize(new java.awt.Dimension(6, 23));

        javax.swing.GroupLayout painelBackgroundLayout = new javax.swing.GroupLayout(painelBackground);
        painelBackground.setLayout(painelBackgroundLayout);
        painelBackgroundLayout.setHorizontalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                        .addComponent(botaoCancelarLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAcessarLogin))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSenhaLogin)
                            .addComponent(labelUsuarioLogin1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoUsuarioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(campoSenhaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addComponent(logotipoLogin)
                .addContainerGap())
        );
        painelBackgroundLayout.setVerticalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                        .addComponent(logotipoLogin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsuarioLogin1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSenhaLogin)
                            .addComponent(campoSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoAcessarLogin)
                            .addComponent(botaoCancelarLogin))
                        .addGap(39, 39, 39))))
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

    private void botaoCancelarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarLoginActionPerformed
        //Sair do sistema
        System.exit(0);
    }//GEN-LAST:event_botaoCancelarLoginActionPerformed

    private void botaoAcessarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAcessarLoginActionPerformed
        
    }//GEN-LAST:event_botaoAcessarLoginActionPerformed

    private void botaoAcessarLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoAcessarLoginKeyPressed

    }//GEN-LAST:event_botaoAcessarLoginKeyPressed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAcessarLogin;
    private javax.swing.JButton botaoCancelarLogin;
    private javax.swing.JPasswordField campoSenhaLogin;
    private javax.swing.JTextField campoUsuarioLogin;
    private javax.swing.JLabel labelSenhaLogin;
    private javax.swing.JLabel labelUsuarioLogin1;
    private javax.swing.JLabel logotipoLogin;
    private javax.swing.JPanel painelBackground;
    // End of variables declaration//GEN-END:variables
}
