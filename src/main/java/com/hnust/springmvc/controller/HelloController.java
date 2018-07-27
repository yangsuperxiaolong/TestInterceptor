package com.hnust.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello.form")
    public String excute(){
		//调用相应的数据模型进行数据处理
		System.out.println("-----HelloController-excute----");
		return "ok";//返回视图组件名
    }
}
