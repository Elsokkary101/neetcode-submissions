class Solution {
    public int majorityElement(int[] nums) {
        int n = Math.floorDiv(nums.length , 2);
        
        HashMap <Integer , Integer> hm = new HashMap<>();

        for (int i = 0 ; i  < nums.length ; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i],hm.get(nums[i]) + 1);
                continue;
            }

            hm.put(nums[i] , 1);

        }
        
        int max = Integer.MIN_VALUE;
        int maxIdx = Integer.MIN_VALUE;
        for (Integer h : hm.keySet()) {
            int val = hm.get(h);
            if (max < val) {
                max = val;
                maxIdx = h;
            }
        }

        return maxIdx;

    }
}