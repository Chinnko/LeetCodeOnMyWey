package page3;

public class SymmetricTree101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return dp(root.left, root.right);
    }

    public boolean dp(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }

        return dp(left.left, right.right) && dp(left.right, right.left);

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
