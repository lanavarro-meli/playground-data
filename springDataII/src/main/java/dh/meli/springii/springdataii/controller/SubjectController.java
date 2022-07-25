package dh.meli.springii.springdataii.controller;

import dh.meli.springii.springdataii.model.Subject;
import dh.meli.springii.springdataii.repository.ISubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private ISubjectRepository repo;

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getById(@PathVariable long id){
        return ResponseEntity.ok(repo.findById(id).get());
    }
}
