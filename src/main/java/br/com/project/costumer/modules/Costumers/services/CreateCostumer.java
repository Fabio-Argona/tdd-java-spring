package br.com.project.costumer.modules.Costumers.services;

import br.com.project.costumer.modules.Costumers.entities.Costumer;
import br.com.project.costumer.modules.Costumers.repositories.ICourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCostumer {

  private ICourseRepository repository;

  public CreateCostumer(ICourseRepository repository) {
    this.repository = repository;
  }

  public Costumer execute(Costumer course) {

    // Validar se o curso existe pelo nome
    Costumer existedCourse = this.repository.findByName(course.getName());

    // Se sim - retorna erro

    if (existedCourse != null) {
      throw new Error("Curso já existe!");
    }

    // Se não - Salvar e retorna novo curso
    return this.repository.save(course);

  }

}
