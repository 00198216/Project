package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.services.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService Service3;

	@RequestMapping(value="/StateUser",method= RequestMethod.POST)
	public ModelAndView SaveS(@RequestParam(value="id") int id){
		ModelAndView mav = new ModelAndView("redirect:/User");	
		
			Service3.UpdateU(id);
		
		return mav;
	}
	
	@RequestMapping(value= "/Ret3")
	public ModelAndView Movies() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("HomeAdmin");
		return mav;
	}
	
}
