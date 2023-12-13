package com.anand;

public class SumOfPositiveNos {

	public static void main(String[] args) {
		
		int[] arr= {5,-12,4,-21,8,2,3,7,9,-11};
		
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				sum=sum+arr[i];
		}
		System.out.println("Sum of Positive Nos"+sum);
	}

}
