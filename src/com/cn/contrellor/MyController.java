package com.cn.contrellor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

	@RequestMapping("/myone")
	public String one(){
		System.out.println("进入 MyContellor");
		return "ok";
				
	}
}
