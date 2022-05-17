package ai.jobiak.icecreams;

public class Address {

	String street;
	String City;
	String State;
	int PostalCode;
	String Country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String state, int postalCode, String country) {
		super();
		this.street = street;
		City = city;
		State = state;
		PostalCode = postalCode;
		Country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(int postalCode) {
		PostalCode = postalCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", City=" + City + ", State=" + State + ", PostalCode=" + PostalCode
				+ ", Country=" + Country + "]";
	}
	
	
}
