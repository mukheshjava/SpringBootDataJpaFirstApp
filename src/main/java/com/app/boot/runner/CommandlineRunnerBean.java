package com.app.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.boot.model.Product;
import com.app.boot.repo.ProductRepo;
@Component
public class CommandlineRunnerBean implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p =repo.save(new Product("Honor",14999.00));
		Product p1 =repo.save(new Product("Honor7x",14299.00));
		Product p2 =repo.save(new Product("Redmi",14999.00));
		Product p3 =repo.save(new Product("Lenovo",24999.00));
	
	System.out.println("Operations Done From Runner");
	}

}
