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
@Table(name="d03_local1_m")
public class ModLocal1 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d03_cdlocal1")
	private Long cdlocal1;
	
	@ManyToOne
	@JoinColumn(name="d03_cdempresa")
	private CadEmpresa cadEmpresa;
	
	@Column(name="d03_nmlocal1")
	private String nmlocal1;

	public Long getCdlocal1() {
		return cdlocal1;
	}

	public void setCdlocal1(Long cdlocal1) {
		this.cdlocal1 = cdlocal1;
	}

	public CadEmpresa getCadEmpresa() {
		return cadEmpresa;
	}

	public void setCadEmpresa(CadEmpresa cadEmpresa) {
		this.cadEmpresa = cadEmpresa;
	}

	public String getNmlocal1() {
		return nmlocal1;
	}

	public void setNmlocal1(String nmlocal1) {
		this.nmlocal1 = nmlocal1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdlocal1 == null) ? 0 : cdlocal1.hashCode());
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
		ModLocal1 other = (ModLocal1) obj;
		if (cdlocal1 == null) {
			if (other.cdlocal1 != null)
				return false;
		} else if (!cdlocal1.equals(other.cdlocal1))
			return false;
		return true;
	}
	
	
	
	
}
