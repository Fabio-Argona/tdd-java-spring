package br.com.project.costumer.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import br.com.project.costumer.modules.Costumers.repositories.CourseInMemoryRepository;
import org.junit.Test;

import br.com.project.costumer.modules.Costumers.entities.Costumer;
import br.com.project.costumer.modules.Costumers.services.CreateCostumer;

public class CreateCourseServiceTest {

  @Test
  public void should_be_able_to_create_a_new_course() {
    // Criar um novo curso
    // Criar table curso (Entidade)
    // ID, description, name, workload
    Costumer course = new Costumer();
    course.setDescription("Curso_Description_Test");
    course.setName("Curso_Name");
    course.setWorkload(100);

    // Criar um repositorio de curso
    CourseInMemoryRepository repository = new CourseInMemoryRepository();
    // Criar um novo service
    CreateCostumer createCourseService = new CreateCostumer(repository);
    Costumer createdCourse = createCourseService.execute(course);

    assertNotNull(createdCourse.getId());

  }

  @Test(expected = Error.class)
  public void should_not_be_able_to_create_a_new_course_if_exists() {
    Costumer course = new Costumer();
    course.setDescription("Not_Create_course");
    course.setName("Not_Create_course");
    course.setWorkload(100);

    CourseInMemoryRepository repository = new CourseInMemoryRepository();

    CreateCostumer createCourseService = new CreateCostumer(repository);
    createCourseService.execute(course);
    createCourseService.execute(course);

  }

}
