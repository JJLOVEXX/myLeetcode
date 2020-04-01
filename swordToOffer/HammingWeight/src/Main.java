public class Main {

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
        System.out.println("Hello World!");
    }
    public static int hammingWeight(int n) {
        int count=0;

        String s=Integer.toBinaryString(n);
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
