public class Main {

    public static void main(String[] args) {
        int[]nums={1,2,3,3,3,3,4};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int votes=0;
        int x=0;
        for (int num:nums){
            if (votes==0){
                x=num;
            }
            if (x==num){
                votes++;
            }else{
                votes--;
            }
        }
        return x;
    }
}
