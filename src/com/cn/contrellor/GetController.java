package com.cn.contrellor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GetController {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String four(HttpServletRequest request) {
		request.setAttribute("attr", "def");
		return "hi";

	}
}
