package com.java.basic;

public class Calculator {

	
		double result;
		public Calculator(int x) {
			this.result =x;
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

	}


