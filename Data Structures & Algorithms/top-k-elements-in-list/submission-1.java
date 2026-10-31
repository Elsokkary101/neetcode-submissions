class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length <= k) return nums;
        HashSet<Integer> ans = new HashSet<>();
        HashMap<Integer, Integer> hm  = new HashMap<>();
        for (int i = 0 ; i  < nums.length ; i ++) {
            if (hm.containsKey(nums[i])) {
                int f = hm.get(nums[i]);
                hm.put(nums[i] , f+1);
                f = hm.get(nums[i]);
                System.out.println("---" + nums[i] + "---" + f);
                if (f >= k) ans.add(nums[i]);
                
            }else {
                hm.put(nums[i] , 1);
            }
        }
        // int res [] = new int [ans.size()];
        int[] array = ans.stream()
                 .mapToInt(Integer::intValue)
                 .toArray();
        return array;

    }
}
