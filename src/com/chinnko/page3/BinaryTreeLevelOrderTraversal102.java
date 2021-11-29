package page3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal102 {
    public static void main(String[] args) {

    }

    List<List<Integer>> array = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        dp(root, 0);
        return array;
    }


    public void dp(TreeNode root, int pos) {
        if (root == null) {
            return;
        }
        if (array.size() < pos) {
            array.add(new LinkedList<>());
        }
        array.get(pos).add(root.val);
        dp(root.left, pos + 1);
        dp(root.right, pos + 1);

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
