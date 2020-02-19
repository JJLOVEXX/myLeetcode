public class Main {
    private static int length = 0;
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        int size = count(head);
        for (int i=0;i<size-k;i++){
            head.val=head.next.val;
            head=head.next;
        }
        return head;
    }

    public static int count(ListNode head) {
        if (head == null) {
            return length;
        } else {
            length += 1;
            count(head.next);
        }
        return length;
    }
}
