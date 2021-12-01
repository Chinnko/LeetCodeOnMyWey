package page2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    public static void main(String[] args) {
        inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
    }

    public static ArrayList<Integer> objects = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        dp(root);
        return objects;
    }

    private static void dp(TreeNode root) {
        if (root == null) {
            return;
        }

        dp(root.left);
        objects.add(root.val);
        dp(root.right);
    }

}
