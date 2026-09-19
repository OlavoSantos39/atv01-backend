package br.com.grupo.alfa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.grupo.alfa.model.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long>{
	
}
