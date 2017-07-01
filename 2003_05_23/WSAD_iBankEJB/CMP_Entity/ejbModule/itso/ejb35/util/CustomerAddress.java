package itso.ejb35.util;

public class CustomerAddress implements java.io.Serializable {
	private java.lang.String fieldCity = new String();
	private java.lang.String fieldStreet = new String();
	private java.lang.String fieldState = new String();
	private java.lang.String fieldZipcode = new String();
	private final static long serialVersionUID = -4771579797517121057L;
	public CustomerAddress() {
		super();
	}
	public CustomerAddress(
		String aStreet,
		String aCity,
		String aState,
		String aZipcode) {
		super();
		setStreet(aStreet);
		setCity(aCity);
		setState(aState);
		setZipcode(aZipcode);
	}
	public java.lang.String getCity() {
		return fieldCity;
	}
	public java.lang.String getState() {
		return fieldState;
	}
	public java.lang.String getStreet() {
		return fieldStreet;
	}
	public java.lang.String getZipcode() {
		return fieldZipcode;
	}
	public void setCity(java.lang.String city) {
		fieldCity = city;
	}
	public void setState(java.lang.String state) {
		fieldState = state;
	}
	public void setStreet(java.lang.String street) {
		fieldStreet = street;
	}
	public void setZipcode(java.lang.String zipcode) {
		fieldZipcode = zipcode;
	}
}