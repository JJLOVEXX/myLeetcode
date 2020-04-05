import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 4, 1, 4, 3, 3};
        System.out.println(singleNumbers(nums));
    }

    public static int[] singleNumbers(int[] nums) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                set.remove(nums[i]);
            }
        }
        Iterator it = set.iterator();
        for (int i = 0; i < 2&&it.hasNext(); i++) {
            int a = (int)it.next();
            result[i] = a;
        }

        return result;
    }
}
