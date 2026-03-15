package arrays;


public class maxSubarraySum {
public static void main(String[] args) {
	int a[] = {2, 3, -8, 7, -1, 2, 3};
	System.out.println(maxSubArray(a));
}
public static int maxSubArray(int[] arr) {
    int res =arr[0];
    int maxEnding = arr[0];
    
    for(int i =1 ;i< arr.length;i++ )
    {
    	 maxEnding = Math.max(arr[i], maxEnding + arr[i]);
    	 res = Math.max(res, maxEnding);
    }
    return res; 
}
}
//Maximum Subarray - Kadane's Algorithm - Arrays - Medium
