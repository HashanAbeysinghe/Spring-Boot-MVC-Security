package com.hashandk90.mvcsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hashandk90.mvcsecurity.services.UserInfoService;

@Controller
@RequestMapping("app")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@GetMapping("login")
	public ModelAndView login() {
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("custom-login");
	    return mav;
        }	
	@GetMapping("secure/article-details")
	public ModelAndView getAllUserArticles() {
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("userArticles", userInfoService.getAllUserArticles());
	    mav.setViewName("articles");
	    return mav;
        }
	@GetMapping("error")
	public ModelAndView error() {
	    ModelAndView mav = new ModelAndView();
	    String errorMessage= "You are not authorized for the requested data.";
	    mav.addObject("errorMsg", errorMessage);
	    mav.setViewName("403");
	    return mav;
        }		
} 