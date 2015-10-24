/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Log
 Fonte: Log.java
 @utor: Mauricio Pires Cardoso
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package Classes;

//Importações
import java.io.FileOutputStream;
import java.io.IOException;

//Classe que cria os log
public class Log {
    //Cria Log de eventos
    public static void Log(String mensagem, String logFile) throws IOException {
        //O segundo parametro "true" indica append para o arquivo em questao.
        FileOutputStream softness_log = new FileOutputStream(logFile, true);

        int tamanho = 0;
        String data = (new java.util.Date()).toString();
        String msg = data + " : " + mensagem + "\n";
        
        while (tamanho < msg.length()) {
            softness_log.write((int) msg.charAt(tamanho++));
        }
        softness_log.flush();
        softness_log.close();
    }
}
