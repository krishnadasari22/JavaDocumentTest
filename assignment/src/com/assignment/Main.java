package com.assignment;
public class Main {
	static int series(int n) {
		int sums=0;
		for(int i=1;i<n;i++) 
			sums +=(i*i);
			return sums;
	}

	public static void main(String[] args) {
		int n=3;
		int result=series(n);
		System.out.println(result);

	}

}
