package com.SSecurityProject.Secureproject.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SSecurityProject.Secureproject.Domain.Registrant;
import com.SSecurityProject.Secureproject.Domain.Systemuser;





@Repository
public interface RegistrantRepository extends JpaRepository<Registrant, Integer> {

	Optional<Registrant> findById(int id);
	Optional<Registrant> findByUuid(String uuid);
	List<Registrant> findByDistrictId(int id);
	

	List<Registrant> findByCategory(String category);
	Optional<Registrant> findByEmail(String emailAddress);
	public Registrant findByUsername(String username); 
	
}
