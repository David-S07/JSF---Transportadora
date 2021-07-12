package br.com.agendajuiz.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Compromisso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String anotacoes;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHoraFim;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHoraInicio;

	private String linkVideoConferencia;

	private String local;

	private String nome;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public String getLinkVideoConferencia() {
		return linkVideoConferencia;
	}

	public void setLinkVideoConferencia(String linkVideoConferencia) {
		this.linkVideoConferencia = linkVideoConferencia;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Compromisso{" +
				"id=" + id +
				", anotacoes='" + anotacoes + '\'' +
				", dataHoraFim=" + dataHoraFim +
				", dataHoraInicio=" + dataHoraInicio +
				", linkVideoConferencia='" + linkVideoConferencia + '\'' +
				", local='" + local + '\'' +
				", nome='" + nome + '\'' +
				'}';
	}

}