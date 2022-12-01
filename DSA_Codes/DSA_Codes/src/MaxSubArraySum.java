public class MaxSubArraySum {

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    
    
    // long maxSubarraySum(int arr[], int n){
        
    //     // Your code here
    //     long res=arr[0];
    //     for(int i=0;i<arr.length-1;i++){
    //         int curr = 0;
    //         for(int j=i;j<arr.length;j++){
    //             curr = curr+arr[j];
    //             res = Math.max(res , curr);
    //         }
    //     }
    //  return res;   
    // }
    
  public static long maxSubarraySum(int arr[]){
        
        long res = arr[0];
        long maxEnding = arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding = Math.max(maxEnding+arr[i] , arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
            }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        long res = maxSubarraySum(arr);
        System.out.println(res);
    }
}
