class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int freq [] = new int [Arrays.stream(nums).max().getAsInt()+ 1];
        for (int i =0 ; i < nums.length ; i++)
            freq[nums[i]]++;

        int ans [] = new int [k];
        for (int i = 0 ; i  < k ; i++) {
            int max = -1001 ;
            int maxIndex = -1001;
            for (int j = 0 ; j  < freq.length ; j++) {
                if (max < freq[j]) {
                    maxIndex = j;
                    max = freq[j];
                }
            }
            ans[i] = maxIndex;
            freq[maxIndex] = -1;
        }
        return ans;
    }
}
