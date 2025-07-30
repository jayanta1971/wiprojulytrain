package com.wipro.webmvc1;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.webmvc1.service.ProdService;

@Controller
@RequestMapping("/prod")
public class ProductController {
	@Autowired
	ProdService prodService;
	
	@GetMapping("/list")
	String showProdList(Model model)
	{ 
		model.addAttribute("prodList", prodService.getProductList());
		return "prodlist";
		
	}
	@GetMapping("/particular")
	String showProd(Model model)
	{
		return "prodlist";
		
	}
	

}
