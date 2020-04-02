import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    ArrayList<Integer>arrayList=new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        help(root);
        arrayList.sort(comparator);
        return arrayList.get(k-1);
    }

    Comparator<Integer>comparator= (o1, o2) -> o2-o1;

    public void help(TreeNode root){
        if (root==null){
            return;
        }
        arrayList.add(root.val);
        help(root.left);
        help(root.right);
    }
}
