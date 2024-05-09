package com.learning.Spring.CloudConsumereurekarippon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.RequestScope;

import com.learning.Spring.CloudConsumereurekarippon.Model.Product;
import com.learning.Spring.CloudConsumereurekarippon.Service.ProductService;

@RestController
@RequestScope
public class ProductClientController {

	@Autowired
	private ProductService productService;
	@GetMapping("/get-products/{id}")
	public Product getProductbyId(@PathVariable int id) {
		
	return productService.getProductbyId(id);
	}
}
