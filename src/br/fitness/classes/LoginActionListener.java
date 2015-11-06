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
package br.fitness.classes;

//Importações
import br.fitness.implementacao.LoginFrame;
import br.fitness.implementacao.PrincipalFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Properties;

public class LoginActionListener implements ActionListener {

    private LoginFrame frameLogin;

    public LoginActionListener(LoginFrame frameLogin) {
        this.frameLogin = frameLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("acessar".equals(e.getActionCommand())) {

            Login l = frameLogin.getLogin();

            try {
                if (confere(l.getLgn_usuario(), l.getLgn_senha(), new File("./src/br/fitness/password/" + l.getLgn_usuario() + ".txt"))) {
                    //Gera Log
                    try {
                        String vmsg = "O usuario " + l.getLgn_usuario() + " acessou o sistema.";
                        Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
                    } catch (IOException li) {
                        li.printStackTrace();
                    }
                    
                    //Abre janela Principal
                    PrincipalFrame p = new PrincipalFrame();
                    p.setVisible(true);
                    this.frameLogin.dispose();
        
                } else {
                    String vmsg = "Usuario e/ou senha invalida!";
                    
                    JOptionPane.showMessageDialog(null, vmsg);
                    
                    //Gera Log
                    try {                        
                        Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
                    } catch (IOException li) {
                        li.printStackTrace();
                    }
                }
            } catch (Throwable t) {
                t.printStackTrace();
            }
        } else if ("cancelar".equals(e.getActionCommand())) {
            //Gera Log
            try {
                String vmsg = "O usuario cancelou o acesso ao sistema.";
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException l) {
                l.printStackTrace();
            }
        }
    }

    public static boolean confere(String usuario, String senha, File arquivo) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(arquivo));
        String usuarioLido = p.getProperty("usuario");
        String senhaLida = p.getProperty("senha");
        return usuario.equals(usuarioLido) && senha.equals(senhaLida);
    }
}
