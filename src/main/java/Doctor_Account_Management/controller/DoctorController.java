package Doctor_Account_Management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Doctor_Account_Management.entity.Doctor;
import Doctor_Account_Management.entity.LoginRequest;
import Doctor_Account_Management.service.DoctorService;
@CrossOrigin(origins="http://localhost:3000")

@RestController
public class DoctorController {
//	@Autowired
//    private DoctorService doctorService;
//
//    @PostMapping("/signup")
//    public ResponseEntity<?> createDoctor(@Validated @RequestBody Doctor doctor) {
//        Doctor createdDoctor = doctorService.createDoctor(doctor);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdDoctor);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<?> loginDoctor(@RequestParam String email, @RequestParam String password) {
//        Doctor doctor = doctorService.loginDoctor(email, password);
//        if (doctor != null) {
//            return ResponseEntity.ok(doctor);
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//    }

	@Autowired
	private DoctorService doctorService;

	@PostMapping("/signup")
	public ResponseEntity<String> signup(@RequestBody Doctor doctor) {
		// Encrypt password before saving
		//doctor.setPassword(doctor.getPassword());
		doctorService.save(doctor);
		return ResponseEntity.ok("Signup successful");
	}

//	@GetMapping("/login")
//    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
//        Doctor doctor = doctorService.findByEmail(loginRequest.getEmail());
//        if (new BCryptPasswordEncoder().matches(loginRequest.getPassword(), doctor.getPassword())) {
//            return null;
//        }
//        
//        
//    }
	
	
	@PostMapping("/login")
	 public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){
		
		 
		Doctor doctor = doctorService.findByEmail(loginRequest.getEmail());
		if (loginRequest.getPassword().equals( doctor.getPassword())) {
			return ResponseEntity.ok("Login successful");
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	
		
	}
	
	
	
	 
	
	
}

