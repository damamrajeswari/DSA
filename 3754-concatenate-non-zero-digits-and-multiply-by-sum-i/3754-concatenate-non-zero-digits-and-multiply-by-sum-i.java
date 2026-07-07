class Solution {
    public long sumAndMultiply(int n) {
        int div=1000000000;
        long sum=0;
        long res=0;
        for(int i=9;i>=0;i--){
            int digit=n/div;
            if(digit>0){
                sum+=digit;
                res=res*10+digit;
            }
            n%=div;
            div/=10;
        }
        return res*sum;

    }
}