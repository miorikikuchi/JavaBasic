package com.java.basic;

public class MobilePhone {

	String user;
	String phoneNo;
	String language;
	
	MobilePhone(String user,String phoneNo) {
		this.user = user;
		this.phoneNo = phoneNo;
		this.language = LanguageSetting.setLanguage(LanguageSetting.DEFAULT_LANGUAGE);
	}
	
	public void sendMail(String sendTo,String message) {
		MailApplication mailApp= new MailApplication();
		mailApp.sendMessage(sendTo,message);
		mailApp.endApp();
	}
	
	public void setLanguage(String language) {
		this.language = LanguageSetting.setLanguage(language);
		System.out.println("言語を"+this.language+"に設定しました。\n");
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
	
	static class LanguageSetting {
	
	static final String DEFAULT_LANGUAGE = "英語";
	static String setLanguage(String language) {
		if("英語".equals(language) || "English".equals(language)) {
			return "英語";
		}else if("日本語".equals(language) || "Japanese".equals(language)) {
			return "日本語";
		}else {
			return DEFAULT_LANGUAGE;
		}
	}
	}

}
