package com.SSecurityProject.Secureproject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SSecurityProject.Secureproject.Domain.Request;


@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {

	Optional<Request> findById(int id);
	Optional<Request> findByUuid(String uuid);
	
	
}
