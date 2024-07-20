//package Doctor_Account_Management.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import Doctor_Account_Management.entity.Patient;
//import Doctor_Account_Management.service.PatientService;
//
//@RestController
//@RequestMapping("/api/patients")
//public class PatientController {
//	@Autowired
//    private PatientService patientService;
//
//    @PostMapping("/signup")
//    public ResponseEntity<?> createPatient(@Validated @RequestBody Patient patient) {
//        Patient createdPatient = patientService.createPatient(patient);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<?> loginPatient(@RequestParam String email, @RequestParam String password) {
//        Patient patient = patientService.loginPatient(email, password);
//        if (patient != null) {
//            return ResponseEntity.ok(patient);
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//    }
//
//	
//
//}
