package in.decx.train.Problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public Boolean hasDuplicate(int[] nums){
        Set<Integer> st = new HashSet<>();
        for(int i : nums){
            if(!st.add(i))
                return true;
        }
        return false;
    }
}
