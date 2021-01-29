package org.khadija.dao;


import java.util.Date;

import org.khadija.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRipository extends JpaRepository<Patient, Long>{
	public Page<Patient> findByNameContains(String name, Pageable  pageable);
	@Query("select p from Patient p where p.name like :x and p.dateNaissance > :y ")
	public Page<Patient> chercher(@Param("x")String mc, @Param("y")Date dateMin, Pageable  pageable);

}
