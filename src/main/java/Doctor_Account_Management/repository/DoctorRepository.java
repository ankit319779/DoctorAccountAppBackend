package Doctor_Account_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Doctor_Account_Management.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	
	Doctor findByEmail(String email);
	
	

}
