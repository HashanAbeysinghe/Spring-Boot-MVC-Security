package com.hashandk90.mvcsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hashandk90.mvcsecurity.models.Article;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Integer>{

}
