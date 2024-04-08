package com.java.basic;

import java.util.ArrayList;
import java.util.HashMap;

public class Lesson2 {

	public static void main(String[] args) {
		int[] scores = {40,32,50};
		double sum =0;
		double average = 0.0;
		
		ArrayList<Integer> scoresList = new ArrayList<Integer>();
		HashMap<String,Integer> scoresMap = new HashMap<String,Integer>();
		
		scoresList.add(40);
		scoresList.add(32);
		scoresList.add(50);
		scoresList.add(70);
		scoresList.add(80);	
		scoresMap.put("国語:",40);
		scoresMap.put("数学:",32);
		scoresMap.put("英語:",50);
		scoresMap.put("社会:",70);
		scoresMap.put("理科:",80);
		
		scoresList.set(0,50);
		scoresMap.put("国語:",50);
		
		
		for(int i =0; i <scoresList.size(); i++) {
			sum += scoresList.get(i);
		}
		average = sum / scoresList.size();
		
		for(String key : scoresMap.keySet()) {
			System.out.println("科目:"+key+"\t 点数:"+scoresMap.get(key));
		}
		
		System.out.println("合計点:"+sum);
		System.out.println("平均点:"+average);
	}

}
