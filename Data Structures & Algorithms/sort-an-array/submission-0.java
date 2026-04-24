class Solution {
    public int[] sortArray(int[] nums) {
        return sort1 (nums);

        
    }

    public static int [] sort1 (int[] nums) {
        if (nums.length == 1) return nums;
        int arr1 [] = new int [nums.length/2];
        int arr2 [] = new int [nums.length - (nums.length/2)];

        for (int i = 0 ; i  < arr1.length ; i++)
            arr1 [i] = nums[i];

        for (int j = 0 ; j  < arr2.length ; j++)
            arr2[j] = nums[arr1.length + j];

        int [] ans1 = sort1(arr1);
        int [] ans2 = sort1(arr2);
        return merge(ans1, ans2);
    }

    public static int [] merge (int arr1 [] , int arr2 []) {
        int index1 = 0;
        int index2 = 0;
        int n = arr1.length + arr2.length;
        int ans [] = new int [n];
        int i = 0 ;
        while (true) {
            if (index1 >= arr1.length && index2 >= arr2.length)
                break;
            if (index1 >= arr1.length)
                ans[i++] = arr2[index2++];
            else if (index2 >= arr2.length)
                ans[i++] = arr1[index1++];
            else if (arr1[index1] > arr2[index2])
                ans[i++] = arr2[index2++];
            else
                ans[i++] = arr1[index1++];
        }

        return ans;
    }
}