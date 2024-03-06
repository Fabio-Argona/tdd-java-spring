package br.com.project.costumer.modules.Costumers.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import br.com.project.costumer.modules.Costumers.entities.Costumer;

public class CourseInMemoryRepository implements ICourseRepository {

  private List<Costumer> courses;

  public CourseInMemoryRepository() {
    this.courses = new ArrayList<>();
  }

  @Override
  public Costumer findByName(String name) {
    Optional<Costumer> optionalCourse = this.courses.stream().filter(course -> course.getName().equals(name)).findFirst();
    return optionalCourse.orElse(null);
  }

  @Override
  public Costumer save(Costumer course) {
    this.courses.add(course);
    course.setId(UUID.randomUUID());
    return course;
  }

}
