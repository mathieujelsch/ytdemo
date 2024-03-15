package com.postgresql.ytdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.ytdemo.model.Person;
import com.postgresql.ytdemo.repo.PersonRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PersonController {

  @Autowired
  PersonRepo personRepo;

  @GetMapping("/allPersons")
  public ResponseEntity<List<Person>> getAllPersons(@RequestParam(required = false) String name) {
    List<Person> persons = personRepo.findAll();
    return ResponseEntity.ok(persons);
  }

}
