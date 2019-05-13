package br.embrapa.model.pk;

import java.io.Serializable;

import br.embrapa.model.CadEmpresa;

public class ModLocal1_PK implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	private Long cdLocal1;
	private Long cdEmpresa;
	
	
	public ModLocal1_PK() {
	}


	public ModLocal1_PK(Long cdLocal1, Long cdEmpresa) {
		this.cdLocal1 = cdLocal1;
		this.cdEmpresa = cdEmpresa;
	}


	public Long getCdLocal1() {
		return cdLocal1;
	}


	public void setCdLocal1(Long cdLocal1) {
		this.cdLocal1 = cdLocal1;
	}


	public Long getCdEmpresa() {
		return cdEmpresa;
	}


	public void setCdEmpresa(Long cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}



}
