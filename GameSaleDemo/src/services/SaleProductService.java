package services;

import entities.Campaign;
import entities.Member;
import entities.Product;

public interface SaleProductService {

	public void saleProductToMember(Member member, Product product);
	public void saleProductToMember(Member member, Product product, Campaign campaign);
	
}
