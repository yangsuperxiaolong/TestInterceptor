package com.hnust.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckLoginInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//执行登录检查：检测用户Session是否含有登录添加信息
		HttpSession session= request.getSession();
		Object user=session.getAttribute("user");
		if(user==null){//没有登录信息
			response.sendRedirect("/springmvc-module1/login.jsp");//重定向到登录界面
			return false;//组织controller调用
		}else{
			return true;//合法，通过检测，执行controller
		}
	}
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
