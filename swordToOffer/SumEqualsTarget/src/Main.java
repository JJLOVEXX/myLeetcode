public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = nums.length - 1;

        while (nums[i] + nums[j] != target) {
            int s = nums[i] + nums[j];
            if (s < target) {
                i++;
            } else if (s > target) {
                j--;
            }
        }
        result[0] = nums[i];
        result[1] = nums[j];
        return result;
    }
}
