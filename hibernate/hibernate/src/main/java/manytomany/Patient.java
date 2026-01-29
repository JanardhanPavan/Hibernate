package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
	@Id
	private int id;
	private String name;
	@ManyToMany
	List<Doctor> dlist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Doctor> getDlist() {
		return dlist;
	}
	public void setDlist(List<Doctor> dlist) {
		this.dlist = dlist;
	}
	public Patient(int id, String name, List<Doctor> dlist) {
		super();
		this.id = id;
		this.name = name;
		this.dlist = dlist;
	}
	public Patient() {
		super();
	}
	
	
}
