package br.com.fiap.patterns.model;

import java.util.Observable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.fiap.patterns.config.ConfigSingleton;

public class Pis extends Observable implements Imposto{
	
	private static final Logger logger = LogManager.getLogger(Pis.class);
	
	private float aliquota;
	
	private float valorPis;
	public Pis() {
		aliquota = Float.parseFloat(ConfigSingleton.getInstance().getProperty("aliquota"));
	}

	@Override
	public void calcularImposto(float valor) {
		setChanged();
		valorPis = valor * aliquota;
		logger.info("Calculando Imposto");
		notifyObservers(getValorPis());
		
	}

	public float getValorPis() {
		return valorPis;
	}
}
