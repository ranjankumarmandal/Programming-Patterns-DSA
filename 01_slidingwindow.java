import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 1, 8, 10, 12, 0, 5};
        
        // find max subarray sum of k elemnt
        int k = 3;
        
        int maxSum = maxSumSubarrayWithWindowK(arr, k);
        
        System.out.println(maxSum);
    }
    
    public static int maxSumSubarrayWithWindowK(int[] arr, int k) {
        int maxSum = 0, n = arr.length;
        
        for(int i = 0; i <= n - k; i++) {
            int sum = 0;
            
            for(int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}
