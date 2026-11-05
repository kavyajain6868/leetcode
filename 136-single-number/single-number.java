class Solution {
    public int singleNumber(int[] nums) {
        int size=nums.length;
        for(int i=0;i<size;i++){
            int cnt=0;
            for(int j=0;j<size;j++){
                if(i==j)continue;
                if(nums[i]==nums[j]){
                    cnt++;
                    break;

                }
            }
            if(cnt==0){
                return nums[i];
            }
        }
        return -1;
    }
}