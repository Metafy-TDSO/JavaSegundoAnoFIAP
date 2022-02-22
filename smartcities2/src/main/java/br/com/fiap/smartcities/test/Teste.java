package br.com.fiap.smartcities.test;

import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
	
		Persistence.createEntityManagerFactory("smartcities2").createEntityManager();
	}
	
}
