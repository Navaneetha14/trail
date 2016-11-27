package com.spicehub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.spicehub.product.Product;

@RestController
@RequestMapping("/products")
public class ProductController 
{
	//TODO
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Product> getAllProducts()
	{
		List<Product> products = new ArrayList<>();
		
		Product product = new Product(1, "MoongDal", "Snack", new BigDecimal("2.49"), "HaldiGrams", 10);
		products.add(product);
		
		return products;
	}
	
	//TODO
	@RequestMapping(value = "/brand/{brandName}", method = RequestMethod.GET)
	public List<Product> getAllProductsByBrand()
	{
		return null;
	}
	
	//TODO
	@RequestMapping(value = "/category/{categoryName}", method = RequestMethod.GET)
	public List<Product> getAllProductsByCategory(@PathVariable String categoryName)
	{
		return null;
	}
}
