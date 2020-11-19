package com.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("session")
public class SessionController {

	@RequestMapping(value="makeSession")
	public String makeSession(HttpServletRequest request, Model model) {
		/*
		model.addAttribute("id", "나야나");
		<!-- scope를 사용하지 않은 변수는 범위가 작은 범위부터 출력됨 -->
		<!-- page > request > session > application -->
		위의 model은 request와 동일한 크기이기 때문에 id는 홍길동이 아닌 나야나가 출력된다.
		*/
		HttpSession session = request.getSession();
		session.setAttribute("id", "홍길동");
		session.setAttribute("age", "20");
		session.setAttribute("addr", "산골");
		return "/session/makeSession";
	}
	
	@RequestMapping(value="resultSession")
	public String resultSession() {
		return "/session/resultSession";
	}
	
	@RequestMapping(value="delSession")
	public String delSession(HttpSession session) {
		session.removeAttribute("id");
		return "/session/delSession";
	}
}
