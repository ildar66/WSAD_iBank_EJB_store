package itso.ejb35.cmp;
import itso.ejb35.util.CustomerAddress;
import com.ibm.vap.composers.VapAttributeComposer;

public class AddressComposer extends VapAttributeComposer {
	private static AddressComposer singleton;
	public static String[] getAttributeNames() {
		String[] attributes = { "street", "city", "state", "zipcode" };
		return attributes;
	}
	public static String[] getSourceDatatype() {
		String[] types = { "String", "String", "String", "String" };
		return types;
	}
	public static String getTargetClassName() {
		return CustomerAddress.class.getName();
	}
	public static void reset() {
		singleton = null;
	}
	public static AddressComposer singleton() {
		if (singleton == null)
			singleton = new AddressComposer();
		return singleton;
	}
	public Object[] dataFrom(Object anObject) {
		Object[] anArray = new Object[] { null, null, null, null };
		if (anObject != null) {
			CustomerAddress address = (CustomerAddress) anObject;
			anArray[0] = address.getStreet();
			anArray[1] = address.getCity();
			anArray[2] = address.getState();
			anArray[3] = address.getZipcode();
		}
		return anArray;
	}
	public Object objectFrom(Object[] anArray) {
		String name, street, city, state, zipcode;
		street = (String) anArray[0];
		city = (String) anArray[1];
		state = (String) anArray[2];
		zipcode = (String) anArray[3];
		return new CustomerAddress(street, city, state, zipcode);
	}
}