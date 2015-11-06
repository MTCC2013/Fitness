/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe com ActionListener Fornecedor
 Fonte: FornecedorActionListener.java
 @utor: Daiara Paes da Rosa
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package br.fitness.classes;

//Importações
import br.fitness.implementacao.FornecedorIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FornecedorActionListener implements ActionListener {

    private FornecedorIFrame frameFornecedor;

    public FornecedorActionListener(FornecedorIFrame frameFornecedor) {
        this.frameFornecedor = frameFornecedor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("salvar".equals(e.getActionCommand())) {
            Fornecedor c = frameFornecedor.getFornecedor();
            //Login l = frameLogin.getLogin();

            //Verifica Descrição do cliente
            if ("".equals(c.getFor_nome())) {
                //Gera Log
                String vmsg = "O usuario não informou o nome do fornecedor.";
                
                JOptionPane.showMessageDialog(frameFornecedor, "Obrigatório informar descrição do fornecedor!");
                try {
                    Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
                } catch (IOException ex) {
                    Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            JOptionPane.showMessageDialog(frameFornecedor, "Dados cadastrados com sucesso!");

            //Gera Log
            String vmsg = "O usuario cadastrou um novo fornecedor: " + c.getFor_nome();
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("limpar".equals(e.getActionCommand())) {
            //Gera Log
            String vmsg = "O usuario limpou os dados da tela de fornecedor!";
            try {
                Log.Log(vmsg, "./src/br/fitness/log/Softness_log.txt");
            } catch (IOException ex) {
                Logger.getLogger(FornecedorActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
