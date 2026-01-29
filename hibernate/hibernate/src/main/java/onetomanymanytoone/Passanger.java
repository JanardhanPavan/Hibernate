package onetomanymanytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passanger {
	@Id
	private int id;
	private String name;
	
	@ManyToOne
	Train train;

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

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Passanger(int id, String name, Train train) {
		super();
		this.id = id;
		this.name = name;
		this.train = train;
	}

	public Passanger() {
		super();
	}

	
	
	
	
}
