package com.anand;

public class SumOf2DigitNos {

	public static void main(String[] args) {
		int[] arr= {5,12,4,21,8,2,3,7,9,11};
		
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>9 && arr[i]<100)
				sum=sum+arr[i];
		}
		System.out.println("Sum of 2 digits"+sum);
	}

}
