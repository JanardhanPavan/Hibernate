package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhar {
	@Id
	private int id;
	private int aadharno;
	private String adress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Aadhar(int id, int aadharno, String adress) {
		super();
		this.id = id;
		this.aadharno = aadharno;
		this.adress = adress;
	}
	public Aadhar() {
		super();
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", aadharno=" + aadharno + ", adress=" + adress + "]";
	}
	
	
}
