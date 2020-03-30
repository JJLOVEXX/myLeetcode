import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new LinkedHashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return false;
    }
}
