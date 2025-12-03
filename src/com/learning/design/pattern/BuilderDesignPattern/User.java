package com.learning.design.pattern.BuilderDesignPattern;

class User {

	private final String userId;
	private final String username;
	private final String emailId;
	
	private User(UserBuilder builder) {
		//initialize
		this.userId=builder.userId;
		this.username=builder.username;
		this.emailId=builder.emailId;
		
	}

	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", emailId=" + emailId + "]";
	}

	public String getUserId() {
		return userId;
	}

	

	public String getUsername() {
		return username;
	}



	public String getEmailId() {
		return emailId;
	}

	
	//Inner class To Create Object
	
	static class UserBuilder{
		
		private  String userId;
		private  String username;
		private  String emailId;
		
		public UserBuilder() {
			
		}
		
		
		public static UserBuilder builder() {
			return new UserBuilder();
		}
		
		
		
		
		
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		
		public UserBuilder setUsername(String username) {
			this.username = username;
			return this;
		}
	
		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		
		
		public User build() {
			User user=new User(this);
			return user;
			
		}
		
	}
	
	
	
}
