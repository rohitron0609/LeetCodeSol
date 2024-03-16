package in.decx.train.Problems;

import in.decx.train.Definitions.BinaryTreeNode;

public class PathSum {
    public Boolean hasPathSum(BinaryTreeNode root, int sum){
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == sum)
            return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
