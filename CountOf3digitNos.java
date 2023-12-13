package com.anand;

public class CountOf3digitNos {

	public static void main(String[] args) {
		int [] arr= {50,121,40,212,20,30,70,90,110};
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>99 && arr[i]<1000)
				count++;
		}
		System.out.print("Count of 3 digits nos :"+count);
	}

}
