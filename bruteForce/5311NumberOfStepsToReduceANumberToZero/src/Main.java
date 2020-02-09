public class Main {

    public static void main(String[] args) {
        int num=123;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps (int num){
        int count=0;
        for(;num>0;count++){
            if (num%2==0){
                num=num>>1;
            }
            else {
                num-=1;
            }
        }
        return count;
    }
}
