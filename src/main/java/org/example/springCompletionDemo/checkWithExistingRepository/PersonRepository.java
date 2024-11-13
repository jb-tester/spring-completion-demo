package org.example.springCompletionDemo.checkWithExistingRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query("select e from Person e where e.firstname = :name and e.lastname = :surname")
    List<Person> getByNameAndSurname(String name, String surname);

    List<Person> findByFirstnameAndLastname(String firstname, String lastname);


}
