package com.java.basic;

public class Lesson5 {

	public static void main(String[] args) {
		int[] scores = {10,35,42,120,99};
		
		InputScore inputscore= new InputScore();
		
		try {
			for(int score :scores) {
				inputscore.setScore(score);
			}
			System.out.println(String.format("作業が完了しました。合計点数は、%dです。",InputScore.sum));
		}catch(OutOfRangeTestScoreException e) {
			System.out.println(e.getMessage()+"作業を異常終了します。");
		}

	}

}
