package in.java.arrays;

import java.util.Arrays;

public class Array_Sorting {

	public static void main(String[] args) {
		
		int[] a= {140,20,30};
		Arrays.sort(a);
		System.out.println(a[0]);
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
