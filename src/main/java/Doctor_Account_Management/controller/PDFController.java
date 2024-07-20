package Doctor_Account_Management.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Doctor_Account_Management.entity.PDF;
import Doctor_Account_Management.service.PDFService;

@RestController
@RequestMapping("/api/pdfs")
public class PDFController {
	@Autowired
    private PDFService pdfService;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadPDF(@RequestParam Long doctorId, @RequestParam String file) {
    	//file = file.toString();
        try {
            PDF filePath = pdfService.uploadPDF(doctorId, file);
            return ResponseEntity.ok(filePath);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error uploading PDF");
        }
    }

    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<?> getPDFsByDoctor(@PathVariable Long doctorId) {
        List<PDF> pdfs = pdfService.getPdfsByDoctorId(doctorId);
        return ResponseEntity.ok(pdfs);
    }
	

}
