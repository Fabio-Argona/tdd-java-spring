package br.com.project.costumer.modules.Costumers.repositories;

import br.com.project.costumer.modules.Costumers.entities.Costumer;

public interface ICourseRepository {

  public Costumer findByName(String name);

  public Costumer save(Costumer course);

}
