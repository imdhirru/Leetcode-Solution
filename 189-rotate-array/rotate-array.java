class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate2(nums, 0, nums.length-1);
        rotate2(nums, 0, k-1);
        rotate2(nums, k , nums.length-1);
    }
    void rotate2(int[] nums, int i,int j) {

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}