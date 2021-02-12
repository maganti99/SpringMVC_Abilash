package com.nagesh.api;

public class UserInfo {
	
	private String userName = "Enter Name";
	private String crushName = "Enter Crush Name";
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	
	
	

}
