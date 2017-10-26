package com.zhidi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhidi.entity.User;

@Controller
public class IndexController {
	/*
	 * @RequestMapping(value="/index",method=RequestMethod.GET,params=
	 * "username")
	 */
	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("username", "…Ú¥Û≈Ù");
		return "index";
	}
	@RequestMapping("/byjson")
	public void json(HttpServletResponse response) throws IOException{
		response.setContentType("application/json");
		PrintWriter writer = response.getWriter();
		writer.print("{\"name\":\"’≈»˝\"}");
		writer.flush();
		writer.close();
	}
	
	/*@RequestMapping("/user")
	public String user(HttpServletRequest request,User user) throws UnsupportedEncodingException{
		System.out.println(user);
		return "index";
	}*/
	
	@RequestMapping("/{date},{moment}/date")
	public String forwardDate(@PathVariable("date")Date date,
							  @PathVariable("moment")String moment){
		System.out.println(date);
		System.out.println(moment);
		return "userformjsp";
	}
	
	@RequestMapping("/user")
	public String user(User user){
		System.out.println(user);
		return "index";
	}
	
	
}
