package com.nonlee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	@RequestMapping("/cart")
    public String addOrEdit(ModelMap model) {
   	 return "cart";
    }
	
}
