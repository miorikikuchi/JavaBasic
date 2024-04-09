package com.java.basic;

public class DellTabletPC implements TabletPCInterface {
	private String memory;
	private String computerName;
	private String data;
	private String inputMode;
	
	public DellTabletPC(String name) {
		this.computerName = name;
		this.memory = "Default file";
		this.inputMode = INPUT_KEY;
	}
	
	@Override
	public void boot() {
		System.out.println(computerName+"：パソコンを起動しました。");
	}
	
	@Override
	public void shutDown() {
		System.out.println(computerName+"：パソコンをシャットダウンしました。");
	}
	
	@Override
	public void input(String input) {
		if(inputMode.equals(INPUT_KEY)) {
			System.out.println(computerName+"：キーボードで"+input+"が入力されました。");
		}else {
			System.out.println(computerName+"：タッチパネルで"+input+"が入力されました。");
		}
		this.data = input;
		this.calcurate();
		this.memory();
	}
	
	@Override
	public String output() {
		return this.memory;
	}
	
	@Override
	public void calcurate() {
		System.out.println(computerName+"：パソコンが"+this.data+"の処理を行いました。");
	}
	
	@Override
	public void memory() {
		System.out.println(computerName+"：データを記憶しました。");
	}
	
	@Override
	public void openApplication() {
		System.out.println(computerName+"：アプリを開きました。");
	}
	
	@Override
	public void changedInput() {
		if(inputMode.equals(INPUT_KEY)) {
			inputMode = INPUT_TOUCH;
			System.out.println(computerName+"：入力モードが"+INPUT_TOUCH+"に切り替わりました。");
		}else {
			inputMode = INPUT_KEY;
			System.out.println(computerName+"：入力モードが"+INPUT_KEY+"に切り替わりました。");
		}
	}
}
