package smartcities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_avaliacao")
@IdClass(AvaliacaoId.class)
public class Avaliacao implements Serializable {
	
	@Id
	@JoinColumn(name="id_usuario")
	@ManyToOne(optional = false)
	private Usuario usuario;
	
	@Id
	@JoinColumn(name="id_estabelecimento2")
	@ManyToOne(optional = false)
	private Estabelecimento2 estabelecimento2;
	
	@Column(name="vl_nota")
	private int nota;

	public Avaliacao() {
		
	}

	public Avaliacao(Usuario usuario, Estabelecimento2 estabelecimento2, int nota) {
		super();
		this.usuario = usuario;
		this.estabelecimento2 = estabelecimento2;
		this.nota = nota;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Estabelecimento2 getEstabelecimento2() {
		return estabelecimento2;
	}

	public void setEstabelecimento2(Estabelecimento2 estabelecimento2) {
		this.estabelecimento2 = estabelecimento2;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
	
}
