package com.postgresql.ytdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.ytdemo.model.Person;
import com.postgresql.ytdemo.repo.PersonRepo;

@RestController
public class PersonController {

  @Autowired
  PersonRepo repo;

  @PostMapping("/addPerson")
  public void addPerson(@RequestBody Person person) {
    repo.save(person);
  }
}
