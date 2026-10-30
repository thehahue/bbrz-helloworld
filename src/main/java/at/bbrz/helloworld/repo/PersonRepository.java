package at.bbrz.helloworld.repo;

import at.bbrz.helloworld.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
