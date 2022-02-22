package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa {

	@Column(name = "nr_cnpj")
	private String cnpj;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cnpj;
	}

	public void setCpf(String cnpj) {
		this.cnpj = cnpj;
	}

}
