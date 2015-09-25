
package Classes;

import java.util.Date;


/**
 * Implementação da Classe Equipamento
 * @author MayaraOliveira
 */
public class Equipamento {
    
    private int codigoEquip;
    private String descricao;
    private Date dataFabricacao;
    private int codigoUsuario;
    private String marca;
    private String modelo;
    private String fornEquip;
    private String tipo;
    private String observacao;
    private boolean ativo;

    public int getCodigoEquip() {
        return codigoEquip;
    }

    public void setCodigoEquip(int codigoEquip) {
        this.codigoEquip = codigoEquip;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFornEquip() {
        return fornEquip;
    }

    public void setFornEquip(String fornEquip) {
        this.fornEquip = fornEquip;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
    
}
