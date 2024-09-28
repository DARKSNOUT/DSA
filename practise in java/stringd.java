import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int p = 0;
        while (l >= 0) {
            if (!contains(nums, l)) {
                p = l;
                break; // Return immediately when the missing number is found
            }
            l--;
        }
        return p;
    }

    public boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1};
        System.out.println(solution.missingNumber(nums)); // Output: 2

        nums = new int[]{0, 1};
        System.out.println(solution.missingNumber(nums)); // Output: 2

        nums = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(solution.missingNumber(nums)); // Output: 8

        nums = new int[]{0};
        System.out.println(solution.missingNumber(nums)); // Output: 1
    }
}
