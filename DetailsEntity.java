package entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="resister_details")
	public class DetailsEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
			
		@Column(name="mobileNumber")
		private long mobileNumber;
		@Column(name="fullName")
		private String fullName;
		@Column(name="emailAddress")
		private String emailAddress;
		@Column(name="countryCode")
		private int countryCode;
		@Column(name="password")
		private String password;

		public String getFullName() {
			return fullName;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public int getCountryCode() {
			return countryCode;
		}

		public long getMobileNumber() {
			return mobileNumber;
		}

		public String getPassword() {
			return password;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		public void setCountryCode(int countryCode) {
			this.countryCode = countryCode;
		}

		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public void setPassword(String password) {
			this.password = password;
		}


}
