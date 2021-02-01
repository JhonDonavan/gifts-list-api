package br.com.ListaPresentes.model;

import java.util.Date;
import java.util.List;

public class listaPresentes {
	
	private long 			id;
	private String 			nomeLista;
	private String 			desclista;
	private String 			ProprietarioLista;
	private Date 			dataCriacao;
	private Date 			dataEvento;
	private String 			localEvento;
	private List<Gift> 		listaPresentes;
	
	
	public listaPresentes(long id, String nomeLista, String desclista, String proprietarioLista, Date dataCriacao,
			Date dataevento, String localEvento, List<Gift> listaPresentes) {
		super();
		this.id = id;
		this.nomeLista = nomeLista;
		this.desclista = desclista;
		this.ProprietarioLista = proprietarioLista;
		this.dataCriacao = dataCriacao;
		this.dataEvento = dataevento;
		this.localEvento = localEvento;
		this.listaPresentes = listaPresentes;
	}


	public String getNomeLista() {
		return nomeLista;
	}


	public void setNomeLista(String nomeLista) {
		this.nomeLista = nomeLista;
	}


	public String getDesclista() {
		return desclista;
	}


	public void setDesclista(String desclista) {
		this.desclista = desclista;
	}


	public String getProprietarioLista() {
		return ProprietarioLista;
	}


	public void setProprietarioLista(String proprietarioLista) {
		ProprietarioLista = proprietarioLista;
	}


	public Date getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Date getDataevento() {
		return dataEvento;
	}


	public void setDataevento(Date dataevento) {
		this.dataEvento = dataevento;
	}


	public String getLocalEvento() {
		return localEvento;
	}


	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}


	public List<Gift> getListaPresentes() {
		return listaPresentes;
	}


	public void setListaPresentes(List<Gift> listaPresentes) {
		this.listaPresentes = listaPresentes;
	}


	public long getId() {
		return id;
	}
}
