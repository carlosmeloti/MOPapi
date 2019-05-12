package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.embrapa.model.pk.ModLocal3_PK;

@Entity
@Table(name="d05_local3_m")
@IdClass(ModLocal3_PK.class)
public class ModLocal3 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d05_cdlocal3")
	private Long cdLocal3;
		
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="d05_cdempresa", referencedColumnName="d04_cdempresa", foreignKey = @ForeignKey(name="local3_empresa_fk")),
		@JoinColumn(name="d05_cdlocal1", referencedColumnName="d04_cdlocal1",  foreignKey = @ForeignKey(name="local3_empresa_fk")),
		@JoinColumn(name="d05_cdlocal2", referencedColumnName="d04_cdlocal2",  foreignKey = @ForeignKey(name="local3_empresa_fk"))
	})
	private ModLocal2 modLocal2;
	
		
	@Column(name="d05_nmlocal3")
	private String nmLocal3;


	public Long getCdLocal3() {
		return cdLocal3;
	}


	public void setCdLocal3(Long cdLocal3) {
		this.cdLocal3 = cdLocal3;
	}


	public ModLocal2 getModLocal2() {
		return modLocal2;
	}


	public void setModLocal2(ModLocal2 modLocal2) {
		this.modLocal2 = modLocal2;
	}


	public String getNmLocal3() {
		return nmLocal3;
	}


	public void setNmLocal3(String nmLocal3) {
		this.nmLocal3 = nmLocal3;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdLocal3 == null) ? 0 : cdLocal3.hashCode());
		result = prime * result + ((modLocal2 == null) ? 0 : modLocal2.hashCode());
		result = prime * result + ((nmLocal3 == null) ? 0 : nmLocal3.hashCode());
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
		ModLocal3 other = (ModLocal3) obj;
		if (cdLocal3 == null) {
			if (other.cdLocal3 != null)
				return false;
		} else if (!cdLocal3.equals(other.cdLocal3))
			return false;
		if (modLocal2 == null) {
			if (other.modLocal2 != null)
				return false;
		} else if (!modLocal2.equals(other.modLocal2))
			return false;
		if (nmLocal3 == null) {
			if (other.nmLocal3 != null)
				return false;
		} else if (!nmLocal3.equals(other.nmLocal3))
			return false;
		return true;
	}
	
	
	
	

	

}
