package Doctor_Account_Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doctor_Account_Management.entity.PDF;
import Doctor_Account_Management.repository.DoctorRepository;
import Doctor_Account_Management.repository.PDFRepository;
import jakarta.transaction.Transactional;

@Service
public class PDFService {
	@Autowired
    private PDFRepository pdfRepository;
	@Autowired
	private DoctorRepository doctorRepository;
 
    @Transactional
    public PDF uploadPDF(Long doctorId, String filePath) {
        PDF pdf = new PDF();
        pdf.setDoctor(doctorRepository.getById(doctorId));
        pdf.setFilePath(filePath);
       // pdf.setUploadDate(LocalDateTime.now());
        return pdfRepository.save(pdf);
    }

    public List<PDF> getPdfsByDoctorId(Long doctorId) {
        return pdfRepository.findByDoctorId(doctorId);
    }


}
