/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe com ActionListener Login
 Fonte: LoginActionListener.java
 @utor: Mauricio Pires Cardoso
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package Classes;

//Importações
import Implementacao.ClienteIFrame;
import Implementacao.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginActionListener implements ActionListener {

  
    private LoginFrame frameLogin;

    public LoginActionListener(LoginFrame frameLogin) {
        this.frameLogin = frameLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {       
            Login l = frameLogin.getLogin();

            //Verifica Descrição do cliente
            if ("".equals(l.getLgn_usuario())) {
                //Gera Log
                String vmsg = "O usuário " + l.getLgn_usuario() + " não informou o nome do cliente ";
                try {
                    Log.Log(vmsg, "./src/Logs/Softness_log.txt");
                } catch (IOException ex) {
                    Logger.getLogger(LoginActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            JOptionPane.showMessageDialog(frameLogin, "Dados cadastrados!");

            //Gera Log
            String vmsg = "O Usuário " + l.getLgn_usuario() + " cadastrou um novo cliente:  " + l.getLgn_usuario();
            try {
                Log.Log(vmsg, "./src/Logs/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(LoginActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("limpar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(frameLogin, "Clicou em cancelar!");
        }
    }
}
