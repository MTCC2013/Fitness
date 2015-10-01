/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Professor
 Fonte: Professor.java
 @utor: Daiara Paes da Rosa
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package Classes;

//Importações
import java.util.Date;

public class Professor {

    private int prf_codigo;
    private String prf_nome;
    private String prf_cpf;
    private String prf_rg;
    private Date prf_dtnasc;
    private int prf_celular;
    private int prf_telefone;
    private String prf_endereco;
    private String prf_email;
    private int prf_sexo;
    private int prf_area;
    private float prf_basesal;

    public int getPrf_codigo() {
        return prf_codigo;
    }

    public void setPrf_codigo(int prf_codigo) {
        this.prf_codigo = prf_codigo;
    }

    public String getPrf_nome() {
        return prf_nome;
    }

    public void setPrf_nome(String prf_nome) {
        this.prf_nome = prf_nome;
    }

    public String getPrf_cpf() {
        return prf_cpf;
    }

    public void setPrf_cpf(String prf_cpf) {
        this.prf_cpf = prf_cpf;
    }

    public String getPrf_rg() {
        return prf_rg;
    }

    public void setPrf_rg(String prf_rg) {
        this.prf_rg = prf_rg;
    }

    public Date getPrf_dtnasc() {
        return prf_dtnasc;
    }

    public void setPrf_dtnasc(Date prf_dtnasc) {
        this.prf_dtnasc = prf_dtnasc;
    }

    public int getPrf_celular() {
        return prf_celular;
    }

    public void setPrf_celular(int prf_celular) {
        this.prf_celular = prf_celular;
    }

    public int getPrf_telefone() {
        return prf_telefone;
    }

    public void setPrf_telefone(int prf_telefone) {
        this.prf_telefone = prf_telefone;
    }

    public String getPrf_endereco() {
        return prf_endereco;
    }

    public void setPrf_endereco(String prf_endereco) {
        this.prf_endereco = prf_endereco;
    }

    public String getPrf_email() {
        return prf_email;
    }

    public void setPrf_email(String prf_email) {
        this.prf_email = prf_email;
    }

    public int getPrf_sexo() {
        return prf_sexo;
    }

    public void setPrf_sexo(int prf_sexo) {
        this.prf_sexo = prf_sexo;
    }

    public int getPrf_area() {
        return prf_area;
    }

    public void setPrf_area(int prf_area) {
        this.prf_area = prf_area;
    }

    public float getPrf_basesal() {
        return prf_basesal;
    }

    public void setPrf_basesal(float prf_basesal) {
        this.prf_basesal = prf_basesal;
    }
}
