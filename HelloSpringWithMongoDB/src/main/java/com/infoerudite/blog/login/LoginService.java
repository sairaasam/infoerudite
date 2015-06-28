package com.infoerudite.blog.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.infoerudite.blog.model.BiograhicInformation;
import com.infoerudite.blog.model.LoginInformation;
import com.infoerudite.blog.model.UserInformation;
import com.infoerudite.blog.model.UserQA;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

@Repository
public class LoginService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public static final String COLLECTION_NAME = "UserInformation";
	
	
	public void createUser(final LoginCredentials credentials){
		
	}

	public boolean authenticateUser(String userId) {
		// validate if the user already exists
		if (mongoTemplate.collectionExists(UserInformation.class)) {
			// authenticate the user to login
			if (getUserInformation().getLoginInformation().getUserId()
					.equalsIgnoreCase("sraasam")
					&& getUserInformation().getLoginInformation().getPassword()
							.equalsIgnoreCase("Mango6001")) {

			} else {
				// Invalid Login - Try again (or) Reset your Password
			}

		} else {

		}

		return false;

	}

	public UserInformation getUserInformation() {
		return new UserInformation.UserInformationBuilder()
				.loginInformation(getLoginInformation())
				.biograhicInformation(getBiograhicInformation())
				.userQA(getUserQA()).build();
	}

	public LoginInformation getLoginInformation() {
		return new LoginInformation.LoginInformationBuilder("sraasam",
				"Mango6001").build();
	}

	public BiograhicInformation getBiograhicInformation() {
		return new BiograhicInformation.BiograhicInformationBuilder("sai",
				"raasam", "123-123-123").dob("09-09-1987")
				.email("sraasam@yahoo.com").phone("189-901-0987").build();
	}

	public UserQA getUserQA() {
		return new UserQA.UserQABuilder("What is your favorite Car ?",
				"In which city were you born ?", "Who is your first crush ?",
				"Honda Accord", "Hyderabad", "Suzy").build();
	}
	
	
	public void addUser() {
		if (!mongoTemplate.collectionExists(UserInformation.class)) {
			mongoTemplate.createCollection(UserInformation.class);
		}	
		
		DBCollection collection = mongoTemplate.getCollection(COLLECTION_NAME);
		  
		BasicDBObject inQuery = new BasicDBObject();
		List<String> list = new ArrayList<String>();
		list.add("123-123-123");		
		inQuery.put("ssn", new BasicDBObject("$in", list));
		DBCursor cursor = collection.find(inQuery);
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
		mongoTemplate.insert(getUserInformation(), COLLECTION_NAME);
	}

}
