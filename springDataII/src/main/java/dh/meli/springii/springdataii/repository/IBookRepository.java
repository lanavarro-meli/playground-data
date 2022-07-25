package dh.meli.springii.springdataii.repository;

import dh.meli.springii.springdataii.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends CrudRepository<Book,Long> {
}
