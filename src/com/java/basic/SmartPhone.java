package com.java.basic;

public class SmartPhone extends CellPhone {

	SmartPhone(String owner, String number, String mail) {
		super(owner, number, mail);
	}
	
	@Override
	public void sendMail(String mailAddress, String Message) {
		System.out.println(this.getOwnerName() + "から" + mailAddress + "へ" + Message + "とメールアプリを使ってを送ります。");
	}

	public void appOpen(String application) {
		System.out.println(super.getOwnerName() + "" + application + "アプリを開きます。");
	}

}
