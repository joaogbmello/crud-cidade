package br.edu.utfpr.cruds.cidades.repository;

import br.edu.utfpr.cruds.cidades.cidade.CidadeEntidade;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface CidadeRepository extends JpaRepository<CidadeEntidade, Long> {
    public Optional<CidadeEntidade> findByNomeAndEstado(String nome, String estado);
}

