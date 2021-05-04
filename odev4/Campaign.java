package odev4;

public class Campaign implements CampaignInterface{
	private int id;
	private String name;
	private int discountRate;

	public Campaign() {
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public void add(Campaign campaign) {
    System.out.println("Kampanya Eklendi : "+"ID : "+this.getId()+" KAMPANYA ADI : "+this.getName());		
	}

	@Override
	public void update(Campaign campaign) {
	    System.out.println("Kampanya Güncellendi : "+"ID : "+this.getId()+" KAMPANYA ADI : "+this.getName());		
		
	}

	@Override
	public void delete(Campaign campaign) {
	    System.out.println("Kampanya Silindi : "+"ID : "+this.getId()+" KAMPANYA ADI : "+this.getName());		
		
	}
}
