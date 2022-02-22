package smartcities.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_estabelecimento")
public class TipoEstabelecimento {

	@Id
	@Column(name = "id_tipo_ontrato")
	private int id;

	@Column(name = "nm_tipo_estalecimento")
	private String tipo;

	@OneToMany(mappedBy = "tipo")
	private List<Estabelecimento> estabelecimentos;

	public TipoEstabelecimento() {

	}	

	public TipoEstabelecimento(int id, String tipo, List<Estabelecimento> estabelecimentos) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.estabelecimentos = estabelecimentos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

}
