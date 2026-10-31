class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> nd = new HashSet<>();
        int ans  = 0;

        for (int i  = 0 ; i   < nums.length  ; i ++) {
            nd.add(nums[i]);
        }
        
        for (int i = 0 ; i  < nums.length ; i++ ) {
            if (!hs.contains(nums[i])){
                if (nd.contains(nums[i] + 1 )) {
                    ans ++;
                    hs.add(nums[i]);
                }
            }
            
        }

        return ans + 1;
    }
}
