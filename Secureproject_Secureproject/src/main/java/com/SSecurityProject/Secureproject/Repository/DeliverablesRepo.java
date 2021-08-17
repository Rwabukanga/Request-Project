package com.SSecurityProject.Secureproject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SSecurityProject.Secureproject.Domain.Deliverables;




@Repository
public interface DeliverablesRepo extends JpaRepository<Deliverables, Integer> {

	Optional<Deliverables> findById(int id);
}
