public class Main {

    public static void main(String[] args) {
        int n=1;
        int[]s=printNumbers(n);
        for (int elements:s
             ) {
            System.out.println(elements);
        }

    }

    public static int[] printNumbers(int n) {
        int count = (int) Math.pow(10, n);
        int[] result = new int[count-1];
        for (int i = 0; i < count-1; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
