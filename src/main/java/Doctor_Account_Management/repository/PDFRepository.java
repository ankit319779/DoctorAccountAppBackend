package Doctor_Account_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Doctor_Account_Management.entity.PDF;

public interface PDFRepository extends JpaRepository<PDF, Long> {
	
	List<PDF> findByDoctorId(Long doctorId);

}
