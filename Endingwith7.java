package com.anand;

public class Endingwith7 {

	public static void main(String[] args) {
		int[] arr= {5,12,4,21,8,2,3,7,9,11};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%10 == 7)
				System.out.println(arr[i]);
		}

	}

}
