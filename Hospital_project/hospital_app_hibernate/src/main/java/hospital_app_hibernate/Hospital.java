package hospital_app_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	private int id;
	private String Hospitalname;
	private String hospitalMainBranch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHospitalname() {
		return Hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		Hospitalname = hospitalname;
	}
	public String getHospitalMainBranch() {
		return hospitalMainBranch;
	}
	public void setHospitalMainBranch(String hospitalMainBranch) {
		this.hospitalMainBranch = hospitalMainBranch;
	}
	public Hospital(int id, String hospitalname, String hospitalMainBranch) {
		super();
		this.id = id;
		Hospitalname = hospitalname;
		this.hospitalMainBranch = hospitalMainBranch;
	}
	public Hospital() {
		super();
	}
	
	
}
