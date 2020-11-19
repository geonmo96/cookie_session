package com.care.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("login")
public class LoginController {

	@RequestMapping(value="login")
	public String login() {
		
		return "/login/login";
	}
	
	@PostMapping("chkUser")
	public String chkUser(@RequestParam("id") String id
			,@RequestParam("pw") String pw
			, HttpSession session) {
		String sid = "1";
		String spw = "1";
		String nickName = "홍길동";
		if(sid.equals(id) && spw.equals(pw)) {
			session.setAttribute("loginUser", nickName);
			return "login/main";
		} else {
			return "redirect:login";
		}
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		/*
String message = "<script>alert("로그아웃 되었습니다");"+
					"location.href="login";</script>";
HttpHeaders responseHeader = new HttpHeaders();
responseHeader.add("Content-Type", "text/html; charset=utf-8");
ResponseEntity resEnt = 
new ResponseEntity(message,responseHeader,HttpStatus.CREATED );
		 */
		return "/login/logout";
	}
	
	@RequestMapping(value="main")
	public String main() {
		return "/login/main";
	}
}
