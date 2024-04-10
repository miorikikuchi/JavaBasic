package com.java.basic;

public class JavaException {

	public static void main(String[] args) {
		String str = "abcdefg";
		int a = 10;
		int b = 2;
		int result;

		try {
			result = a / b;
			System.out.println(result);
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerExceptionエラーが発生しました。");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticExceptionエラーが発生しました。");
			e.printStackTrace();
		}finally {
			System.out.println("データを保存しました。");
		}
	}

}
