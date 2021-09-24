package br.com.transportadora.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rastreio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String anotacoes;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHoraFim;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHoraInicio;

	private Long codigoRastreio;

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

	public Long getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(Long codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
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
		return "Rastreio{" + "id=" + id + ", anotacoes='" + anotacoes + '\'' + ", dataHoraFim=" + dataHoraFim
				+ ", dataHoraInicio=" + dataHoraInicio + ", codigoRastreio='" + codigoRastreio + '\''
				+ ", local='" + local + '\'' + ", nome='" + nome + '\'' + '}';
	}

}