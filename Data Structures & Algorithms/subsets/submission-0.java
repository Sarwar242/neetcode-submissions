class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backTrack(result, new ArrayList<>(), nums, 0); 

        return result;
    }

    void backTrack(List<List<Integer>> result, List<Integer> current,int[] nums, int start){
        result.add(new ArrayList<>(current));
        for(int num = start; num< nums.length; num++){
            current.add(nums[num]);
            backTrack(result, current, nums, num+1);
            current.remove(current.size()-1);
        }
    } 
}
