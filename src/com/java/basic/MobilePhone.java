package com.java.basic;

public class MobilePhone {

	String user;
	String phoneNo;
	
	MobilePhone(String user,String phoneNo) {
		this.user = user;
		this.phoneNo = phoneNo;
	}
	
	public void sendMail(String sendTo,String message) {
		MailApplication mailApp= new MailApplication();
		mailApp.sendMessage(sendTo,message);
		mailApp.endApp();
	}
	
	private class MailApplication{
		MailApplication() {
			System.out.println("メールアプリを開きました。");
		}
		
	void sendMessage(String sendTo,String message) {
		System.out.println("下記のメールを送りました。\n====================");
		System.out.println("To:"+sendTo);
		System.out.println("from:"+user);
		System.out.println("Message:"+message+"\n====================");
	}
	
	void endApp() {
		System.out.println("メールアプリを閉じました。");
	}
	}
	

}
