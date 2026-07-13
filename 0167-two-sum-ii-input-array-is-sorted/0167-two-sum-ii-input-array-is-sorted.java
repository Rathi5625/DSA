class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){

                if (numbers[i] + numbers[j] == target){
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};
        
    }
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        Solution obj = new Solution();
        int[] ans = obj.twoSum(arr , target);

        System.out.println(ans[0] + " " + ans[1]);
   
    }
}