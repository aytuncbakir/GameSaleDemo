package services;

import entities.Product;

public class ProductServiceImpl implements ProductService{

	@Override
	public void save(Product product) {
		System.out.println(product.getProductName() + " is saved as Product");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getProductName() + " is updated");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getProductName() + " is deleted");
		
	}

}
