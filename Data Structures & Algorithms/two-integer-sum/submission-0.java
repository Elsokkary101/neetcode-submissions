class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i =0 ; i  < nums.length ; i ++)
            hm.put(nums[i] , i);

        for (int i = 0 ; i < nums.length ; i++) {
            int sum = target - nums[i];

            if (hm.containsKey(sum))
                if (hm.get(sum) != i)
                    return new int []{i, hm.get(sum)};
        }

        return new int [0];

    }
}
