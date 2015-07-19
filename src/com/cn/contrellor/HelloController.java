package com.cn.contrellor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloController {

	@RequestMapping("/hello")
	public String Hello(){
		System.out.println("进入HelloCotellor！");
		return "hello";
	}
}
