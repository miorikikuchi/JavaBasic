package com.java.basic;

public class TestData {

	static int DEAD_LINE = 35;
	private  int score;
	private  String name;
	
	static int countName;
	
	public TestData(String name) {
		this.name =name;
		countName++;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getResult() {
		if(this.score >= DEAD_LINE) {
			return "合格";
		}else {
			return "不合格";
		}
	}

}
