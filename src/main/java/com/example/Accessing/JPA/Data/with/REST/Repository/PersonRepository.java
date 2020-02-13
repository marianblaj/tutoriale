package com.example.Accessing.JPA.Data.with.REST.Repository;

import com.example.Accessing.JPA.Data.with.REST.Model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "peoples", path ="people")
public interface PersonRepository extends PagingAndSortingRepository <Person, Integer> {
    List<Person> LastName(@Param("name") String name);
    List<Person> FirstName(@Param("name") String name);
}
