import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int c = 1, j = 0, res = -1; 
        int count[] = new int[n];

        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                c++;
            } else {
                count[j++] = c;
                c = 1;
            }
        }

        count[j++] = c;

        for (int k = 0; k < j; k++) {
            if (count[k] > (n / 2)) {
                res = nums[n / 2];
                break;
            }
        }

        return res;
    }
}


