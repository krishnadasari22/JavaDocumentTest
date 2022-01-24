package com.assignment;

import java.util.*;

public class Main1 {
	static void sortedArray(int arr[],int n) {
		int [] ans=new int[n];
		Arrays.sort(arr);
		int l=0,r=n-1;
		for(int i=n-1;i>=0;i--) {
			if(i%2==1) {
				ans[i]=arr[l];
				l++;
			}
			else {
				ans[i]=arr[r];
				r--;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,-2,4};
		int n=arr.length;
		sortedArray(arr,n);
		

	}

}
