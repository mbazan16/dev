package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import servicios.ServicioDepartamento;
import pilarjpa.Departamento;


public class TestPilar {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pilarjpa"); //Tengo que poner mi direccion
		EntityManager em = emf.createEntityManager();
		
		Departamento departamento = ServicioDepartamento.iddepartamento(em,"220");
		System.out.println(departamento);
		System.out.println("Ya está");
	}

}
