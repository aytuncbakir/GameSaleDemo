package main;

import java.util.Date;

import entities.Campaign;
import entities.Member;
import entities.Product;
import services.ServicesFactory;
import services.CampaignServiceImpl;
import services.MemberCheckServiceImpl;
import services.MemberServiceImpl;
import services.ProductServiceImpl;
import services.SaleProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		Member member = new Member(1,"Mahmut","Saka","123456778",new Date(1988,6,7),"Ankara Cincin");
		Product product = new Product(11,"Clash of Clans",1000);
		Campaign campaign = new Campaign(21,"Laptop indirimi", 10);
		ServicesFactory serviceFactory = 
				new ServicesFactory(new MemberServiceImpl(new MemberCheckServiceImpl()), 
						new CampaignServiceImpl(), new ProductServiceImpl(), new SaleProductServiceImpl());
		
		System.out.println("-------------------------------------------\n");
		serviceFactory.getMemberServiceImpl().save(member);
		serviceFactory.getProductServiceImpl().save(product);
		serviceFactory.getCampaignServiceImpl().save(campaign);
		System.out.println("\n-------------------------------------------\n");
		
		serviceFactory.getSaleProductServiceImpl().saleProductToMember(member, product, campaign);
		System.out.println("\n-------------------------------------------\n");
		
		Member member1 = new Member(2,"Selim","Dalan","56454545",new Date(1968,6,7),"Samsun Atakent");
		Product product1 = new Product(12,"Angry Birds",2000);
		serviceFactory.getSaleProductServiceImpl().saleProductToMember(member1, product1);
		System.out.println("\n-------------------------------------------\n");
		
		
		serviceFactory.getMemberServiceImpl().update(member);
		serviceFactory.getMemberServiceImpl().delete(member);
		
		System.out.println("\n-------------------------------------------\n");
		
		product.setUnitPrice(4000);
		campaign.setDiscountRate(20);
		serviceFactory.getSaleProductServiceImpl().saleProductToMember(member, product,campaign);
		System.out.println("\n-------------------------------------------\n");
		
	}

	

}
