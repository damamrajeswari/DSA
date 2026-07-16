class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int[] prefixGcd=new int[n];

        long sum=0;

        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            prefixGcd[i]=gcd(nums[i],max);
        }

        Arrays.sort(prefixGcd);
        int i=0;
        int j=n-1;
        while(i<j){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;


    }
    public int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}