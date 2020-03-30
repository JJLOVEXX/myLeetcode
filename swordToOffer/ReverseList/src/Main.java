public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;

        while (current != null) {
            ListNode listNode = current.next;
            current.next = pre;/**current.next->pre**/
            pre = current;/**pre->current**/
            current = listNode;/**current->current.next**/
        }
        return pre;
    }
}
