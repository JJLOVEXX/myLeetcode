public class Main {



    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode l4 = l3;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                l4.next=l1;
                l1=l1.next;
            }
            else{
                l4.next=l2;
                l2=l2.next;
            }
            l4=l4.next;
        }
        if (l1!=null){
            l4.next=l1;
        }
        else{
            l4.next=l2;
        }

        return l3.next;

    }
}