class Solution {
    HashMap<Character, Integer> map = new HashMap<>();
    public Solution(){
        

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (char c : row1.toCharArray()) map.put(c, 1);
        for (char c : row2.toCharArray()) map.put(c, 2);
        for (char c : row3.toCharArray()) map.put(c, 3);
    }
    
    public String[] findWords(String[] words) {
       List<String> list=new ArrayList<>();
       for(String word:words){
        if(sameRow(word)){
            list.add((word));
        }
       }
       String[] res=new String[list.size()];
       for(int i=0;i<res.length;i++){
        res[i]=list.get(i);
       }
       return res;

    }
    public boolean sameRow(String word) {
        int row = map.get(Character.toLowerCase(word.charAt(0)));

        for (char c : word.toCharArray()) {
            if (map.get(Character.toLowerCase(c)) != row) {
                return false;
            }
        }

        return true;


    }
}