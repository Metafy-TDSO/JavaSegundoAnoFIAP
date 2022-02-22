package smartcities.entity;

import java.io.Serializable;

public class AvaliacaoId implements Serializable{

	private int usuario;

	private int estabelecimento2;

	public AvaliacaoId() {

	}

	public AvaliacaoId(int usuario, int estabelecimento2) {
		super();
		this.usuario = usuario;
		this.estabelecimento2 = estabelecimento2;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getEstabelecimento() {
		return estabelecimento2;
	}

	public void setEstabelecimento(int estabelecimento2) {
		this.estabelecimento2 = estabelecimento2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estabelecimento2;
		result = prime * result + usuario;
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
		AvaliacaoId other = (AvaliacaoId) obj;
		if (estabelecimento2 != other.estabelecimento2)
			return false;
		if (usuario != other.usuario)
			return false;
		return true;
	}

	
	
}
