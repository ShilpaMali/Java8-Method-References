package com.velocity.instance.methods;

public class TestImpl {
	public void get(int i, int j) {
		int k = i + j;
		System.out.println(k);
	}

	public static void main(String[] args) {

		TestImpl testImpl = new TestImpl();
		Test test = (a, b) -> {
			testImpl.get(a, b);
		};
	}

}
