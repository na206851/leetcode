public class SymetricTree_101 {

    public boolean isMirror(TreeNode root) {
        TreeNode leftBranch = root.left;
        TreeNode rightBranch = root.right;
        return isSymetric(leftBranch, rightBranch);
    }

    public boolean isSymetric(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return (left.val == right.val) && isSymetric(left.left, right.right) && isSymetric(left.right, right.left);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }
}