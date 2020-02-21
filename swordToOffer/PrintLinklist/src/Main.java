import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (head != null) {
            numbers.add(head.val);
            head = head.next;

        }
        int[] n = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            n[i] = numbers.get(numbers.size() - i - 1);
        }
        return n;
    }
}
