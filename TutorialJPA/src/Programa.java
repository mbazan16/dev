import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TutorialJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Animal hipo = DAOAnimal.crearAnimal(em,"Hippo","Hippopotamus amphibius", "Mamífero", "Sabana");
		System.out.println(hipo);
		
		
	}

}
