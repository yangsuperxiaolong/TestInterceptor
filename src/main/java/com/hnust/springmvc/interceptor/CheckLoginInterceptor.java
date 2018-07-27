package com.hnust.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckLoginInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//ִ�е�¼��飺����û�Session�Ƿ��е�¼�����Ϣ
		HttpSession session= request.getSession();
		Object user=session.getAttribute("user");
		if(user==null){//û�е�¼��Ϣ
			response.sendRedirect("/springmvc-module1/login.jsp");//�ض��򵽵�¼����
			return false;//��֯controller����
		}else{
			return true;//�Ϸ���ͨ����⣬ִ��controller
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
