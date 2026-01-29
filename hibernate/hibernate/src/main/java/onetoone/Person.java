package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	@OneToOne
	private Aadhar aadhar;
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
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	public Person(int id, String name, Aadhar aadhar) {
		super();
		this.id = id;
		this.name = name;
		this.aadhar = aadhar;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", aadhar=" + aadhar + "]";
	}
	
	
}
	
	
	
	
