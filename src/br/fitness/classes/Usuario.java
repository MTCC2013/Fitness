/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Usuario
 Fonte: Usuario.java
 @utor: Mayara Freitas de Oliveira
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package br.fitness.classes;

public class Usuario {    
    
    private int usu_codigo;
    private String usu_nome;
    private String usu_email;
    private String usu_nivel;
    private String usu_login;
    private String usu_senha;
    private boolean usu_ativo;

    public int getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(int usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getUsu_nome() {
        return usu_nome;
    }

    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_nivel() {
        return usu_nivel;
    }

    public void setUsu_nivel(String usu_nivel) {
        this.usu_nivel = usu_nivel;
    }

    public String getUsu_login() {
        return usu_login;
    }

    public void setUsu_login(String usu_login) {
        this.usu_login = usu_login;
    }

    public String getUsu_senha() {
        return usu_senha;
    }

    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }

    public boolean isUsu_ativo() {
        return usu_ativo;
    }

    public void setUsu_ativo(boolean usu_ativo) {
        this.usu_ativo = usu_ativo;
    }

    
}
