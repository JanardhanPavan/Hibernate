package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {
	@Id
	private int id;
	private String name;
	@ManyToMany
	List<Patient>plist;
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
	public List<Patient> getPlist() {
		return plist;
	}
	public void setPlist(List<Patient> plist) {
		this.plist = plist;
	}
	public Doctor(int id, String name, List<Patient> plist) {
		super();
		this.id = id;
		this.name = name;
		this.plist = plist;
	}
	public Doctor() {
		super();
	}
	
	
}
