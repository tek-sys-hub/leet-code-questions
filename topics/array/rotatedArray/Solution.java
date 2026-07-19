import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int start = 0;
        int end = nums.length;
        k = k % end;

        reverse(nums , start , end - 1);
        reverse(nums , start , k - 1);
        int[] ans = reverse(nums , k , end - 1);

        System.out.println("Final Rotated Array = " + Arrays.toString(ans));
    }
    public static int[] reverse (int[] nums , int start , int end){

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        return nums;
    }
}

