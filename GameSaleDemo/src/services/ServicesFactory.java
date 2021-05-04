package services;

public class ServicesFactory {

	private MemberServiceImpl memberServiceImpl;
	private CampaignServiceImpl campaignServiceImpl;
	private ProductServiceImpl productServiceImpl;
	private SaleProductServiceImpl saleProductServiceImpl;
	
	public ServicesFactory(MemberServiceImpl memberServiceImpl, CampaignServiceImpl campaignServiceImpl,
			ProductServiceImpl productServiceImpl,  SaleProductServiceImpl saleProductServiceImpl) {
		this.memberServiceImpl = memberServiceImpl;
		this.campaignServiceImpl = campaignServiceImpl;
		this.productServiceImpl = productServiceImpl;
		this.saleProductServiceImpl = saleProductServiceImpl;
	}

	public MemberServiceImpl getMemberServiceImpl() {
		return memberServiceImpl;
	}

	public void setMemberServiceImpl(MemberServiceImpl memberServiceImpl) {
		this.memberServiceImpl = memberServiceImpl;
	}

	public CampaignServiceImpl getCampaignServiceImpl() {
		return campaignServiceImpl;
	}

	public void setCampaignServiceImpl(CampaignServiceImpl campaignServiceImpl) {
		this.campaignServiceImpl = campaignServiceImpl;
	}

	public ProductServiceImpl getProductServiceImpl() {
		return productServiceImpl;
	}

	public void setProductServiceImpl(ProductServiceImpl productServiceImpl) {
		this.productServiceImpl = productServiceImpl;
	}

	public SaleProductServiceImpl getSaleProductServiceImpl() {
		return saleProductServiceImpl;
	}

	public void setSaleProductServiceImpl(SaleProductServiceImpl saleProductServiceImpl) {
		this.saleProductServiceImpl = saleProductServiceImpl;
	}
	
	
	
}
