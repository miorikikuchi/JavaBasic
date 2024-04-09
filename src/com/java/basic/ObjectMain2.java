package com.java.basic;

public class ObjectMain2 {

	public static void main(String[] args) {
		FeaturePhone garaoPhone = new FeaturePhone("ガラ男", "090-0000-0000", "garao@feature.mail.com");
		SmartPhone sumakoPhone = new SmartPhone("スマ子", "080-1111-1111", "sumako@sumart.mail.com");

		garaoPhone.call("0120-000-000");
		sumakoPhone.call("0120-111-111");

		garaoPhone.sendMail("taro@pc.mail.com", "Hey,Taro!i get a new feature phone.");
		sumakoPhone.sendMail("taro@pc.mail.com", "Hey,Taro!i get a new smart phone.");

		sumakoPhone.appOpen("Chat Application");
		
		CellPhone cf = new CellPhone("phone1", "090-9999-9999", "phone1@email.com");
		
	}

}
