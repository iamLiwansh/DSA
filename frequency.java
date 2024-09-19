class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count[] = new int[101];
        int maxVal = 0;
        int sumVal = 0;
        int currVal = 0;

        for( int num : nums){
            count[num]++;

            currVal = count[num];

            if(maxVal < currVal){
                maxVal = currVal;
                sumVal = currVal;
            }else if(maxVal == currVal){
                sumVal += currVal;
            }


        }
        return sumVal;
    }
}