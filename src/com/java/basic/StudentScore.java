package com.java.basic;

import java.util.ArrayList;

public class StudentScore {
	private String studentName;
	private ArrayList<Score> scorelist;

	StudentScore(String studentName) {
		this.studentName = studentName;
		this.scorelist = new ArrayList<Score>();
	}

	void printStudentScores() {
		scorelist.forEach(s -> System.out.println(String.format("生徒名：%s 科目：%s 点数：%d", studentName, s.getSubject(), s.score)));

	}

	void setScore(Subject subject, int score) {
		Score s = new Score(subject, score);
		scorelist.add(s);
	}

	public class Score {
		Subject subject;
		int score;

		public Score(Subject subject, int x) {
			this.subject = subject;
			this.score = x;
		}

		public String getSubject() {
			switch (this.subject) {
			case JAPANESE:
				return "日本語";
			case ENGLISH:
				return "英語";
			case MATH:
				return "数学";
			case SOCIAL:
				return "社会";
			case SCIENCE:
				return "理科";
			default:
				return "その他";
			}
		}
	}

	enum Subject {
		JAPANESE, ENGLISH, MATH, SOCIAL, SCIENCE
	}
}
