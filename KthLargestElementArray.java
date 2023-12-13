package com.anand;

public class KthLargestElementArray {

	public static void main(String[] args) {
		
		int [] arr = {5,8,12,7,6,2,4};
		int k=4;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+"largest element is "+arr[i]);
			}
		}
		//Sorting the Array
		System.out.println("----------");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
