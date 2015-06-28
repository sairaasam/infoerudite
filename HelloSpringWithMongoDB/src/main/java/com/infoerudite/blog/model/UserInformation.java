package com.infoerudite.blog.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.infoerudite.blog.model.LoginInformation.LoginInformationBuilder;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

@Document
public class UserInformation {

	@Id
	private ObjectId _id;
	private LoginInformation loginInformation;
	private BiograhicInformation biograhicInformation;
	private UserQA userQA;

	public UserInformation(UserInformationBuilder userInformation) {
		super();
		this._id = userInformation._id;		
		this.loginInformation = userInformation.loginInformation;
		this.biograhicInformation = userInformation.biograhicInformation;
		this.userQA = userInformation.userQA;
	}

	public ObjectId get_id() {
		return _id;
	}
	
	public LoginInformation getLoginInformation() {
		return loginInformation;
	}

	public BiograhicInformation getBiograhicInformation() {
		return biograhicInformation;
	}

	public UserQA getUserQA() {
		return userQA;
	}

	public static class UserInformationBuilder {

		private ObjectId _id;	
		private LoginInformation loginInformation;
		private BiograhicInformation biograhicInformation;
		private UserQA userQA;

		public UserInformationBuilder _id(ObjectId _id) {
			this._id = _id;
			return this;
		}
		
		public UserInformationBuilder loginInformation(LoginInformation loginInformation){
			this.loginInformation = loginInformation;
			return this;
		}

		public UserInformationBuilder biograhicInformation(BiograhicInformation biograhicInformation) {
			this.biograhicInformation = biograhicInformation;
			return this;
		}

		public UserInformationBuilder userQA(UserQA userQA) {
			this.userQA = userQA;
			return this;
		}

		public UserInformation build() {
			UserInformation result = new UserInformation(this);
			return result;
		}

	}

}
