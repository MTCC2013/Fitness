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
import javax.swing.JOptionPane;

public class UsuarioActionListener implements ActionListener {
       
    private UsuarioIFrame frameUsuario;
    
    public UsuarioActionListener (UsuarioIFrame frameUsuario){
        this.frameUsuario = frameUsuario;    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if("salvar".equals(ae.getActionCommand())) {
            Usuario u = frameUsuario.getUsuario();
            JOptionPane.showMessageDialog(frameUsuario, "Dados cadastrados!");
        } else if("limpar".equals(ae.getActionCommand())) {
            Usuario u = frameUsuario.setUsuario();
            JOptionPane.showMessageDialog(frameUsuario, "Ok!");
        }       
    }    
}
