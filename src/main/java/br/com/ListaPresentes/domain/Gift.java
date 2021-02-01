package br.com.ListaPresentes.domain;

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
		super();
		// TODO Auto-generated constructor stub
	}

	public Gift(String _id, String nome, int quantidade, Boolean qtdRecebida, String categoria, String nomeConvidado) {
		super();
		this._id = _id;
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

	public void setQtdRecebida(Boolean qtdRecebida) {
		this.qtdRecebida = qtdRecebida;
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

	public String get_id() {
		return _id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gift other = (Gift) obj;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		return true;
	}	
		
}
