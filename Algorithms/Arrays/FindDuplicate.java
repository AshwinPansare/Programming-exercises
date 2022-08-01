// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

class Solution {
    //One method could be to sort the array first and linearly compare each element with the 
    //next one 
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];//stores count of elements
        int i;
        int res=0;
        for(i=0;i<n;i++)//works because all the elements are between 1 and n
        {
            if(++arr[nums[i]]==2)
                return nums[i];
            
        }
        // for(i=0;i<n;i++)
        // {
        //     if(arr[i]>=2)
        //         res = i;
        // }
        return res;
    }
}