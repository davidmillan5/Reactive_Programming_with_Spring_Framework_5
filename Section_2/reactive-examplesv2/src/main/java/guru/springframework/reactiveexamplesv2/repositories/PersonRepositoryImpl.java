package guru.springframework.reactiveexamplesv2.repositories;

import guru.springframework.reactiveexamplesv2.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = new Person(1,"Michael","Weston");
    Person fiona = new Person(2,"Fiona","Glenanne");
    Person sam = new Person(3,"Sam","Axe");
    Person jesse = new Person(4,"Jesse","Porter");
    @Override
    public Mono<Person> getById(final Integer id) {
        return findAll().filter(person -> person.getId()== id).next();
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(michael,fiona,sam,jesse);
    }
}
