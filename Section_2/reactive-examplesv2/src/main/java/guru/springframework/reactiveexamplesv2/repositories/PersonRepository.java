package guru.springframework.reactiveexamplesv2.repositories;

import guru.springframework.reactiveexamplesv2.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository {

    Mono<Person> getById(Integer id);
    Flux<Person> findAll();
}
