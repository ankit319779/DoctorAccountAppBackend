package Doctor_Account_Management.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(unique = true)
	private String email;

	private String password;

	private String specialty;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	

	public Doctor(Long id, String name, String email, String password, String specialty) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.specialty = specialty;
	}
	
	

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
}

	
	
	
	
	
	

	   
		
		
		
		
		
		
	    
	    

		
	
	

	
	
	 
	
	


