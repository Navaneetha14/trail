package com.spicehub.cart;

import com.spicehub.product.Product;

/**
 * This interface holds all the cart activities related to a customer.
 * 
 * @author neetha_rddy
 */
public interface CartActivities 
{
	public Cart getCartDetails(String loginKey);
	
	public void addProducts(Product product);
	
	public void removeProduct(Product product);

}
