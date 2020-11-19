package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	@RequestMapping(value="cookie")
	public String myCookie(HttpServletResponse response
			,@CookieValue(value="myCookie", required=false) Cookie cook
			, Model model
			,HttpServletRequest request) {
		System.out.println("cook : " + cook);
		// @CookieValue(value="cookieName", required=fase) Cookie cook
		// required가 없으면 에러가 발생함
		// maxAge를 10초로 설정했기 때문에 10초안에 받아야함, 즉 10초가 지난다면 쿠키가 없기 때문에 에러가 발생함
		// 에러를 방지하기 위해서 required=false => 해당하는 값이 없다면 null이 반환됨
		// 콘솔에 null이 찍히는걸 볼 수 있음
		
		/*
		if(cook == null) {
			Cookie cookie = new Cookie("myCookie", "쿠키생성");
			cookie.setMaxAge(10);
			response.addCookie(cookie);
			return "cookie";
			// cookie.jsp에서 cook이라는 속성이 없을 때 팝업창을 띄움
		}
		// 하위 기능은 쿠키가 있을 때 실행되는 기능임.
		model.addAttribute("cook", cook.getValue());
		return "cookie";
		*/
		
		if(cook != null) {
			model.addAttribute("cook", cook.getValue());
		}
		return "cookie";
	}
	@RequestMapping("popup")
	public String popup() {
		return "popup";
	}
	@RequestMapping("cookieChk")
	public String cookieChk(HttpServletResponse response) {
		// 이 메서드를 void형으로 바꾸면 안됨 => 결국내가한거랑 똑같은데용;;
		Cookie cook = new Cookie("myCookie", "나의쿠키");
		cook.setMaxAge(10); // 하루 계산해서 넣으면 됨, 지금은 10초
		cook.setPath("/");
		response.addCookie(cook);
		return "close";
	}
}
