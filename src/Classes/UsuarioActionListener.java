
package Classes;

import Implementacao.UsuarioIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * Classe que implementa a interação da classe 
 * Usuario com a Interface Usuario
 * @author MayaraOliveira
 */
public class UsuarioActionListener implements ActionListener {
    
    //Declaração de váriavel do tipo
    //UsuarioIFrame
    
    private UsuarioIFrame frameUsuario;
    
    //Construtor
    
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
