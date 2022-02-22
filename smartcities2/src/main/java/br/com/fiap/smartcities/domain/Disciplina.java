package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_disciplina")
public class Disciplina {
	
	@Id
	@SequenceGenerator(name = "disciplina", sequenceName = "sq_tbl_disciplina", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "disciplina")
	@Column(name = "id_disciplina")
	private Integer id;
	
	@Column(name = "nome_disciplina", length = 50)
	private String nome;
	
	@Column(name = "ds_conteudo", length = 1000)
	private String conteudo;
	
	@Column(name = "vl_carga_horaria")
	private Double cargaHoraria;
	
	public Disciplina() {
		
	}

	public Disciplina(Integer id, String nome, String conteudo, Double cargaHoraria) {
		super();
		this.id = id;
		this.nome = nome;
		this.conteudo = conteudo;
		this.cargaHoraria = cargaHoraria;
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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	

}
