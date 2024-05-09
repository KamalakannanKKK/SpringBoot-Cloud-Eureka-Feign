package com.learning.Spring.CloudConsumereurekarippon.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.google.inject.Singleton;
import com.learning.Spring.CloudConsumereurekarippon.Model.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service(value="productservice")
@Singleton
public class ProductService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "fallbackGetProductById")
	public Product getProductbyId(@PathVariable int id) {
		Product product=restTemplate.getForObject("http://product-service/Product/"+id, Product.class);
	return product;
	}
	
	public Product fallbackGetProductById(int id) {
		return new Product(id,"Bottle","cello",111.2);
	}
}
