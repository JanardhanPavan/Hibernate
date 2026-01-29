package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customers {
	@Id
	private int id;
	private String name;
	@ManyToOne
	Bank bank;
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
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Customers(int id, String name, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.bank = bank;
	}
	public Customers() {
		super();
	}
	
}
