public class Main {

    public static void main(String[] args) {
        int[] numbers={12,345,2,6,7896};
        System.out.println(findNumbers(numbers));
    }
    public static int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            String number=nums[i]+"";
            if (number.length()%2==0){
                count++;
            }
        }
        return count;
    }
}
