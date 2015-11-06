/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe com ActionListener Cliente
 Fonte: ClienteActionListener.java
 @utor: Mauricio Pires Cardoso
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package br.fitness.classes;

//Importações
import br.fitness.implementacao.ClienteIFrame;
import br.fitness.implementacao.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteActionListener implements ActionListener {

    private ClienteIFrame frameCliente;
    private LoginFrame frameLogin;

    public ClienteActionListener(ClienteIFrame frameCliente) {
        this.frameCliente = frameCliente;
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            Cliente c = frameCliente.getCliente();
            //Login l = frameLogin.getLogin();

            //Verifica Descrição do cliente
            if ("".equals(c.getCli_descricao())) {
                //Gera Log
                String vmsg = "O usuario não informou o nome do cliente.";
                try {
                    Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
                } catch (IOException ex) {
                    Logger.getLogger(ClienteActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            JOptionPane.showMessageDialog(frameCliente, "Dados cadastrados com sucesso!");

            //Gera Log
            String vmsg = "O usuario cadastrou um novo cliente: " + c.getCli_descricao();
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(ClienteActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("limpar".equals(e.getActionCommand())) {
            //Gera Log
            String vmsg = "O usuario limpou os dados da tela de Clientes!";
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(ClienteActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
