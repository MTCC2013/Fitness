/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Usuario
 Fonte: UsuarioActionListener.java
 @utor: Mayara Freitas de Oliveira
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package br.fitness.classes;

//Importações
import br.fitness.implementacao.UsuarioIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioActionListener implements ActionListener {
       
    private UsuarioIFrame frameUsuario;
    
    public UsuarioActionListener (UsuarioIFrame frameUsuario){
        this.frameUsuario = frameUsuario;    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if ("salvar".equals(ae.getActionCommand())) {
            Usuario c = frameUsuario.getUsuario();
            //Login l = frameLogin.getLogin();

            //Verifica Descrição do cliente
            if ("".equals(c.getUsu_nome())) {
                //Gera Log
                String vmsg = "O usuario não informou o nome do usuario.";
                
                JOptionPane.showMessageDialog(frameUsuario, "Obrigatório informar descrição do usuario!");
                try {
                    Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
                } catch (IOException ex) {
                    Logger.getLogger(UsuarioActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            JOptionPane.showMessageDialog(frameUsuario, "Dados cadastrados com sucesso!");

            //Gera Log
            String vmsg = "O usuario cadastrou um novo usuario: " + c.getUsu_nome();
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(UsuarioActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("limpar".equals(ae.getActionCommand())) {
            //Gera Log
            String vmsg = "O usuario limpou os dados da tela de usuario!";
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(UsuarioActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }    
}
