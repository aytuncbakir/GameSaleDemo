package services;

import entities.Campaign;
import entities.Member;
import entities.Product;

public class SaleProductServiceImpl implements SaleProductService{

	@Override
	public void saleProductToMember(Member member, Product product) {
	
		System.out.println("Sales details ");
		System.out.println("Not found available campaign");
		System.out.println("Product Name: "+product.getProductName());
		System.out.println("Product Price: "+product.getUnitPrice());
		System.out.println("Total: "+product.getUnitPrice());
		System.out.println("Buyer : "+member.getFirstName() +" "+ member.getLastName());
		System.out.println("Shipping Adress : "+member.getAddress());
	}

	@Override
	public void saleProductToMember(Member member, Product product, Campaign campaign) {
		
		System.out.println("Sales details");
		System.out.println("Discount campaign has been applied");
		System.out.println("Product Name: "+product.getProductName());
		System.out.println("Product Price: "+product.getUnitPrice());
		int total = applyCampaign( product,  campaign);
		System.out.println("Total: "+total);
		System.out.println("Buyer : "+member.getFirstName() +" "+ member.getLastName());
		System.out.println("Shipping Adress : "+member.getAddress());
		
	}
	
	
	private int applyCampaign(Product product, Campaign campaign) {
		
		int total =   product.getUnitPrice() - ( product.getUnitPrice() * campaign.getDiscountRate() / 100 );
		return total;
	}

}
