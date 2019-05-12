package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.ModLocal2;
import br.embrapa.model.pk.ModLocal2_PK;
import br.embrapa.repository.consultas.ModLocal2RepositoryQuery;

public interface ModLocal2Repository extends JpaRepository<ModLocal2, ModLocal2_PK>, ModLocal2RepositoryQuery {

}
