package com.SSecurityProject.Secureproject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SSecurityProject.Secureproject.Domain.Educationqualification;



@Repository
public interface Edrepo extends JpaRepository<Educationqualification, Integer> {

	Optional<Educationqualification> findById(int id);
}
