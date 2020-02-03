import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class DAOAnimal {
	
	public static Animal crearAnimal(EntityManager em, String id, String nombre, String clase, String hábitat) {
		Animal a = new Animal(id, nombre, clase, hábitat);
		em.persist(a);
		return a;
		}
	public static Animal encontrarAnimal(EntityManager em, String id) {
		return em.find(Animal.class, id);
		}
	public static Animal modificarAnimal(EntityManager em, String id, String nombre, String clase, String habitat) {
		Animal a = em.find(Animal.class, id);
		if (a != null) {
		a.setNombre(nombre);
		a.setClase(clase);
		a.setHabitat(habitat);
		}
		return a;
		}
	public static List<String> getNombres(EntityManager em) {
		List<String> Nombres = new ArrayList<String>();
		Nombres = em.createNamedQuery("Animal.nombre", String.class).getResultList(); return Nombres;
		}

}
