package Doctor_Account_Management.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Doctor_Account_Management.entity.Doctor;
import Doctor_Account_Management.repository.DoctorRepository;
import jakarta.transaction.Transactional;

@Service
public class DoctorService {
	
    private DoctorRepository doctorRepository;

    
    //private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
       
    }
    public DoctorService() {
    	//passwordEncoder = new BCryptPasswordEncoder();
    }
    @Transactional
    public Doctor save(Doctor doctor) {
        //doctor.setPassword(passwordEncoder.encode(doctor.getPassword()));
        return doctorRepository.save(doctor);
    }

    public Doctor findByEmail(String email) {
        Doctor doctor = doctorRepository.findByEmail(email);
        return doctor;
    }
	
	
	
	 
	

}
