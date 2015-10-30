/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Login
 Fonte: Cliente.java
 @utor: Mauricio Pires Cardoso
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package br.fitness.classes;

//Importações

public class Login {
   
    private String lgn_usuario;
    private String lgn_senha;

    public String getLgn_usuario() {
        return lgn_usuario;
    }

    public void setLgn_usuario(String lgn_usuario) {
        this.lgn_usuario = lgn_usuario;
    }

    public String getLgn_senha() {
        return lgn_senha;
    }

    public void setLgn_senha(String lgn_senha) {
        this.lgn_senha = lgn_senha;
    } 
}
