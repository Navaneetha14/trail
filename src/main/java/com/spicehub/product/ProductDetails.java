package com.spicehub.product;

import java.util.List;

/**
 * This interface holds all the activities related to product catalog
 * 
 * @author neetha_rddy
 */
public interface ProductDetails 
{
	public List<Product> getAllProducts();
	
	public void addProduct(Product product);
	
	public void removeProduct(Product product);
}
