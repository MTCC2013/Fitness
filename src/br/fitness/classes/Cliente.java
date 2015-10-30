/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Cliente
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
import java.util.Date;

public class Cliente {

    private int cli_codigo;
    private String cli_descricao;
    private String cli_cpf;
    private String cli_rg;
    private Date cli_dtnasc;
    private int cli_telefone;
    private int cli_celular;
    private String cli_endereco;
    private String cli_email;
    private int cli_sexo;
    private int cli_tipopagto;
    private boolean ativo;

    public int getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(int cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public String getCli_descricao() {
        return cli_descricao;
    }

    public void setCli_descricao(String cli_descricao) {
        this.cli_descricao = cli_descricao;
    }

    public String getCli_cpf() {
        return cli_cpf;
    }

    public void setCli_cpf(String cli_cpf) {
        this.cli_cpf = cli_cpf;
    }

    public String getCli_rg() {
        return cli_rg;
    }

    public void setCli_rg(String cli_rg) {
        this.cli_rg = cli_rg;
    }

    public Date getCli_dtnasc() {
        return cli_dtnasc;
    }

    public void setCli_dtnasc(Date cli_dtnasc) {
        this.cli_dtnasc = cli_dtnasc;
    }

    public int getCli_telefone() {
        return cli_telefone;
    }

    public void setCli_telefone(int cli_telefone) {
        this.cli_telefone = cli_telefone;
    }

    public int getCli_celular() {
        return cli_celular;
    }

    public void setCli_celular(int cli_celular) {
        this.cli_celular = cli_celular;
    }

    public String getCli_endereco() {
        return cli_endereco;
    }

    public void setCli_endereco(String cli_endereco) {
        this.cli_endereco = cli_endereco;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    public int getCli_sexo() {
        return cli_sexo;
    }

    public void setCli_sexo(int cli_sexo) {
        this.cli_sexo = cli_sexo;
    }

    public int getCli_tipopagto() {
        return cli_tipopagto;
    }

    public void setCli_tipopagto(int cli_tipopagto) {
        this.cli_tipopagto = cli_tipopagto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
