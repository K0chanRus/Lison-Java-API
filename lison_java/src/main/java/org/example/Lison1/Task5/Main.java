package org.example.Lison1.Task5;

public class Main {
    public static void main(String[] args) {
        //Input: nums = [1,2,3,4]
        //Output: [1,3,6,10]
        //Explanation: Running sum is obtained as follows:
        // [1, 1+2, 1+2+3, 1+2+3+4].
        int[] arr = {1, 2, 3, 4};
        int[] result = new int[arr.length];
        result[0] = arr[0];

        for (int i = 1; i < result.length; i++) {
            result[i] += arr[i] + result[i-1];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);
        }
    }
}
