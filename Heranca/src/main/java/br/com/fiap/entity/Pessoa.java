package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "name_tipo")
public class Pessoa {

	@Id
	@SequenceGenerator(name="pessoa", sequenceName="sq_tb_pessoa", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pessoa")
	private int id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	public Pessoa() {
		
	}

	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
