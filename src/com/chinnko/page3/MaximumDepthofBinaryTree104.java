package page3;

public class MaximumDepthofBinaryTree104 {
    public static void main(String[] args) {
        MaximumDepthofBinaryTree104 maximumDepthofBinaryTree104 = new MaximumDepthofBinaryTree104();
        int i = maximumDepthofBinaryTree104.maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        System.out.println(i);
    }

    int p = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return p;
        }
        dp(root, 1);
        return p;
    }


    public void dp(TreeNode treeNode, int path) {
        if (treeNode == null) {
            return;
        }
        p = Math.max(path, p);
        dp(treeNode.right, path + 1);
        dp(treeNode.left, path + 1);

    }

    public static class TreeNode {
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
