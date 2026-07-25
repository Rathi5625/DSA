class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentWindowSum = 0;
        
        
        int[] frequency = new int[100001]; 
        int duplicateCount = 0; 

        for (int i = 0; i < nums.length; i++) {
           
            int incoming = nums[i];
            currentWindowSum += incoming;
            frequency[incoming]++;
            
           
            if (frequency[incoming] == 2) {
                duplicateCount++;
            }

            
            if (i >= k) {
                int outgoing = nums[i - k];
                currentWindowSum -= outgoing;
                
                
                if (frequency[outgoing] == 2) {
                    duplicateCount--;
                }
                frequency[outgoing]--;
            }

           
            if (i >= k - 1) {
                
                if (duplicateCount == 0) {
                    maxSum = Math.max(maxSum, currentWindowSum);
                }
            }
        }

        return maxSum;
    }
}
