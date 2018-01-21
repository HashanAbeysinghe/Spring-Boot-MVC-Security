package com.hashandk90.mvcsecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashandk90.mvcsecurity.models.Article;
import com.hashandk90.mvcsecurity.repositories.ArticleRepo;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	ArticleRepo articleRepo;

	public List<Article> getAllUserArticles() {
		return articleRepo.findAll();
	}

}
