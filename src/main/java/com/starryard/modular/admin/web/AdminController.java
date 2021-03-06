package com.starryard.modular.admin.web;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.val;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private final static String PREFIX = "/admin/";

	@GetMapping("/index")
	public ModelAndView index(ModelAndView mv) {
		mv.setViewName(PREFIX+"index");
		val user = (String) SecurityUtils.getSubject().getPrincipal();
		mv.addObject("user",user);
		return mv;
	}
	
}
