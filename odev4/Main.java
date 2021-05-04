package odev4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		IndividualCustomer bireyselMusteri=new IndividualCustomer();
		bireyselMusteri.setId(1);
		bireyselMusteri.setAdress("Ankara");
		bireyselMusteri.setFirstName("Harun Serteç");
		bireyselMusteri.setLastName("ÇEVÝK");
		bireyselMusteri.setMail("hscevik@hotmail.com");
		bireyselMusteri.setUserName("hsc");
		bireyselMusteri.setPassword("12456");
		bireyselMusteri.setPhone("1234567");
		bireyselMusteri.setBirthayYear(1985);
		
		CustomerManager customerManager=new CustomerManager(bireyselMusteri);
        customerManager.add(bireyselMusteri);
        bireyselMusteri.setBirthayYear(1980);
        customerManager.update(bireyselMusteri);
        bireyselMusteri.setId(1);
        customerManager.delete(bireyselMusteri);
        
        CorporateCustomer kurumsalMusteri=new CorporateCustomer();
        kurumsalMusteri.setId(2);
        kurumsalMusteri.setAdress("Ýstanbul");
        kurumsalMusteri.setCompanyName("ABC YAZILIM");
        kurumsalMusteri.setMail("info@abcyazilim.com");
        kurumsalMusteri.setPhone("2223344");
        kurumsalMusteri.setTaxNumber("8876543345");
        kurumsalMusteri.setUserName("abc");
        kurumsalMusteri.setPassword("66666");
        
        CustomerManager customerManager2=new CustomerManager(kurumsalMusteri);
        customerManager2.add(kurumsalMusteri);
        kurumsalMusteri.setUserName("abcsoft");
        customerManager2.update(kurumsalMusteri);
        customerManager2.delete(kurumsalMusteri);
        
        
        Campaign campaign=new Campaign();
        campaign.setId(1);
        campaign.setName("Kampanya 1");
        campaign.setDiscountRate(10);
        
        CampaignManager campaignManager = new CampaignManager(campaign);
        campaignManager.add(campaign);
        campaignManager.update(campaign);
        campaignManager.delete(campaign);
        
        
       Game game=new Game();
       game.setId(1);
       game.setCategoryId(1);
       game.setName("Oyun 1");
       game.setDetail("Oyun 1 detayý");
       game.setImage("/images/games/1.jpg");
       game.setPrice(100);
       game.setCampaign(campaign);
       
       GameManager gameManager=new GameManager(game);
       gameManager.add(game);
       gameManager.update(game);
       gameManager.delete(game);
       
       Order order=new Order();
       OrderManager orderManager=new OrderManager(order);
       orderManager.buyGame(bireyselMusteri, game);
       orderManager.buyGame(kurumsalMusteri, game);
	}

}
