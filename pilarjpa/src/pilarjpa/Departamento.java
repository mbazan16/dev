package pilarjpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Decora a la clase
@Table(name="DEPARTMENTS") //Le digo que esta entidad va a intentar mapear la tabla y para ello todos los campos tienen que tener atributos
public class Departamento {

	private static final long serialVersionUID = 1L;  //para poder descomponer la clase animal, que sea serializable
	@Id //Decora al campo/atributo
	private String department_id;
	private String department_name;
	private String manager_id;
	private String location_id;

	public Departamento() { //Es obligatorio tener el de por defecto en entities
		super();
	}

	//Create
	public Departamento(String department_id, String department_name, String manager_id, String location_id) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.manager_id = manager_id;
		this.location_id = location_id;
	}

	//Read/Update
	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}

	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public boolean equals(Object elOtro) {
		if (elOtro instanceof Departamento) {
			Departamento d = (Departamento) elOtro;
			return this.department_id == d.department_id;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.department_id.hashCode();
	}
	@Override
	public String toString() {
		return String.format("department_id=%s, department_name=%s, manager_id=%s, location_id=%s", this.department_id, this.department_name, this.manager_id, this.location_id);
	}
	

}
