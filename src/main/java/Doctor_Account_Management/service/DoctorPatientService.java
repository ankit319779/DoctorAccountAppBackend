//package Doctor_Account_Management.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import Doctor_Account_Management.entity.Doctor;
//import Doctor_Account_Management.entity.DoctorPatient;
//import Doctor_Account_Management.entity.Patient;
//import Doctor_Account_Management.repository.DoctorPatientRepository;
//@Service
//public class DoctorPatientService {
//	@Autowired
//    private DoctorPatientRepository doctorPatientRepository;
//    
//    public DoctorPatient linkDoctorPatient(Long doctorId, Long patientId) {
//        DoctorPatient doctorPatient = new DoctorPatient();
//        
//        Doctor doctor = new Doctor();
//        doctor.setId(doctorId); // Assuming Doctor object already exists in DB
//        doctorPatient.setDoctor(doctor);
//        
//        Patient patient = new Patient();
//        patient.setId(patientId); // Assuming Patient object already exists in DB
//        doctorPatient.setPatient(patient);
//        
//        return doctorPatientRepository.save(doctorPatient);
//    }
//    
//    public List<DoctorPatient> getPatientsByDoctor(Long doctorId) {
//        Doctor doctor = new Doctor();
//        doctor.setId(doctorId);
//        
//        return doctorPatientRepository.findByDoctor(doctor);
//    }
//
//}
