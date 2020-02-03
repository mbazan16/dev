import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String nombre;
	private String clase;
	private String habitat;
	
	public Animal() {
		super();
	}
	
	
	
	public Animal(String id, String nombre, String clase, String habitat) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clase = clase;
		this.habitat = habitat;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public boolean equals(Object elOtro) {
	if (elOtro instanceof Animal) {
	Animal a = (Animal) elOtro;
	return this.id == a.id;
	}
	return false;
	}
	@Override
	public int hashCode() {
	return this.id.hashCode();
	}
	@Override
	public String toString() {
	return String.format("id=%s, nombre=%s, clase=%s, habitat=%s", this.id, this.nombre, this.clase, this.habitat);
	}
	

}
