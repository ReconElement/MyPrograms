package javadev.array;

public class array13 {
    public static int longestSubarray(int[] nums) {
        int sum = 0;
        int size = nums.length;
        nums[size] = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0 && nums[i - 1] == 1 && nums[i + 1] == 1) {
                sum = 0;
                nums[i] = 1;
                for (int j = 0; j < size; j++) {
                    int m = j + 1;
                    if (nums[m] != 0)
                        sum = sum + 1;
                }
                System.out.println(sum);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1 };
        longestSubarray(arr);
    }
}
