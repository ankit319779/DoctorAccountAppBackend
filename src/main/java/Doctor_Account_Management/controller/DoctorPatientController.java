//package Doctor_Account_Management.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import Doctor_Account_Management.entity.DoctorPatient;
//import Doctor_Account_Management.service.DoctorPatientService;
//
//@RestController
//@RequestMapping("/api/doctor-patient")
//public class DoctorPatientController {
//	@Autowired
//    private DoctorPatientService doctorPatientService;
//    
//    @PostMapping("/link")
//    public ResponseEntity<?> linkDoctorPatient(@RequestParam Long doctorId, @RequestParam Long patientId) {
//        try {
//            DoctorPatient doctorPatient = doctorPatientService.linkDoctorPatient(doctorId, patientId);
//            return ResponseEntity.ok(doctorPatient);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error linking doctor and patient");
//        }
//    }
//    
//    @GetMapping("/patients/{doctorId}")
//    public ResponseEntity<?> getPatientsByDoctor(@PathVariable Long doctorId) {
//        try {
//            List<DoctorPatient> patients = doctorPatientService.getPatientsByDoctor(doctorId);
//            return ResponseEntity.ok(patients);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error getting patients for doctor");
//        }
//    }
//
//}
//
