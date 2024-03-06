package br.com.project.costumer.modules.Costumers.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.costumer.modules.Costumers.entities.Costumer;

public interface CourseJPARepository extends JpaRepository<Costumer, UUID> {

  public Costumer findByName(String name);

}
