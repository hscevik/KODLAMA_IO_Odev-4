package odev4;

public class CampaignManager implements CampaignInterface{

	CampaignInterface campaignInterface;
	
	public  CampaignManager(CampaignInterface campaignInterface) {
		this.campaignInterface=campaignInterface;
	}
	
	public void add(Campaign campaign) {
		campaignInterface.add(campaign);
		
	}
	public void update(Campaign campaign) {
		campaignInterface.update(campaign);
		
	}
	public void delete(Campaign campaign) {
		campaignInterface.delete(campaign);
		
	}
}
