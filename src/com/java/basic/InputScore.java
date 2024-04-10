package com.java.basic;

public class InputScore {
	static int sum;

	public void setScore(int score) throws OutOfRangeTestScoreException {
		if (100 < score || score < 0) {
			throw new OutOfRangeTestScoreException("点数が不正な値です。：" + score);
		}
		sum += score;
	}

}
