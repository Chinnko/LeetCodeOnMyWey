package page2;

public class ValidateBinarySearchTree98 {
    public static void main(String[] args) {
//        System.out.println(isValidBST(new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6, new TreeNode(3), new TreeNode(7)))));
    }

    //[5,4,6,null,null,3,7]
//    public static boolean isValidBST(TreeNode root, long maxDis, long shortDis) {
//        if (root == null) {
//            return true;
//        }
//        if (root.left != null && root.right != null && root.left.val < root.val && root.right.val > root.val) {
//            return isValidBST(root.left,maxDis,shortDis ) && isValidBST(root.right);
//        }
//        return false;
//    }

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
