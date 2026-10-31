class Solution {
    public int[] productExceptSelf(int[] nums) {
        int right [] = new int [nums.length];
        int left [] = new int [nums.length];
        int ans [] = new int [nums.length];
        

        for (int i  = 0 ; i   < nums.length  ; i ++) {
            if (i == 0) {
                right [i] = nums[i];
                continue; 
            }

            right [i] = right [i-1]* nums[i];  
        }
        
        left [left.length - 1] = nums[nums.length -1 ]; 
        for (int i  = nums.length - 2 ; i   >= 0  ; i--) {
            left [i] = nums[i] * left [i + 1];
        }

        for (int i  = 0 ; i   < nums.length - 1  ; i ++) {
            if (i == 0) {
                ans [i] = left [i + 1];
                continue;
            }

            ans [i] = left [i + 1] * right [i-1]; 
        }

        ans [nums.length - 1] = right [nums.length - 2];

        return ans ; 
        


    }
}  
