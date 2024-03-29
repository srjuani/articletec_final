package com.hampcode.articlesapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hampcode.articlesapp.model.Article;

public interface ArticleService {

	List<Article> getAllArticles();

	Article createArticle(Article article);

	Article updateArticle(Long id, Article article);

	void deleteArticle(Long articleId);

	Article findById(Long id);
	
	/**
     * @return newest article
     */
    Article getLatestEntry();

    /**
     * tests whether there is an article with te same title and author in the database
     * @param article
     * @return true if there is no article with the same author and title in the database
     */
    boolean titleAndAuthorValid(Article article);

	

	//Pagination
    Page<Article> findAll(Pageable pageable);

}