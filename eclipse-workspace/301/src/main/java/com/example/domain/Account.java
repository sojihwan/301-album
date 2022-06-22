package com.example.domain;

import java.time.LocalDateTime;

public class Account {

	private Long accountId;

	private String username;

	private String nickname;

	private String password;

	private LocalDateTime signUpDate = LocalDateTime.now(); // 회원가입일

	private LocalDateTime withdrawalDate; // 탈퇴일

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getSignUpDate() {
		return signUpDate;
	}

	public void setSignUpDate(LocalDateTime signUpDate) {
		this.signUpDate = signUpDate;
	}

	public LocalDateTime getWithdrawalDate() {
		return withdrawalDate;
	}

	public void setWithdrawalDate(LocalDateTime withdrawalDate) {
		this.withdrawalDate = withdrawalDate;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username + ", nickName=" + nickname + ", password="
				+ password + ", signUpDate=" + signUpDate + ", withdrawalDate=" + withdrawalDate + "]";
	}

}
