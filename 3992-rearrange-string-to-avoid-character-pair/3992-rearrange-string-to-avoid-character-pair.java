class Solution {
    public String rearrangeString(String s, char x, char y) {
        int xs=0;
        int ys=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==x) xs++;
            else if(c==y) ys++;
            else sb.append(c);
        }
        while(ys>0){
            sb.append(y);
            ys--;
        }
        while(xs>0){
            sb.append(x);
            xs--;
        }
        return sb.toString();
    }
}