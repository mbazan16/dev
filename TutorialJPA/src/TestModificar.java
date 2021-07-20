import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestModificar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TutorialJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Animal hipo = DAOAnimal.encontrarAnimal(em, "Hippo");
		hipo.setHabitat("Río");
		System.out.println("Registro modificado: " + hipo);
		em.getTransaction().commit();
	}
}
