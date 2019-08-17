package com.learn.mockito;

public class AddNumbers {

	public int addNum (int a, int b) {
		return a+b;
	}
	public int addNum (long a, long b) {
		return (int) (a+b);
	}
}
