package com.SSecurityProject.Secureproject.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SSecurityProject.Secureproject.Domain.Educationqualification;
import com.SSecurityProject.Secureproject.Repository.Edrepo;
import com.SSecurityProject.Secureproject.Service.edService;



@Service
public class Edimpl implements edService {

	@Autowired
	private Edrepo edrepo;
	
	public void createstudent(Educationqualification ed) {
		// TODO Auto-generated method stub
		edrepo.save(ed);
	}

	public void update(Educationqualification em) {
		// TODO Auto-generated method stub
		edrepo.save(em);
	}

	public void delete(Educationqualification em) {
		// TODO Auto-generated method stub
		edrepo.delete(em);
	}

	public List<Educationqualification> findAll(Class c) {
		// TODO Auto-generated method stub
		return edrepo.findAll();
	}

	public Optional<Educationqualification> findById(int id) {
		// TODO Auto-generated method stub
		return edrepo.findById(id);
	}

}
