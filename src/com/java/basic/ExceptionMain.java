package com.java.basic;

public class ExceptionMain {

	public static void main(String[] args) {
		Task task = new Task();

		try {
			task.doTask(-10);
			System.out.println("作業を正常に終了しました。");
		} catch (NotPlusException e) {
			System.out.println(e.getMessage()+"作業にエラーが発生しました。作業は完了しておりません。");
		}
	}

}
