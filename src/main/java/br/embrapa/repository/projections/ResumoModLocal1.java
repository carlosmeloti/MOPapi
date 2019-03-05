package br.embrapa.repository.projections;

public class ResumoModLocal1 {

	private Long codigo;
	private String nmlocal1;
	
		
	public ResumoModLocal1(Long codigo, String nmlocal1) {
		this.codigo = codigo;
		this.nmlocal1 = nmlocal1;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNmlocal1() {
		return nmlocal1;
	}
	public void setNmlocal1(String nmlocal1) {
		this.nmlocal1 = nmlocal1;
	}
	
	
	
}
