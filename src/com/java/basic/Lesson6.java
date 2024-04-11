package com.java.basic;

import com.java.basic.StudentScore.Subject;

public class Lesson6 {

	public static void main(String[] args) {
		StudentScore yamadaScore = new StudentScore("山田");
		StudentScore satoScore = new StudentScore("佐藤");

		yamadaScore.setScore(Subject.JAPANESE, 50);
		yamadaScore.setScore(Subject.ENGLISH, 80);
		yamadaScore.setScore(Subject.MATH, 35);
		yamadaScore.setScore(Subject.SOCIAL, 65);
		yamadaScore.setScore(Subject.SCIENCE, 30);

		satoScore.setScore(Subject.JAPANESE, 70);
		satoScore.setScore(Subject.ENGLISH, 30);
		satoScore.setScore(Subject.MATH, 55);

		yamadaScore.printStudentScores();
		satoScore.printStudentScores();

	}

}
