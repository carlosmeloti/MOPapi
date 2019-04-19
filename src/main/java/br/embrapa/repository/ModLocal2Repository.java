package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.ModLocal2;
import br.embrapa.repository.consultas.ModLocal2RepositoryQuery;

public interface ModLocal2Repository extends JpaRepository<ModLocal2, Long>, ModLocal2RepositoryQuery {

}
