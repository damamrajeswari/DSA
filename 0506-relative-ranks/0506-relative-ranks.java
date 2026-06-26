class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        String[] ans=new String[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                ans[map.get(score[i])]="Gold Medal";
            }
            else if(i==n-2){
                ans[map.get(score[i])]="Silver Medal";
            }
            else if(i==n-3){
                ans[map.get(score[i])]="Bronze Medal";
            }
            else{
                int rank=n-i;
                ans[map.get(score[i])]=""+rank;
            }
        }
        return ans;
    }
}