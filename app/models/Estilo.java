package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTILO")
public class Estilo {
	@Id
	@GeneratedValue
	@Column(name = "id_instrumento")
	private long id;

	@Column(name = "nome_instrumento", nullable = false)
	private String nome;
	
	public Estilo(){
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
