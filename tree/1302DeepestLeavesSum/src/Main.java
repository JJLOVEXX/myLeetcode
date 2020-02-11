public class Main {
    int sum = 0;
    int maxLevel = 1;

    public void main(String[] args) {

    }

    public int deepestLeavesSum(TreeNode root) {
        helper(root, 1);
        return sum;
    }

    public void helper(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level==maxLevel){
            sum+=node.val;
        }
        if (level>maxLevel){
            sum=0;
            maxLevel=level;
            sum+=node.val;
        }
        helper(node.left, level+1);
        helper(node.right, level+1);
    }
}
