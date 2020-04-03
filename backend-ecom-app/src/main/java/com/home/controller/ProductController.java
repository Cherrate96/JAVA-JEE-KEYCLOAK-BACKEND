package com.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.home.domain.Product;
import com.home.repository.ProductRepository;

@Controller
@CrossOrigin("*")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/products")
	

	public String listproducts(Model model)
	{
		model.addAttribute("products", productRepository.findAll());
		return "products";

	}
	
	@GetMapping("/prod")
	@ResponseBody
	public List<Product> getList()
	{
		return productRepository.findAll();
	}
	
	

}
