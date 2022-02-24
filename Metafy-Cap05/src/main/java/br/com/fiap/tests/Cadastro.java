package br.com.fiap.tests;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.ContratoAluguel;
import br.com.fiap.entities.Estabelecimento;
import br.com.fiap.entities.TipoEstabelecimento;

public class Cadastro {

	public static void main(String[] args) {
	
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities");
		EntityManager em = fabrica.createEntityManager();
		
		TipoEstabelecimento tipo = new TipoEstabelecimento(0, "Pet Shop", null);
				
		Cliente cliente1 = new Cliente(0, "Diego", null);
		Cliente cliente2 = new Cliente(0, "Leandro", null);

		ContratoAluguel contrato1 = new ContratoAluguel(1, 2000, new GregorianCalendar(2015, Calendar.JANUARY,10), null);

		
		List<Cliente> lista = new ArrayList<Cliente>();		
		lista.add(cliente1);
		lista.add(cliente2);

		Estabelecimento est1 = new Estabelecimento(null, "Fiap Pet", lista, null, tipo);
		Estabelecimento est2 = new Estabelecimento(null, "Poyatos dog", lista, contrato1, tipo);
		
		contrato1.setEstabelecimento(est2);
		
		em.persist(est1);
		em.persist(est2);	
		
		
		
		try {
			
			em.getTransaction().begin();
			em.getTransaction().commit();
			System.out.println("Concluido com sucesso");
		}catch(Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
		em.close();
		fabrica.close();
	}
	
}
