package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="d04_local2_m")
public class ModLocal2 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d04_cdlocal2")
	private Long cdLocal2;
	
	@ManyToOne
	@JoinColumn(name="d04_cdlocal1")
	private ModLocal1 cdLocal1;
	
	@ManyToOne
	@JoinColumn(name="d04_cdempresa")
	private CadEmpresa cdEmpresa;
	
	@Column(name="d04_nmlocal2")
	private String nmLocal2;

	public Long getCdLocal2() {
		return cdLocal2;
	}

	public void setCdLocal2(Long cdLocal2) {
		this.cdLocal2 = cdLocal2;
	}

	public ModLocal1 getCdLocal1() {
		return cdLocal1;
	}

	public void setCdLocal1(ModLocal1 cdLocal1) {
		this.cdLocal1 = cdLocal1;
	}

	
	public CadEmpresa getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(CadEmpresa cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmLocal2() {
		return nmLocal2;
	}

	public void setNmLocal2(String nmLocal2) {
		this.nmLocal2 = nmLocal2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdLocal2 == null) ? 0 : cdLocal2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModLocal2 other = (ModLocal2) obj;
		if (cdLocal2 == null) {
			if (other.cdLocal2 != null)
				return false;
		} else if (!cdLocal2.equals(other.cdLocal2))
			return false;
		return true;
	}
	
	
	
}
