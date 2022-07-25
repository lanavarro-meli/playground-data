package dh.meli.springii.springdataii.controller;

import dh.meli.springii.springdataii.model.Book;
import dh.meli.springii.springdataii.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookRepository repo;

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable long id){
        return ResponseEntity.ok(repo.findById(id).get());
    }
}
