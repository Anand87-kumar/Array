package com.anand;

public class Min {

	public static void main(String[] args) {
		int [] arr= {5,12,4,21,2,3,7,9,11};
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.print("Min : "+min);
	}

}
