package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Movie;
import com.uca.capas.domain.Showcase;
import com.uca.capas.services.MovieService;
import com.uca.capas.services.ShowcaseService;

@Controller
public class AdminController {
	
	@Autowired
	MovieService Service1;
	
	@Autowired
	ShowcaseService Service2;
	
	@RequestMapping(value= "/Movie")
	public ModelAndView Movies() {
		ModelAndView mav = new ModelAndView();
		List<Movie> movies=Service1.findALL();
		mav.addObject("movies",movies);
		mav.setViewName("Movies");
		return mav;
	}
	
	@RequestMapping(value= "/Showcase")
	public ModelAndView Shows() {
		ModelAndView mav = new ModelAndView();
		List<Showcase> show=Service2.findALL();
		mav.addObject("show",show);
		mav.setViewName("Shows");
		return mav;
	}

}
