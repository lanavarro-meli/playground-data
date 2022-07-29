package dh.meli.springelastic.controller;

import dh.meli.springelastic.model.Article;
import dh.meli.springelastic.service.IArticleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private IArticleServices service;



    @GetMapping("/{id}")
    public ResponseEntity<Article> getById(@PathVariable int id){
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<Article>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<Article> saveArticle(@RequestBody Article article){
        return ResponseEntity.ok(service.save(article));
    }

    @PutMapping
    public ResponseEntity<Article> updateArticle(@RequestBody Article article){
        return ResponseEntity.ok(service.update(article));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();

    }
    @GetMapping("title/{title}")
    public Page<Article> getPageByTitle(@PathVariable String title, Pageable pg){
        return service.getPageByTitle(title, pg);
    }

}
