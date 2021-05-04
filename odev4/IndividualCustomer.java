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
		System.out.println("Bireysel M��teri Eklendi :" +" ID : "+this.getId()+" Ad� : "+this.getFirstName()+" Soyad� : "+this.getLastName());
		}
		else {
			
			System.out.println("Bireysel M��teri ekleme s�ras�nda hata olu�tu: TC Kimlik numaras� ge�ersiz.");
		}
	}


	@Override
	public void update(Customer customer) {
		if(checkTcNo(customer)) {
		System.out.println("Bireysel M��teri g�ncellendi :" +" ID : "+this.getId()+" Ad� : "+this.getFirstName()+" Soyad� : "+this.getLastName());
		}
		else {
			
			System.out.println("Bireysel M��teri g�ncelleme s�ras�nda hata olu�tu: TC Kimlik numaras� ge�ersiz.");
		}
	}


	@Override
	public void delete(Customer customer) {
		System.out.println("Bireysel M��teri Silindi :" +" ID : "+this.getId()+" Ad� : "+this.getFirstName()+" Soyad� : "+this.getLastName());
		
	}


	

	
}
