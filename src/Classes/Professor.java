
package Classes;

import java.util.Date;


/**
 *
 * @author Daiara
 */
public class Professor {
    
     private int codigoProfessor;
    private String nome;
    private String CPF;
    private String RG;
    private  Date datanacimento;
    private String celular;
    private String telefone;
    private String enereço;
    private String email;
    private String sexo;
    private String area;
    private String basesalarial;  

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getDatanacimento() {
        return datanacimento;
    }

    public void setDatanacimento(Date datanacimento) {
        this.datanacimento = datanacimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnereço() {
        return enereço;
    }

    public void setEnereço(String enereço) {
        this.enereço = enereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBasesalarial() {
        return basesalarial;
    }

    public void setBasesalarial(String basesalarial) {
        this.basesalarial = basesalarial;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    private boolean ativo;
    
}
