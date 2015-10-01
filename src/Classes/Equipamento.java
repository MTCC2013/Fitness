/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Equipamento
 Fonte: Equipamento.java
 @utor: Mayara Freitas de Oliveira
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package Classes;

//Importações
import java.util.Date;

public class Equipamento {
    
    private int eqp_codigo;
    private String eqp_descricao;
    private Date eqp_dtfabricacao;
    private int usu_codigo;
    private String eqp_marca;
    private String eqp_modelo;
    private int for_codigo;
    private int eqp_tipo;
    private String eqp_obs;
    private boolean eqp_ativo;

    public int getEqp_codigo() {
        return eqp_codigo;
    }

    public void setEqp_codigo(int eqp_codigo) {
        this.eqp_codigo = eqp_codigo;
    }

    public String getEqp_descricao() {
        return eqp_descricao;
    }

    public void setEqp_descricao(String eqp_descricao) {
        this.eqp_descricao = eqp_descricao;
    }

    public Date getEqp_dtfabricacao() {
        return eqp_dtfabricacao;
    }

    public void setEqp_dtfabricacao(Date eqp_dtfabricacao) {
        this.eqp_dtfabricacao = eqp_dtfabricacao;
    }

    public int getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(int usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getEqp_marca() {
        return eqp_marca;
    }

    public void setEqp_marca(String eqp_marca) {
        this.eqp_marca = eqp_marca;
    }

    public String getEqp_modelo() {
        return eqp_modelo;
    }

    public void setEqp_modelo(String eqp_modelo) {
        this.eqp_modelo = eqp_modelo;
    }

    public int getFor_codigo() {
        return for_codigo;
    }

    public void setFor_codigo(int for_codigo) {
        this.for_codigo = for_codigo;
    }

    public int getEqp_tipo() {
        return eqp_tipo;
    }

    public void setEqp_tipo(int eqp_tipo) {
        this.eqp_tipo = eqp_tipo;
    }

    public String getEqp_obs() {
        return eqp_obs;
    }

    public void setEqp_obs(String eqp_obs) {
        this.eqp_obs = eqp_obs;
    }

    public boolean isEqp_ativo() {
        return eqp_ativo;
    }

    public void setEqp_ativo(boolean eqp_ativo) {
        this.eqp_ativo = eqp_ativo;
    }
    
    
}
