package in.decx.train.Problems;

public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int sol = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int len = right - left;
            int cur = len * Math.max(height[left], height[right]);
            sol = Math.max(cur, sol);
            if(height[left] < height[right])
                left++;
            else right--;
        }
        return sol;
    }
}
