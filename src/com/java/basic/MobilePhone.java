package com.java.basic;

public class MobilePhone {

	String user;
	String phoneNo;
	String language;

	MobilePhone(String user, String phoneNo) {
		this.user = user;
		this.phoneNo = phoneNo;
		this.language = LanguageSetting.setLanguage(Languages.ENGLISH);
	}

	public void sendMail(String sendTo, String message) {
		MailApplication mailApp = new MailApplication();
		mailApp.sendMessage(sendTo, message);
		mailApp.endApp();
	}

	public void setLanguage(Languages language) {
		this.language = LanguageSetting.setLanguage(language);
		System.out.println("言語を" + this.language + "に設定しました。\n");
	}

	private class MailApplication {
		MailApplication() {
			System.out.println("メールアプリを開きました。");
		}

		void sendMessage(String sendTo, String message) {
			System.out.println("下記のメールを送りました。\n====================");
			System.out.println("To:" + sendTo);
			System.out.println("from:" + user);
			System.out.println("Message:" + message + "\n====================");
		}

		void endApp() {
			System.out.println("メールアプリを閉じました。");
		}
	}

	static class LanguageSetting {

		static String setLanguage(Languages language) {
			if (Languages.JAPANESE == language) {
				return "日本語";
			} else if (Languages.CHINESE == language) {
				return "中国語";
			} else {
				return "英語";
			}
		}
	}

	enum Languages {
		ENGLISH, JAPANESE, CHINESE
	}

}
