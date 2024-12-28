package com.velocity.constructor;

public class TestImpl {
	public TestImpl(int a, int b) {
		System.out.println("Inside constructor block>>>>>");
	}

	public static void main(String[] args) {

		Test test=TestImpl::new;
		test.getAddition(10, 20);
	}

}
