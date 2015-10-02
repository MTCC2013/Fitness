/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe com ActionListener Equipamento
 Fonte: EquipamentoActionListener.java
 @utor: Mayara Freitas de Oliveira
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package Classes;

//Importações
import Implementacao.EquipamentoIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EquipamentoActionListener implements ActionListener {   

    private EquipamentoIFrame frameEquipamento;

    public EquipamentoActionListener(EquipamentoIFrame frameEquipamento) {
        this.frameEquipamento = frameEquipamento;
    }

     @Override
    public void actionPerformed(ActionEvent ae) {
        
        if("salvar".equals(ae.getActionCommand())) {
            Equipamento e = frameEquipamento.getEquipamento();
            JOptionPane.showMessageDialog(frameEquipamento, "Dados cadastrados!");
        } else if("limpar".equals(ae.getActionCommand())) {
            Equipamento e = frameEquipamento.setEquipamento();
            JOptionPane.showMessageDialog(frameEquipamento, "Ok!");
        }       
    }   
}
