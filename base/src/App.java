import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.entities.Departments;
import com.jpa.services.DepartmentService;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HR");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Departments department = DepartmentService.encontrarDepartment(em,10L);
		System.out.println(department);

	}

}
