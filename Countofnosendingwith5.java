package com.anand;

public class Countofnosendingwith5 {

	public static void main(String[] args) {
		int[] arr= {5,12,4,21,2,3,7,15,9,11};
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%10==5)
				count++;
		}
		System.out.print("Count of no ending with 5: "+count);

	}

}
