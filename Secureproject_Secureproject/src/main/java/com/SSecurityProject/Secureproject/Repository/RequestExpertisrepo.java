package com.SSecurityProject.Secureproject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SSecurityProject.Secureproject.Domain.Requestexpertis;


@Repository
public interface RequestExpertisrepo extends JpaRepository<Requestexpertis, Integer> {

	Optional<Requestexpertis>findByid(int id);
}
