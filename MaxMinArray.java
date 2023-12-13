package com.anand;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 3, 7, 2, 9, 1 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximan element in the array:" + max);
		System.out.println("Minmum element in the array:" + min);
	}

}
