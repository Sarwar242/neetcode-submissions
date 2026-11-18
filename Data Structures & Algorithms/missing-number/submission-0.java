class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sum = 0;
        int total = nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        return total-sum;
    }
}
