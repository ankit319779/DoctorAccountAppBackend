package Doctor_Account_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Doctor_Account_Management.entity.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {
	Patient findByEmail(String email);

}
