public class Main {

    public static void main(String[] args) {
        int num = 5;
        int []b=countBits(num);
        for (int i:b){
            System.out.println(i);
        }
    }

    public static int[] countBits(int num) {
        int[] a = new int[num+1];
        for (int i = 0; i < num+1; i++) {
            int count = 0;
            String s = Integer.toBinaryString(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count++;
                }
            }
            a[i]=count;
        }
        return a;
    }
}
