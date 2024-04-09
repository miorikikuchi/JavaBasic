package com.java.basic;

public class DellComputer implements ComputerInterface {
	private String memory;
	private String computerName;
	private String data;

	public DellComputer(String name) {
		this.computerName = name;
		this.memory = "Default file";
	}

	@Override
	public void boot() {
		System.out.println(computerName + "：パソコンを起動しました。");
	}

	@Override
	public void shutDown() {
		System.out.println(computerName + "：パソコンをシャットダウンしました。");
	}

	@Override
	public void input(String key) {
		System.out.println(computerName + "：キーボードで" + key + "が入力されました。");
		this.data = key;
		this.calcurate();
		this.memory();
	}

	@Override
	public String output() {
		return this.memory;
	}

	@Override
	public void calcurate() {
		System.out.println(computerName + "：パソコンが" + this.data + "の処理を行いました。");
	}

	@Override
	public void memory() {
		System.out.println(computerName + "：データを記憶しました。");
	}

}
