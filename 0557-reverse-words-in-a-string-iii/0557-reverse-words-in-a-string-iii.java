class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=0;
        while(i<s.length()){
            while(j<s.length()&&arr[j]!=' '){
                j++;
            }
            int start=i;
            int end=j-1;
            while(start<end){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            i=j+1;
            j++;
        }
        return new String(arr);
    }
}