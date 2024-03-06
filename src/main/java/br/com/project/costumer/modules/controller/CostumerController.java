package br.com.project.costumer.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.project.costumer.modules.Costumers.entities.Costumer;
import br.com.project.costumer.modules.Costumers.repositories.CostumerRepository;
import br.com.project.costumer.modules.Costumers.services.CreateCostumer;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/costumer")
public class CostumerController {

  @Autowired
  private CostumerRepository repository;

  @PostMapping("/")
  public Costumer createCostumer(@RequestBody Costumer costumer) {
    CreateCostumer createCostumer = new CreateCostumer(repository);
    return createCostumer.execute(costumer);
  }



}
