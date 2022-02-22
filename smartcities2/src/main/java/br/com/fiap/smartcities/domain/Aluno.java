package br.com.fiap.smartcities.domain;

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

@Entity
@Table(name = "tbl_aluno")
public class Aluno {
	
	@Id
	@SequenceGenerator(name = "aluno", sequenceName = "sq_tbl_aluno", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno")
	@Column(name = "id_aluno")
	private Integer id;
	
	@Column(name = "nome_aluno", length = 50)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_aniversario")
	private Calendar dataAniversario;
	
	@Column(name = "vl_media")
	private Double media;
	
	public Aluno() {
		
	}

	public Aluno(Integer id, String nome, Calendar dataAniversario, Double media) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataAniversario = dataAniversario;
		this.media = media;
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

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}
	
	
}
