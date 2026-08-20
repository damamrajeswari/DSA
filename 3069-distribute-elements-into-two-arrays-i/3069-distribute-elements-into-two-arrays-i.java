class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        int list1last=nums[0];
        int list2last=nums[1];
        for(int i=2;i<nums.length;i++){
            if(list1last>list2last){
                list1.add(nums[i]);
                list1last=nums[i];
            }else{
                list2.add(nums[i]);
                list2last=nums[i];
            }
        }
        int[] res=new int[nums.length];
        int i=0;
        while(i<list1.size()){
            res[i]=list1.get(i);
            i++;
        }
        int j=0;
        while(i<res.length){
            res[i]=list2.get(j);
            i++;
            j++;
        }
        return res;
    }
}