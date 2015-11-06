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
package br.fitness.classes;

//Importações
import br.fitness.implementacao.EquipamentoIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EquipamentoActionListener implements ActionListener {   

    private EquipamentoIFrame frameEquipamento;

    public EquipamentoActionListener(EquipamentoIFrame frameEquipamento) {
        this.frameEquipamento = frameEquipamento;
    }

     @Override
    public void actionPerformed(ActionEvent ae) {
        
        if ("salvar".equals(ae.getActionCommand())) {
            Equipamento c = frameEquipamento.getEquipamento();
            //Login l = frameLogin.getLogin();

            //Verifica Descrição do cliente
            if ("".equals(c.getEqp_descricao())) {
                //Gera Log
                String vmsg = "O usuario não informou o nome do equipamento.";
                
                JOptionPane.showMessageDialog(frameEquipamento, "Obrigatório informar descrição do equipamento!");
                try {
                    Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
                } catch (IOException ex) {
                    Logger.getLogger(EquipamentoActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            JOptionPane.showMessageDialog(frameEquipamento, "Dados cadastrados com sucesso!");

            //Gera Log
            String vmsg = "O usuario cadastrou um novo equipamento: " + c.getEqp_descricao();
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(EquipamentoActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("limpar".equals(ae.getActionCommand())) {
            //Gera Log
            String vmsg = "O usuario limpou os dados da tela de equipamentos!";
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(EquipamentoActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }   
}
