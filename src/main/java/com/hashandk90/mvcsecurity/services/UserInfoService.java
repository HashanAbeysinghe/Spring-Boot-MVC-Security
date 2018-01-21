package com.hashandk90.mvcsecurity.services;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.hashandk90.mvcsecurity.models.Article;

public interface UserInfoService {
	 @Secured ({"ROLE_ADMIN"})
     List<Article> getAllUserArticles();
}
