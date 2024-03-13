/*
    Problem Number - 814
    Problem Description - BinaryTreePruning
    Solution Author - Rohit Yadav

public class BinaryTreePruning {
    public BinaryTreeNode pruneTree(BinaryTreeNode root) {
        if(root == null) return null;
        BinaryTreeNode sol = new BinaryTreeNode(root.val);

        sol.left = pruneTree(root.left);
        sol.right = pruneTree(root.right);

        if(sol.val == 0 && sol.left == null && sol.right == null)
            return null;

        return sol;
    }
}

 */


