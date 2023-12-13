package com.anand;

public class Max {

	public static void main(String[] args) {
		int[] arr= {5,12,4,21,2,3,7,9};
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print("Max : "+max);
	}

}
