package com.electronicsstore.service;

import com.electronicsstore.domain.Product;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	@Override
	public boolean placeOrder(int productId) {
		boolean orderFulfilled=false;
        Product product=new Product();
        product.setId(productId);
        
		if(productService.isAvailable(product))
        {
            System.out.println("Product with ID: "+ product.productId+" is available.");
            boolean paymentConfirmed= PaymentService.makePayment();
            if(paymentConfirmed){
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled=true;
            }
        }
        return orderFulfilled;
        
	}
	
    Object productService;

	
}
