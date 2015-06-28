package com.infoerudite.blog.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserQA {

	private final String userQuestion1;
	private final String userQuestion2;
	private final String userQuestion3;
	
	private final String userAnswer1;
	private final String userAnswer2;
	private final String userAnswer3;
	
	public UserQA(UserQABuilder userQABuilder) {
		super();
		this.userQuestion1 = userQABuilder.userQuestion1;
		this.userQuestion2 = userQABuilder.userQuestion2;
		this.userQuestion3 = userQABuilder.userQuestion3;
		this.userAnswer1 = userQABuilder.userAnswer1;
		this.userAnswer2 = userQABuilder.userAnswer2;
		this.userAnswer3 = userQABuilder.userAnswer3;
	}
	public String getUserQuestion1() {
		return userQuestion1;
	}
	public String getUserQuestion2() {
		return userQuestion2;
	}
	public String getUserQuestion3() {
		return userQuestion3;
	}
	public String getUserAnswer1() {
		return userAnswer1;
	}
	public String getUserAnswer2() {
		return userAnswer2;
	}
	public String getUserAnswer3() {
		return userAnswer3;
	}
	public static class UserQABuilder {		
		private final String userQuestion1;
		private final String userQuestion2;
		private final String userQuestion3;
		
		private final String userAnswer1;
		private final String userAnswer2;
		private final String userAnswer3;
		
		public UserQABuilder(String userQuestion1, String userQuestion2,
				String userQuestion3, String userAnswer1, String userAnswer2,
				String userAnswer3) {
			super();
			this.userQuestion1 = userQuestion1;
			this.userQuestion2 = userQuestion2;
			this.userQuestion3 = userQuestion3;
			this.userAnswer1 = userAnswer1;
			this.userAnswer2 = userAnswer2;
			this.userAnswer3 = userAnswer3;
		}

		public UserQA build() {
			UserQA result = new UserQA(this);			
			return result;
		}
	}

	
}


