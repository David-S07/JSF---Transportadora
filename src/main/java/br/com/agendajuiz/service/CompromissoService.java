package br.com.agendajuiz.service;

import br.com.agendajuiz.model.Compromisso;
import br.com.agendajuiz.repository.CompromissoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompromissoService {

    @Autowired
    private CompromissoRepository compromissoRepository;
    
    @Transactional(propagation = Propagation.REQUIRED)
    public Compromisso salvar(Compromisso compromisso) {
        return compromissoRepository.save(compromisso);
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void excluir(Long id) {
        compromissoRepository.delete(id);
    }

    @Transactional(readOnly = true)
    public List<Compromisso> obterTodos() {
        return compromissoRepository.findAll();
    }
}
