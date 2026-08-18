class Solution {
    public int largestInteger(int[] nums, int k) {
    
        int[] freq=new int[51];
        for(int num:nums){
            freq[num]++;
        }
        int max=-1;
        if(k==1){
            int i=50;
            while(i>=0){
                if(freq[i]==1){
                    return i;
                }
                i--;
            }
        }else if(k==nums.length){
            int i=50;
            while(i>=0){
                if(freq[i]>=1){
                    return i;
                }
                i--;
            }
            return -1;
        }
        

        if(freq[nums[0]]==1) {
            max = Math.max(max, nums[0]);
        }

        if(freq[nums[nums.length-1]]==1) {
            max = Math.max(max, nums[nums.length-1]);
        }
        return max;
        
        
    }
}