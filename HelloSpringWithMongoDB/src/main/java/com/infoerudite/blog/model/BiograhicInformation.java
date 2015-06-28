package com.infoerudite.blog.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BiograhicInformation {

	private final String firstName; //required
	private final String lastName; //required
	private final String ssn; //required
	private String dob; //optional
	private String email; //optional
	private String phone; //optional

	
	public BiograhicInformation(BiograhicInformationBuilder biograhicInformationBuilder) {
		super();
		this.firstName = biograhicInformationBuilder.firstName;
		this.lastName = biograhicInformationBuilder.lastName;
		this.dob = biograhicInformationBuilder.dob;
		this.email = biograhicInformationBuilder.email;
		this.phone = biograhicInformationBuilder.phone;
		this.ssn = biograhicInformationBuilder.ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDob() {
		return dob;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getSsn() {
		return ssn;
	}
	
	public static class BiograhicInformationBuilder{
		private final String firstName;
		private final String lastName;
		private final String ssn;
		private String dob;
		private String email;
		private String phone;
		
		public BiograhicInformationBuilder(String firstName, String lastName, String ssn) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.ssn = ssn;
		}

		public BiograhicInformationBuilder dob(String dob) {
			this.dob = dob;
			return this;
		}
			
		public BiograhicInformationBuilder email(String email) {
			this.email = email;
			return this;
		}

		public BiograhicInformationBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public BiograhicInformation build() {
			BiograhicInformation result = new BiograhicInformation(this);			
			return result;
		}
				
	}
	
}


