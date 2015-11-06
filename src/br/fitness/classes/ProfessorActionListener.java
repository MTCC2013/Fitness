/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Professor
 Fonte: ProfessorActionListener.java
 @utor: Daiara Paes da Rosa
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package br.fitness.classes;

//Importações
import br.fitness.implementacao.ProfessorIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProfessorActionListener implements ActionListener {

    private ProfessorIFrame frameProfessor;

    public ProfessorActionListener(ProfessorIFrame frameProfessor) {
        this.frameProfessor = frameProfessor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            Professor c = frameProfessor.getProfessor();
            //Login l = frameLogin.getLogin();

            //Verifica Descrição do cliente
            if ("".equals(c.getPrf_nome())) {
                //Gera Log
                String vmsg = "O usuario não informou o nome do professor.";
                
                JOptionPane.showMessageDialog(frameProfessor, "Obrigatório informar descrição do professor!");
                try {
                    Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
                } catch (IOException ex) {
                    Logger.getLogger(ProfessorActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            JOptionPane.showMessageDialog(frameProfessor, "Dados cadastrados com sucesso!");

            //Gera Log
            String vmsg = "O usuario cadastrou um novo professor: " + c.getPrf_nome();
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(ProfessorActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("limpar".equals(e.getActionCommand())) {
            //Gera Log
            String vmsg = "O usuario limpou os dados da tela de professor!";
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(ProfessorActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
