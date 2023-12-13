package com.anand;

public class ProductOf2DigitNos {

	public static void main(String[] args) {
		
		int[] arr= {5,12,4,21,2,3,7,9,11};
		
		double prod=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>9 && arr[i]<100)
				prod=prod+arr[i];
		}
		System.out.print("Product of 2 digits nos"+prod);
	}

}
