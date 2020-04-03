package com.home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.domain.Product;
import com.home.repository.ProductRepository;

@SpringBootApplication
public class BackendEcomAppApplication implements CommandLineRunner{
@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackendEcomAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		productRepository.save(new Product(null, "HP", 8000, 33));
		productRepository.save(new Product(null, "DELL", 9000, 87));
		productRepository.save(new Product(null, "LENOVO", 6000, 92));
		List<Product> products=productRepository.findAll();
		for (Product p : products) {
			System.out.println(p.getName());
		}
	

	}

}
