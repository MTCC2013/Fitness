

package Classes;

import Implementacao.FornecedorIFrame;
import Implementacao.ProfessorIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
    


    public class FornecedorActionListener 
                implements ActionListener{
    
    private FornecedorIFrame frameFornecedor;
    
    
    public FornecedorActionListener(FornecedorIFrame frameFornecedor) {
      this.frameFornecedor = frameFornecedor;   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("salvar".equals(e.getActionCommand())) {
            Fornecedor f = frameFornecedor.getFornecedor();
            JOptionPane.showMessageDialog(frameFornecedor, "Dados cadastrados!");
        } else if("limpar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(frameFornecedor, "Clicou em cancelar!");
        }
        
    }
    
    
    
}
    

