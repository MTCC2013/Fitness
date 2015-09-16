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
package Implementacao;

//Importações
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

//Classe Login
public class Login extends javax.swing.JFrame {
    
    public Login() {
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
        campoSenhaLogin = new javax.swing.JTextField();
        botaoAcessarLogin = new javax.swing.JButton();
        botaoCancelarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SOFTNESS");

        painelBackground.setBackground(new java.awt.Color(255, 255, 255));

        logotipoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/LogoPequeno.jpg"))); // NOI18N

        labelSenhaLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenhaLogin.setText("Senha:");

        labelUsuarioLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuarioLogin1.setText("Usuário:");

        campoUsuarioLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        campoSenhaLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botaoAcessarLogin.setBackground(new java.awt.Color(0, 51, 102));
        botaoAcessarLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoAcessarLogin.setText("Acessar");
        botaoAcessarLogin.setContentAreaFilled(false);
        botaoAcessarLogin.setOpaque(true);
        botaoAcessarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessarLoginActionPerformed(evt);
            }
        });

        botaoCancelarLogin.setBackground(new java.awt.Color(0, 51, 102));
        botaoCancelarLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarLogin.setText("Cancelar");
        botaoCancelarLogin.setContentAreaFilled(false);
        botaoCancelarLogin.setOpaque(true);
        botaoCancelarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBackgroundLayout = new javax.swing.GroupLayout(painelBackground);
        painelBackground.setLayout(painelBackgroundLayout);
        painelBackgroundLayout.setHorizontalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                        .addComponent(botaoCancelarLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAcessarLogin))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                        .addComponent(labelSenhaLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                        .addComponent(labelUsuarioLogin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(logotipoLogin)
                .addContainerGap())
        );
        painelBackgroundLayout.setVerticalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logotipoLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuarioLogin1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenhaLogin)
                    .addComponent(campoSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAcessarLogin)
                    .addComponent(botaoCancelarLogin))
                .addGap(39, 39, 39))
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
        //Logoff
        this.dispose();
        Principal principal = new Principal();
        principal.setVisible(true);
    }//GEN-LAST:event_botaoAcessarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAcessarLogin;
    private javax.swing.JButton botaoCancelarLogin;
    private javax.swing.JTextField campoSenhaLogin;
    private javax.swing.JTextField campoUsuarioLogin;
    private javax.swing.JLabel labelSenhaLogin;
    private javax.swing.JLabel labelUsuarioLogin1;
    private javax.swing.JLabel logotipoLogin;
    private javax.swing.JPanel painelBackground;
    // End of variables declaration//GEN-END:variables
}
