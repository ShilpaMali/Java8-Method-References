package com.velocity.instance.methods;

public class TestImpl1 {
	public void get(int i, int j) {
		int k = i + j;
		System.out.println(k);
	}

	public static void main(String[] args) {

		TestImpl1 testImpl1 = new TestImpl1();
		Test test = testImpl1::get; //:: method references
		test.getAddition(10, 20);
	}

}
