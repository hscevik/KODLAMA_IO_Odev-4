package odev4;

public class CorporateCustomer extends Customer implements CustomerInterface{
	
	private String companyName;
	private String taxNumber;
	
	public CorporateCustomer() {
		
		
		
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	


	@Override
	public void add(Customer customer) {
    System.out.println("Kurusal M��teri Eklendi. "+this.getId()+this.companyName);		
	}

	@Override
	public void update(Customer customer) {
	    System.out.println("Kurusal M��teri G�ncellendi. "+this.getId()+this.companyName);		
		
	}

	@Override
	public void delete(Customer customer) {
	    System.out.println("Kurusal M��teri Silindi. "+this.getId()+this.companyName);		
		
	}
}
