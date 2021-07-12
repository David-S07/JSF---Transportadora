package br.com.agendajuiz.repository;

import br.com.agendajuiz.model.Compromisso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompromissoRepository extends JpaRepository<Compromisso, Long> {
}
