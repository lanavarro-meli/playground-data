package dh.meli.springii.springdataii.service;

import dh.meli.springii.springdataii.model.Author;
import dh.meli.springii.springdataii.repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AuthorService {
    @Autowired
    private IAuthorRepository repo;

    @Transactional
    public Author save(Author author){
        author.getAddress().setAuthor(author);
        return repo.save(author);
    }
}
