package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	@Id
	private int id;
	private int panno;
	private String adress;
	
	@OneToOne
	private Citizen citizen;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPanno() {
		return panno;
	}

	public void setPanno(int panno) {
		this.panno = panno;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public Pan(int id, int panno, String adress, Citizen citizen) {
		super();
		this.id = id;
		this.panno = panno;
		this.adress = adress;
		this.citizen = citizen;
	}

	public Pan() {
		super();
	}

	@Override
	public String toString() {
		return "Pan [id=" + id + ", panno=" + panno + ", adress=" + adress + "]";
	}
	
	
}
