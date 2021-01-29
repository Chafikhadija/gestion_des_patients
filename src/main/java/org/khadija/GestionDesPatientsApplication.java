package org.khadija;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.khadija.dao.PatientRipository;
import org.khadija.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
@SpringBootApplication
public class GestionDesPatientsApplication  implements CommandLineRunner{
	@Autowired
	private PatientRipository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(GestionDesPatientsApplication.class, args);}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("****************************************");
		DateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
		patientRepository.save(new Patient(null,"khadija chafi", dateFormat.parse("10/09/1998"), false,8));	
		patientRepository.save(new Patient(null,"hamza benmoussa", dateFormat.parse("05/12/1998"), false,9));	
		patientRepository.save(new Patient(null,"Ilyass Fakhiri", dateFormat.parse("15/04/1982"), true,10));	
		Page<Patient> patients=patientRepository.findByNameContains("k",PageRequest.of(0, 2));
		System.out.println(patients.getSize());
		System.out.println(patients.getTotalElements());
		System.out.println(patients.getTotalPages());
		patients.getContent().forEach(p->{
			System.out.println(p.toString());
		});
		System.out.println("****************************************");
		Page<Patient> patientsDate=patientRepository.chercher("%h%", dateFormat.parse("01/01/1998"),PageRequest.of(0, 2));
		System.out.println(patientsDate.getSize());
		System.out.println(patientsDate.getTotalElements());
		System.out.println(patientsDate.getTotalPages());
	
		patientsDate.getContent().forEach(p->{
			System.out.println(p.toString());
		});}}
