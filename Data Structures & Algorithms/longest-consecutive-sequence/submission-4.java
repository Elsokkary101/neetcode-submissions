class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> nd = new HashSet<>();
        int max = -1;

        int ans  = 0;

        for (int i  = 0 ; i   < nums.length  ; i ++) {
            nd.add(nums[i]);
        }
        
        for (int i = 0 ; i  < nums.length ; i++ ) {
            if (!hs.contains(nums[i]) && !nd.contains(nums[i] - 1 )){
                int j = nums[i] + 1;
                ans = 0;
                while (nd.contains(j++)) {
                    ans ++;
                    hs.add(nums[i]);
                }
                max = Math.max(max , ans);
            }
            
        }

        return max + 1;
    }
}
