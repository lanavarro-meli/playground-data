package dh.meli.springelastic.service;

import dh.meli.springelastic.model.Article;
import dh.meli.springelastic.repository.IArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service

public class ArticleService implements IArticleServices{
    @Autowired
    private IArticleRepository repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }

    @Override
    public Article findById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Article> findAll() {
        return repo.findAllArticles();
//        List<Article> list = new ArrayList<>();
//        Iterable<Article> resp = repo.findAll();
////        resp.forEach( a -> {
////            list.add(a);
////        });
//        resp.forEach(list::add);
//        return list;
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);

    }

    @Override
    public Article update(Article article) {
        return repo.save(article);
    }

    @Override
    public Page<Article> getPageByTitle(String title, Pageable pg) {
        return repo.findByTitle(title,pg);
    }
}
