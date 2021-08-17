package com.SSecurityProject.Secureproject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SSecurityProject.Secureproject.Domain.Requeststatuss;




@Repository
public interface RequestStatusRepo extends JpaRepository<Requeststatuss, Integer> {

	Optional<Requeststatuss> findById(int id);
}
