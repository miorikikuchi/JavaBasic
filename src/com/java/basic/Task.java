package com.java.basic;

public class Task {
	int a = 10;
	int b;

	public void doTask(int time) throws NotPlusException {
		if (time <= 0) {
			throw new NotPlusException("プラスの値ではありません。");
		}

		for (int i = 0; i < time; i++) {
			System.out.println("タスクを実行しています。");
	}
		System.out.println("タスクが完了しました。");
}
}
