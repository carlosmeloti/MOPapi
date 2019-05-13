package br.embrapa.model.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.embrapa.model.ModLocal1;

public class ModLocal2_PK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long cdLocal2;
	private ModLocal1 modLocal1;

	
	public ModLocal2_PK() {
	}


	public ModLocal2_PK(Long cdLocal2, ModLocal1 modLocal1) {
		this.cdLocal2 = cdLocal2;
		this.modLocal1 = modLocal1;
	}


	public Long getCdLocal2() {
		return cdLocal2;
	}


	public void setCdLocal2(Long cdLocal2) {
		this.cdLocal2 = cdLocal2;
	}


	public ModLocal1 getModLocal1() {
		return modLocal1;
	}


	public void setModLocal1(ModLocal1 modLocal1) {
		this.modLocal1 = modLocal1;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	



}
