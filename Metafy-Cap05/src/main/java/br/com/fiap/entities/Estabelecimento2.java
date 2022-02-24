package br.com.fiap.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_estabelecimento2")
public class Estabelecimento2 {

	@Id
	@SequenceGenerator(name = "estabelecimento2", sequenceName = "sq_tb_estabelecimento2", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento2")
	@Column(name = "id_estabelecimento2")
	private Integer id;

	@Column(name = "nm_estabelecimento2", length = 50)
	private String nome;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_criacao")
	private Calendar dataCriacao;


	public Estabelecimento2(){
		
	}

	public Estabelecimento2(Integer id, String nome, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
	
}
