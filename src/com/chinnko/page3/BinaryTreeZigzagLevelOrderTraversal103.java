package page3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal103 {

    public static void main(String[] args) {
        zigzagLevelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));

    }

    //[3,9,20,null,null,15,7]
    static List<List<Integer>> out = new ArrayList<>();

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        dps(root, 0);
        return out;
    }

    public static void dps(TreeNode root, int path) {
        if (root == null) {
            return;
        }
        LinkedList<Integer> list;
        if (out.size() < path) {
            list = new LinkedList<Integer>();
            out.add(list);
        } else {
            list = (LinkedList<Integer>) out.get(path);
        }
        if (path % 2 == 0) {
            list.add(root.val);
        } else {
            list.addFirst(root.val);
        }
        dps(root.right, path + 1);
        dps(root.left, path + 1);

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
