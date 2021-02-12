package com.nagesh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagesh.api.UserInfo;


@Controller
public class AddControler {
	
	@RequestMapping("/add")	
	public String Add(Model model)
	{
		UserInfo usr = new UserInfo();
		
		usr.setUserName("Selenium");
		usr.setCrushName("Express");
		
		model.addAttribute("HomeUserInfo", usr);
		
		return "Home";
	}
	
	@RequestMapping("/add2")
	public String Add2(@ModelAttribute("HomeUserInfo") UserInfo usr)
	{
		usr.setUserName("Mike");
		usr.setCrushName("Cobol");
		
		return "Home";
	}
	
	@RequestMapping("/process-homepage")	
	public String showResultPage(UserInfo userInfo,
			                     Model model)
	{
		System.out.println("User name is : " + userInfo.getUserName());
		System.out.println("Crush name is : " + userInfo.getCrushName());
		
		//model.addAttribute("UsrNme", userInfo.getUserName());
		//model.addAttribute("CrsNme", userInfo.getCrushName());
		
		model.addAttribute("usrInfo", userInfo);
		
		System.out.println(userInfo.toString());
		
		return "result-page";
	}

}
