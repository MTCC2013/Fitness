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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipamentoActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //private EquipamentoIFrame frameEquipamento;

    /*public EquipamentoActionListener(EquipamentoIFrame frameEquipamento) {
        this.frameEquipamento = frameEquipamento;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            Equipamento e = frameEquipamento.getEquipamento();
            JOptionPane.showMessageDialog(frameEquipamento, "Dados cadastrados!");
        } else if ("limpar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(frameEquipamento, "Clicou em cancelar!");
        }
    }*/
}
