public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }



}
