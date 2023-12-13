package com.anand;

public class ProductOfPositiveNos {

	public static void main(String[] args) {
		
		int[] arr= {5,12,4,21,2,3,7,9,11};
		
		double prod=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				prod=prod+arr[i];
		}
		System.out.print("Product of positive nos :"+prod);
	}

}
