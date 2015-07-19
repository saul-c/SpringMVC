package com.cn.contrellor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	
	@RequestMapping("/test")
	public ModelAndView two(){
		ModelAndView modelAndView=new ModelAndView("test");
		modelAndView.addObject("attr", "abc");
		return modelAndView;
	}
		
}
