class Solution {
    public int maxDigitRange(int[] nums) {
        int[] range=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            range[i]=range(nums[i]);
            max=Math.max(max,range[i]);
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(range[i]==max){
                sum+=nums[i];
            }
        }
        return sum;
    }
    public int range(int n){
        int min=9;
        int max=0;
        while(n>0){
            int rem=n%10;
            min=Math.min(min,rem);
            max=Math.max(max,rem);
            n/=10;
        }
        return max-min;
    }
}