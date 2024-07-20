package Doctor_Account_Management.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PDF {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @ManyToOne
	 @JoinColumn(name = "doctor_id", referencedColumnName = "id")
	 private Doctor doctor;

	 private String filePath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	

	public PDF(Long id, Doctor doctor, String filePath) {
		super();
		this.id = id;
		this.doctor = doctor;
		this.filePath = filePath;
	}

	public PDF() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

	
	
	
	

}
