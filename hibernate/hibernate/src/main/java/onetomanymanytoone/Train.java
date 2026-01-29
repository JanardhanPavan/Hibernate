package onetomanymanytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Train {
	@Id
	private int id;
	private String name;
	@OneToMany
	List<Passanger> plist;
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
	public List<Passanger> getPlist() {
		return plist;
	}
	public void setPlist(List<Passanger> plist) {
		this.plist = plist;
	}
	public Train(int id, String name, List<Passanger> plist) {
		super();
		this.id = id;
		this.name = name;
		this.plist = plist;
	}
	public Train() {
		super();
	}
	
	
	
	
}
