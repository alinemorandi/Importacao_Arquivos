package model.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import model.domain.Lote;

/**
 *
 * @author Aline Morandi
 */

    private char detalhe;
    private String numerodaconta;
    private String nome_inserido_plastico;
    private String cpf;
    private String numero_plastico_gerado;
    private String numeroLote;
    private String tipolote;
    
    public char getDetalhe() {
    return detalhe;
    }

    /**
     * @param detalhe the detalhe to set
     */
    public void setDetalhe(char detalhe) {
        this.detalhe = detalhe;
    }

    /**
     * @return numerodaconta
     */
    
    public String getNumerodaconta() {
        return numerodaconta;
    }

    /**
     * @param numerodaconta the numerodaconta to set
     */
    public void setNumerodaconta(String numerodaconta) {
        this.numerodaconta = numerodaconta;
    }

    /**
     * @return the nome_inserido_plastico
     */
    
    public String getNome_inserido_plastico() {
        return nome_inserido_plastico;
    }

    /**
     * @param nome_inserido_plastico the nome_inserido_plastico to set
     */
    public void setNome_inserido_plastico(String nome_inserido_plastico) {
        this.nome_inserido_plastico = nome_inserido_plastico;
    }

    /**
     * @return the cpf
     */
    
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the numero_plastico_gerado
     */
    public String getNumero_plastico_gerado() {
        return numero_plastico_gerado;
    }

    /**
     * @param numero_plastico_gerado the numero_plastico_gerado to set
     */
    public void setNumero_plastico_gerado(String numero_plastico_gerado) {
        this.numero_plastico_gerado = numero_plastico_gerado;
    }
    
    public String getLote(){
        return numeroLote;
    }
    public void setLote(String lote) {
        this.numeroLote=lote;
    }
    
    public void setTipoLote(String lt){
            this.tipolote=lt;
        }
    @Override
    public String getTipoLote() {
        return "Plastico";
    }
    @Override
	public String toString() {
            return "PlasticoImportacao [ detalhe="+detalhe+", NumeroConta="+numerodaconta+", NomePlastico="+nome_inserido_plastico+", CPF="+cpf+", NumeroPlastico="+numero_plastico_gerado+"]";
        }

    
}
