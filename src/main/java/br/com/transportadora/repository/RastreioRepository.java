package br.com.transportadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.transportadora.model.Compromisso;

@Repository
public interface CompromissoRepository extends JpaRepository<Compromisso, Long> {
}
