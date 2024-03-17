package in.decx.train.Problems;

import in.decx.train.Definitions.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftTreeValue {

    public int findBottomLeftValue(BinaryTreeNode root){
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null) queue.add(root.right);
            if (root.left != null) queue.add(root.left);
        }
        return root.val;
    }
}
