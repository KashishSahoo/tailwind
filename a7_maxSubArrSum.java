public class a7_maxSubArrSum {
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi=Long.MIN_VALUE;
        long sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            if(sum>maxi){
                maxi=sum;
            }
        // If sum < 0: discard the sum calculated
        if(sum<0){
            sum=0;
        }
        }
        return maxi;
    }
    public static long maxSubarraySumPrint(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < n; i++) {

            if (sum == 0) start = i; // starting index(having a new start)

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                //Keep track of subarray
                ansStart = start;
                ansEnd = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");


        return maxi;
    }


    public static void main(String args[]) {
        int[] arr = { -2,4,-9, 9,-3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        long maxSum = maxSubarraySumPrint(arr, n);
        System.out.println();
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}
