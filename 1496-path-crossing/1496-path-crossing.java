class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        HashSet<String> set=new HashSet<>();
        set.add(x+","+y);
        for(char c:path.toCharArray()){
            if(c=='N'){
                y++;
            }else if(c=='E'){
                x++;
            }else if(c=='W'){
                x--;
            }else{
                y--;
            }
            String point=x+","+y;
            if(set.contains(point)){
                return true;
            }
            set.add(point);
        }
        return false;
    }
}