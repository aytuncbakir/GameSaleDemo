package services;


import entities.Product;

public interface ProductService {

	public void save(Product product);
	public void update(Product product);
	public void delete(Product product);
}
