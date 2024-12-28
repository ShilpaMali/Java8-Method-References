package com.velocity.statics.methods;

public class TestImpl {
	public static void get(int i, int j) {
		int k = i + j;
		System.out.println(k);
	}

	public static void main(String[] args) {

		Test test = TestImpl::get; //:: method references
		test.getAddition(10, 20);
	}

}
