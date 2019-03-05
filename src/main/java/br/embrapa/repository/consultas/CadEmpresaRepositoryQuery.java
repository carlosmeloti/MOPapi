package br.embrapa.repository.consultas;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.embrapa.model.CadEmpresa;
import br.embrapa.repository.filter.CadEmpresaFilter;

public interface CadEmpresaRepositoryQuery {

	public Page<CadEmpresa> filtrar(CadEmpresaFilter cadEmpresFilter, Pageable pageable);
	
	
}
