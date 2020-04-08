import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int[] exchange(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        ArrayList<Integer>result=new ArrayList<>();
        result.addAll(odd);
        result.addAll(even);
        int[]array=new int[result.size()];
        for (int i=0;i<array.length;i++){
            array[i]=result.get(i);
        }
        return array;
    }
}
