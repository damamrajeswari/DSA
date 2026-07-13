class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String digits="123456789";
        int length=2;
        while(length<10){
            int start=0;
            int end=length;
            while(end<10){
                list.add(Integer.parseInt(digits.substring(start,end)));
                start++;
                end++;
            }
            length++;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)<low){
                continue;
            }
            if(list.get(i)>high){
                break;
            }
            res.add(list.get(i));
        }
        return res;
    }
}