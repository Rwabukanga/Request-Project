package com.SSecurityProject.Secureproject.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SSecurityProject.Secureproject.Domain.Province;
import com.SSecurityProject.Secureproject.Repository.ProvinceRepository;
import com.SSecurityProject.Secureproject.Service.ProvinceService;



@Service
public class ProvinceImplementation implements ProvinceService {

	@Autowired
	private ProvinceRepository provincerepo;

	public void createprovince(Province province) {
		// TODO Auto-generated method stub
		provincerepo.save(province);
	}

	public List<Province> findAll(Class c) {
		// TODO Auto-generated method stub
		return provincerepo.findAll();
	}

	public Optional<Province> findById(int id) {
		// TODO Auto-generated method stub
		return provincerepo.findById(id);
	}
}
