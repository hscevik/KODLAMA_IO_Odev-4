package odev4;

public class IndividualCustomer extends Customer implements CustomerInterface {
	private long tcNo;
	private String firstName;
	private String lastName;
	private int birthayYear;

	
	public long getTcNo() {
		return tcNo;
	}


	public void setTcNo(long tcNo) {
		this.tcNo = tcNo;
	}


	public IndividualCustomer() {
	// TODO Auto-generated constructor stub
	}


	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getBirthayYear() {
		return birthayYear;
	}


	public void setBirthayYear(int birthayYear) {
		this.birthayYear = birthayYear;
	}

	public boolean checkTcNo(Customer customer) {
		boolean sonuc=this.getBirthayYear()==1985;
		return	sonuc;
     }
		
	

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if(checkTcNo(customer)) {
		System.out.println("Bireysel Müþteri Eklendi :" +" ID : "+this.getId()+" Adý : "+this.getFirstName()+" Soyadý : "+this.getLastName());
		}
		else {
			
			System.out.println("Bireysel Müþteri ekleme sýrasýnda hata oluþtu: TC Kimlik numarasý geçersiz.");
		}
	}


	@Override
	public void update(Customer customer) {
		if(checkTcNo(customer)) {
		System.out.println("Bireysel Müþteri güncellendi :" +" ID : "+this.getId()+" Adý : "+this.getFirstName()+" Soyadý : "+this.getLastName());
		}
		else {
			
			System.out.println("Bireysel Müþteri güncelleme sýrasýnda hata oluþtu: TC Kimlik numarasý geçersiz.");
		}
	}


	@Override
	public void delete(Customer customer) {
		System.out.println("Bireysel Müþteri Silindi :" +" ID : "+this.getId()+" Adý : "+this.getFirstName()+" Soyadý : "+this.getLastName());
		
	}


	

	
}
