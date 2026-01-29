package hospital_app_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {
	@Id
	private int id;
	private String Branchname;
	
}
