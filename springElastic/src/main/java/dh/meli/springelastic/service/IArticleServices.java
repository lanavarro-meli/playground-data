package dh.meli.springelastic.service;

import dh.meli.springelastic.model.Article;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IArticleServices {
    Article save(Article article);
    Article findById(int id);
    List<Article> findAll();
    void deleteById(int id);
    Article update(Article article);
    Page<Article> getPageByTitle(String title, Pageable pg);
}
