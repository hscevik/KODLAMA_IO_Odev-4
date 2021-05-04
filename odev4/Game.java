package odev4;

public class Game implements GameInterface {

	private int Id;
	private int categoryId;
	private String name;
	private String detail;
	private String image;
	private int price;
	private int discountedPrice;
	private Campaign campaign;

	public Game() {
		
		
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getDiscountedPrice() {
		
		return (this.price-(this.getPrice()*campaign.getDiscountRate()/100));
	}


	

	public Campaign getCampaign() {
		return campaign;
	}


	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}


	@Override
	public void add(Game game) {
		System.out.println("Oyun Eklendi. "+" Urun ID : "+this.Id+" Urun Adý : "+this.name+" Oyun Kategorisi :"+this.getCategoryId()+" Fiyatý : "+this.getPrice()+" Kampanya Sonrasý Fiyatý :"+this.getDiscountedPrice());		
	}


	@Override
	public void update(Game game) {
		System.out.println("Oyun ekledi. "+" Urun ID : "+this.Id+" Urun Adý : "+this.name+" Oyun Kategorisi :"+this.getCategoryId()+" Fiyatý : "+this.getPrice()+" Kampanya Sonrasý Fiyatý :"+this.getDiscountedPrice());		
		
	}


	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi. "+" Urun ID : "+this.Id+" Urun Adý : "+this.name+" Oyun Kategorisi :"+this.getCategoryId()+" Fiyatý : "+this.getPrice()+" Kampanya Sonrasý Fiyatý :"+this.getDiscountedPrice());		
		
	}
}
