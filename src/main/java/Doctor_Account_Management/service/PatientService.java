//package Doctor_Account_Management.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import Doctor_Account_Management.entity.Patient;
//import Doctor_Account_Management.repository.PatientRepository;
//import jakarta.transaction.Transactional;
//
//@Service
//public class PatientService {
//	@Autowired
//    private PatientRepository patientRepository;
//
//   
//    private PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
//
//    @Transactional
//    public Patient createPatient(Patient patient) {
//        patient.setPassword(passwordEncoder.encode(patient.getPassword()));
//        return patientRepository.save(patient);
//    }
//
//    public Patient loginPatient(String email, String password) {
//        Patient patient = patientRepository.findByEmail(email);
//        if (patient != null && passwordEncoder.matches(password, patient.getPassword())) {
//            return patient;
//        }
//        return null;
//    }
//	
//
//}
