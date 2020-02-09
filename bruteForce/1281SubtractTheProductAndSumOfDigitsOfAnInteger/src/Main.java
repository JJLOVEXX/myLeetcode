public class Main {

    public static void main(String[] args) {
        int n=234;
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        /*String number=String.valueOf(n);//整数转为字符串
        int[] temp=new int[number.length()];//定义数组
        for (int i=0;i<number.length();i++){//字符串转为整数型数组
            temp[i]=Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        int product=1;
        int sum=0;
        for (int i=0;i<number.length();i++){
            product*=temp[i];
            sum+=temp[i];
        }
        return product-sum;*/
        String number=n+"";
        int product=1;
        int sum=0;
        for (int i=0;i<number.length();i++){
            product*=Integer.parseInt(String.valueOf(number.charAt(i)));
            sum+=Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return product-sum;
    }
}
