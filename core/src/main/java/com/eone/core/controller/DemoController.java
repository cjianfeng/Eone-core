package com.eone.core.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eone.core.model.DemoModel;
import com.eone.core.services.DemoService;


@Controller
@RequestMapping("/demo")
public class DemoController {

	@Resource  
    private DemoService demoService;  
      
	@RequestMapping("/showDemo")
	public String toIndex(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		DemoModel demo = this.demoService.getDemoById(userId);
		model.addAttribute("demo", demo);
		return "showDemo";
	}
}
