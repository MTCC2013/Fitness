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
package Classes;

//Importações
import Implementacao.ClienteIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ClienteActionListener implements ActionListener {

    private ClienteIFrame frameCliente;

    public ClienteActionListener(ClienteIFrame frameFornecedor) {
        this.frameCliente = frameCliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            Cliente c = frameCliente.getCliente();
            JOptionPane.showMessageDialog(frameCliente, "Dados cadastrados!");
        } else if ("limpar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(frameCliente, "Clicou em cancelar!");
        }
    }
}
