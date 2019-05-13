package br.embrapa.model.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.embrapa.model.ModLocal2;

public class ModLocal3_PK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		
	private ModLocal2 modLocal2;
	private Long cdLocal3;
	
	public ModLocal3_PK() {
	}



	public ModLocal2 getModLocal2() {
		return modLocal2;
	}


	public void setModLocal2(ModLocal2 modLocal2) {
		this.modLocal2 = modLocal2;
	}

	public Long getCdLocal3() {
		return cdLocal3;
	}


	public void setCdLocal3(Long cdLocal3) {
		this.cdLocal3 = cdLocal3;
	}

	
	
	

	

}
