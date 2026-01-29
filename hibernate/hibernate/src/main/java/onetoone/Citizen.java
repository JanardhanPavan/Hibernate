package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Citizen {
	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Pan pan;

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

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	public Citizen(int id, String name, Pan pan) {
		super();
		this.id = id;
		this.name = name;
		this.pan = pan;
	}

	public Citizen() {
		super();
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", pan=" + pan + "]";
	}
	
}
