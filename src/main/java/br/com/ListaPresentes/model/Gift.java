package br.com.ListaPresentes.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "gift")
public class Gift {
	
	@MongoId(value = FieldType.OBJECT_ID)
	private String 	_id;
	private String  nome;
	private int 	quantidade;
	private Boolean qtdRecebida;
	private String  categoria;
	//private List<Convidado> convidado;
	private String  nomeConvidado;
	
	
	public Gift() {
		
	}
	
	public Gift(String id, String nome, int quantidade, Boolean qtdRecebida, String categoria, String nomeConvidado) {
		super();
		this._id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.qtdRecebida = qtdRecebida;
		this.categoria = categoria;
		this.nomeConvidado = nomeConvidado;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Boolean getQtdRecebida() {
		return qtdRecebida;
	}


	public void setQtdRecebida(Boolean qtdAtingida) {
		this.qtdRecebida = qtdAtingida;
	}


	public String getId() {
		return _id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	
	
	
}
