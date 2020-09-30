package AddressBook;

public class Details {
		private String firstName;
		private String lastName;
		private long phoneNumber;
		private String emailId;
		private String address;
		private String city;
		private String state;
		private long zipCode;
		

		public Details(String firstName, String lastName, long phoneNumber, String emailId, String address, String city, String state,
			long zipCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.address = address;
	}

		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getZipCode() {
			return zipCode;
		}
		public void setZipCode(long zipCode) {
			this.zipCode = zipCode;
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
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
}
