package br.com.transportadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.transportadora.model.Rastreio;
import br.com.transportadora.repository.RastreioRepository;

@Service
public class RastreioService {

	@Autowired
	private RastreioRepository rastreioRepository;

	@Autowired
	private RastreioRepository codigoRastreioRepository;

	@Transactional(propagation = Propagation.REQUIRED)
	public Rastreio salvar(Rastreio rastreio) {
		return rastreioRepository.save(rastreio);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void excluir(Long id) {
		rastreioRepository.delete(id);
	}

	@Transactional(readOnly = true)
	public List<Rastreio> obterTodos() {
		return rastreioRepository.findAll();
	}
}

