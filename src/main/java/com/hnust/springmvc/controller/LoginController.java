package com.hnust.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/login.form")
    public String excute(){
		//������Ӧ������ģ�ͽ������ݴ���
		System.out.println("-----HelloController-excute----");
		return "ok";//������ͼ�����
    }
}
