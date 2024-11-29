import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal_145 {

    //  Definition for a binary tree node.
    private class TreeNode {
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return postOrder(root, list);
    }

    public static List<Integer> postOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return result;
        }
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);
        return result;
    }
}