public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public Node copyRandomList(Node head) {
        if (head==null){
            return null;
        }
        copy(head);
        randomDirect(head);
        return reList(head);
    }

    public void copy(Node head){
        while(head!=null){
            Node cloneNode=new Node(head.val);
            Node nextNode=head.next;
            head.next=cloneNode;
            cloneNode.next=nextNode;
            head=cloneNode.next;
        }
    }
    public void randomDirect(Node head){
        while(head!=null){
            Node cloneNode = head.next;
            if(head.random!=null){
                Node direct = head.random;
                cloneNode.random = direct.next;
            }
            head = cloneNode.next;
        }
    }
    private Node reList(Node head){
        Node cloneNode = head.next;
        Node cloneHead = cloneNode;
        head.next = cloneNode.next;
        head = head.next;
        while(head!=null){
            cloneNode.next = head.next;
            head.next = head.next.next;
            head = head.next;
            cloneNode = cloneNode.next;
        }
        return cloneHead;
    }
}
