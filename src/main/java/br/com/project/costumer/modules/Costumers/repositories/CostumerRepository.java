package br.com.project.costumer.modules.Costumers.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.costumer.modules.Costumers.entities.Costumer;

import java.util.List;
import java.util.Optional;

@Service
public class CostumerRepository implements ICourseRepository {

  @Autowired
  CourseJPARepository courseJPARepository;

  @Override
  public Costumer findByName(String name) {
    return this.courseJPARepository.findByName(name);
  }

  @Override
  public Costumer save(Costumer course) {
    return this.courseJPARepository.save(course);
  }

  public Optional<Object> findById(Long id) {
  }

  public List<Costumer> findAll() {
  }
}
