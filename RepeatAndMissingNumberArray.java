package com.anand;

public class RepeatAndMissingNumberArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2; 
        int actualSum = 0;
        int[] frequency = new int[n + 1];

        int repeatedNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
            frequency[arr[i]]++;
            if (frequency[arr[i]] > 1) {
                repeatedNumber = arr[i];
            }
        }

        int missingNumber = totalSum - actualSum + repeatedNumber;

        System.out.println("Repeated number: " + repeatedNumber);
        System.out.println("Missing number: " + missingNumber);
    }
}

