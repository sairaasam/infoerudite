package com.infoerudite.blog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LoginInformation {

	@Id
	private final String userId;
	private final String password;

	public LoginInformation(LoginInformationBuilder loginInformationBuilder) {
		this.userId = loginInformationBuilder.userId;
		this.password = loginInformationBuilder.password;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public static class LoginInformationBuilder {
		private final String userId;
		private final String password;

		public LoginInformationBuilder(String userId, String password) {
			super();
			this.userId = userId;
			this.password = password;
		}

		public LoginInformation build() {
			LoginInformation result = new LoginInformation(this);
			return result;
		}

	}

}
