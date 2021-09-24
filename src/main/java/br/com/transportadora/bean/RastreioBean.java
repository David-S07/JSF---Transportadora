package br.com.transportadora.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.transportadora.model.Rastreio;
import br.com.transportadora.service.RastreioService;

@Component
@Named
@RequestScoped
public class RastreioBean {

	private Rastreio rastreio;

	@Autowired
	private RastreioService rastreioService;

	public void salvar() {
		rastreio = rastreioService.salvar(rastreio);
		limpar();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Rastreio salvo com sucesso"));
	}

	public String editar(Rastreio rastreio) {
		this.rastreio = rastreio;
		return "/cadastrarRastreio.xhtml?faces-redirect=true";
	}

	public void excluir(Long id) {
		rastreioService.excluir(id);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Rastreio excluído com sucesso"));
	}

	@PostConstruct
	public void init() {
		limpar();
	}

	public void limpar() {
		rastreio = new Rastreio();
	}

	public List<Rastreio> obterRastreios() {
		return rastreioService.obterTodos();
	}

	public Rastreio getRastreio() {
		return rastreio;
	}

	public void setRastreio(Rastreio rastreio) {
		this.rastreio = rastreio;
	}


}
