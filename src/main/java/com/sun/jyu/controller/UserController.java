package com.sun.jyu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.jyu.pojo.User;
import com.sun.jyu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
