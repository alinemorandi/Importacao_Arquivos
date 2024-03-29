package model.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import model.domain.Lote;


       	private char tipo;
        private String cpf;
       	private Double valorLimite;
       	private Integer diaVencimentoFatura;
       	private String numeroConta;
        private String numeroLote;
        private String tipolote;
             
	@Override
	public String getTipoLote() {
		return "Conta";
	}
        public void setTipoLote(String lt){
            this.tipolote=lt;
        }

        
	/*public ContaImportacao() {
		super();
	}*/
       
	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
        
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
        
	public Double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(Double valorLimite) {
		this.valorLimite = valorLimite;
	}
        
	public Integer getDiaVencimentoFatura() {
		return diaVencimentoFatura;
	}

	public void setDiaVencimentoFatura(Integer diaVencimentoFatura) {
		this.diaVencimentoFatura = diaVencimentoFatura;
	}
        
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
        public String getLote(){
            return numeroLote;
        }
        public void setLote(String lote) {
            this.numeroLote=lote;
        }
       
	@Override
	public String toString() {
		return "ContaImportacao [tipo=" + tipo + ", cpf=" + cpf + ", valorLimite=" + valorLimite
				+ ", diaVencimentoFatura=" + diaVencimentoFatura + ", numeroConta=" + numeroConta + "]";
	}

    
	
	
	
	

}
