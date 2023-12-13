package com.anand;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		
		boolean containsDuplicate=containsDuplicate(nums);
		if(containsDuplicate) {
			System.out.println("The array contains duplicate.");
		}else {
			System.out.println("The array does not contain duplicates.");
		}

	}
	private static boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length <=1) {
		return false;
	}
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }

        return false; // No duplicates found
    }

}
