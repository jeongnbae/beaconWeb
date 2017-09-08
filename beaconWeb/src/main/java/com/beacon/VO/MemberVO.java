package com.beacon.VO;

public class MemberVO {
	
	private String userName;
	private String userBirth;
	private String userGender;
	private String userTel;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	@Override
	public String toString() {
		return "Member [userName=" + userName + ", userBirth=" + userBirth + ", userGender=" + userGender + ", userTel="
				+ userTel + "]";
	}

}
