package cascade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	List<Engine>elist;
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
	public List<Engine> getElist() {
		return elist;
	}
	public void setElist(List<Engine> elist) {
		this.elist = elist;
	}
	public Car(int id, String name, List<Engine> elist) {
		super();
		this.id = id;
		this.name = name;
		this.elist = elist;
	}
	public Car() {
		super();
	}
	
	
	
}
