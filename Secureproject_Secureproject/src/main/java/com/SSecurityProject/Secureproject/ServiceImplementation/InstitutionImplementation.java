package com.SSecurityProject.Secureproject.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SSecurityProject.Secureproject.Domain.Institution;
import com.SSecurityProject.Secureproject.Repository.InstitutionRepository;
import com.SSecurityProject.Secureproject.Service.InstitutionService;


@Service
public class InstitutionImplementation implements InstitutionService {
	
	@Autowired
	private InstitutionRepository instrepo;

	public void createinstitution(Institution ins) {
		// TODO Auto-generated method stub
		instrepo.save(ins);
	}

	public void updateinstitution(Institution ins) {
		// TODO Auto-generated method stub
		instrepo.save(ins);
	}

	public void deleteinstution(int id) {
		// TODO Auto-generated method stub
		instrepo.deleteById(id);
	}

	public Optional<Institution> findById(int id) {
		// TODO Auto-generated method stub
		return instrepo.findById(id);
	}

	/*public Optional<Institution> findByUuid(String uuid) {
		// TODO Auto-generated method stub
		return instrepo.findByUuid(uuid);
	}
*/
	public List<Institution> findAll() {
		// TODO Auto-generated method stub
		return instrepo.findAll();
	}

	
}
