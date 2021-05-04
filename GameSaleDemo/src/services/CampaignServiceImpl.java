package services;


import entities.Campaign;
import entities.Member;

public class CampaignServiceImpl implements CampaignService{

	@Override
	public void save(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is saved as campaign");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is updated");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is deleted");
		
	}

}
