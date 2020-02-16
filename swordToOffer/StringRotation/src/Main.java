public class Main {

    public static void main(String[] args) {
        String s="ILOVEYOU";
        System.out.println(reverseLeftWords(s,3));
    }

    public static String reverseLeftWords(String s, int n) {
        s=s.substring(n)+s.substring(0,n);
        return s;
    }
}
