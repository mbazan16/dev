package servicios;

import javax.persistence.EntityManager;

import pilarjpa.Departamento;

public class ServicioDepartamento {
	
	//Find department id with department name
	public static Departamento iddepartamento(EntityManager em, String Department_id) {
		return em.find(Departamento.class, Department_id);
	}

}
