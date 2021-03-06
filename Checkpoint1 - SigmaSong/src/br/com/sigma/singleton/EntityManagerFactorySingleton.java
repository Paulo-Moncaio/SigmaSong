package br.com.sigma.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	private static EntityManagerFactory fabrica;
	
	private EntityManagerFactorySingleton() {
		super();
	}
	
	public static EntityManagerFactory getInstance() {
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("sigmasong");
		}
		return fabrica;
	}

}
