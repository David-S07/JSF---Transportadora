package br.com.transportadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.transportadora.model.Rastreio;

@Repository
public interface RastreioRepository extends JpaRepository<Rastreio, Long> {
}
