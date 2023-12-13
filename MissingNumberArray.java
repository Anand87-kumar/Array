package com.anand;

public class MissingNumberArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,9,10};
		int expected_no_elements=arr.length+1;
		int total_sum=expected_no_elements*(expected_no_elements+1)/2;
		System.out.println(total_sum);
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("missing no is :"+(total_sum-sum));
	}

	}


