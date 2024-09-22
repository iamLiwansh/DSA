class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
       
        if(len == 1 ) return nums[0];

        for(int i = 0 ; i < len ; i++){
             int ls = 0;
        int rs = 0;
            for(int j = 0 ; j <= i ; j++){ ls = ls + nums[j];}
                for(int k = i ; k < len ; k++){
                   
                    rs = rs + nums[k];
                }
                if(ls == rs){
                    return i;
                }
            
        }
        return -1;
    }
}