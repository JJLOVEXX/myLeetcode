import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] number = {9, 1, 7, 9, 7, 9, 7};

        System.out.println(singleNumber(number));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-3;i+=3){
            if (nums[i]+nums[i+1]+nums[i+2]!=3*nums[i]){
               if (nums[i]!=nums[i+1]){
                   return nums[i];
               }else{
                   return nums[i+2];
               }
            }
        }
        return nums[nums.length-1];
    }
}

