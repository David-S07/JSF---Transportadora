package br.com.agendajuiz.bean;

import br.com.agendajuiz.model.Compromisso;
import br.com.agendajuiz.service.CompromissoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Component
@Named
@RequestScoped
public class CompromissoBean implements Serializable {

    private Compromisso compromisso;

    @Autowired
    private CompromissoService compromissoService;

    public void salvar() {
        compromisso = compromissoService.salvar(compromisso);
        limpar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Compromisso cadastrado com sucesso"));
    }
    
    public String editar(Compromisso compromisso) {
    	this.compromisso = compromisso;
    	return "/cadastrarCompromisso.xhtml?faces-redirect=true";
    }


    public void excluir(Long id) {
        compromissoService.excluir(id);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Compromisso excluído com sucesso"));
    }

    @PostConstruct
    public void init() {
        limpar();
    }

    public void limpar() {
        compromisso = new Compromisso();
    }

    public List<Compromisso> obterCompromissos() {
        return compromissoService.obterTodos();
    }

	public Compromisso getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(Compromisso compromisso) {
        this.compromisso = compromisso;
    }

}
