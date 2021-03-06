package ru.itis.mongohateoas.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.itis.mongohateoas.models.Airline;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@RepositoryRestResource
public interface AirlineRepository extends MongoRepository<Airline, String> {
    @Query(value = "{'name': ?0}")
    List<Airline> find(@Param("name") String name);

}