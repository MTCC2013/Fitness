

package Classes;

import Implementacao.ProfessorIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
    


    public class ProfessorActionListener 
                implements ActionListener{
    
    private ProfessorIFrame frameProfessor;
    
    
    public ProfessorActionListener(ProfessorIFrame frameProfessor) {
      this.frameProfessor = frameProfessor;   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("salvar".equals(e.getActionCommand())) {
            Professor p = frameProfessor.getProfessor();
            JOptionPane.showMessageDialog(frameProfessor, "Dados cadastrados!");
        } else if("limpar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(frameProfessor, "Clicou em cancelar!");
        }
        
    }
    
    
    
}
    

