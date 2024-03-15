package com.postgresql.ytdemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.postgresql.ytdemo.model.Person;

@RepositoryRestResource
public interface PersonRepo extends JpaRepository<Person, Long> {

  List<Person> findByNameContaining(String name);
}
