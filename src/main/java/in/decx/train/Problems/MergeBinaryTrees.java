package in.decx.train.Problems;

import in.decx.train.Definitions.BinaryTreeNode;

public class MergeBinaryTrees {
    public BinaryTreeNode mergeTrees(BinaryTreeNode root1, BinaryTreeNode root2){
        if(root1 == null && root2 == null) return null;
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        BinaryTreeNode merged = new BinaryTreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged;
    }
}
