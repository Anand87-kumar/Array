package com.anand;

public class CountOfNoDivisibleby5 {

	public static void main(String[] args) {
		int[] arr= {5,12,4,21,2,3,7,9,11};
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0)
				count++;
		}
		System.out.print("Count of no divisible by 5 :"+count);
	}

}
