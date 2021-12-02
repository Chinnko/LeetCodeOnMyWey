package page3;

import page2.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSumII113 {


    public static void main(String[] args) {
        pathSum(new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(1), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))), 22);
    }

    public static List<List<Integer>> array = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return array;
        }
        dp(root, 0, targetSum, new LinkedList<Integer>());
        return array;
    }

    private static void dp(TreeNode root, int current, int targetSum, LinkedList<Integer> list) {
        if (root == null) {
            return;
        }

        if (targetSum == root.val + current && root.right == null && root.left == null) {
            list.addLast(root.val);
            array.add(new LinkedList<>(list));
            list.removeLast();
            return;
        }
        list.addLast(root.val);
        dp(root.right, root.val + current, targetSum, list);
        dp(root.left, root.val + current, targetSum, list);
        list.removeLast();
    }
}
