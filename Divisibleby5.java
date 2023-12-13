package com.anand;

public class Divisibleby5 {

	public static void main(String[] args) {
		int[] arr= {5,12,4,21,8,2,3,7,9,11};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0)
				System.out.println(arr[i]);
		}

	}

}
