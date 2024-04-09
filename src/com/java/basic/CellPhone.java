package com.java.basic;

public class CellPhone {
	private String ownerName;
	private String phoneNumber;
	private String mailAddress;

	CellPhone(String owner, String number, String mail) {
		this.ownerName = owner;
		this.phoneNumber = number;
		this.mailAddress = mail;
	}
	
	public void call(String number) {
		System.out.println(this.getOwnerName() + "から" + number + "電話をかけます。");
	}

	public void sendMail(String mailAddress, String Message) {
		System.out.println(this.getOwnerName() + "から" + mailAddress + "へ" + Message + "とメールを送ります。");
	}

	public String getOwnerName() {
		return this.ownerName;
	}
}
