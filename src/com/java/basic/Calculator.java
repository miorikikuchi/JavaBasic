package com.java.basic;

public class Calculator {

	
		double result;
		String name;
		static int countCalcu;
		public Calculator(String name) {
			this.name =name;
			countCalcu++;
		}
		public Calculator(String name,int x) {
			this(name);
			this.result = x;
		}
		public Calculator(String name,double x) {
			this(name);
			this.result = x;
		}
		public void init(int a) {
			this.result = a;
		}
		public void add(int a) {
			this.result += a;
		}
		public void sub(int a) {
			this.result -= a;
		}
		public void mult(int a) {
			this.result *= a;
		}
		public void div(int a) {
			this.result /= a;
		}
		public void sqrt() {
			this.result = Math.sqrt(this.result);
		}
		public double getResult() {
			return this.result;
		}
		public String getName() {
			return this.name;
		}

	}


