package dh.meli.springii.springdataii.repository;

import dh.meli.springii.springdataii.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepository extends CrudRepository<Subject,Long> {
}
