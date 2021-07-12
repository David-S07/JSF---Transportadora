package br.com.agendajuiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agendajuiz.model.Compromisso;

@Repository
public interface CompromissoRepository extends JpaRepository<Compromisso, Long> {
}
