package in.decx.train.Problems;

import in.decx.train.Definitions.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class LargestValueInEachTreeRow {
    public List<Integer> largestValues(BinaryTreeNode root) {
        List<Integer> output = new ArrayList<>();
        helper(root, output, 0);
        return output;
    }

    public void helper(BinaryTreeNode root, List<Integer> output, int lvl){
        if(root == null) return;

        if(lvl == output.size()){
            output.add(root.val);
        }else{
            output.set(lvl, Math.max(output.get(lvl), root.val));
        }

        helper(root.left, output, lvl+1);
        helper(root.right, output, lvl+1);

    }
}
