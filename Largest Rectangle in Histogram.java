import java.util.*;

class Solution {
    private int[] NSRCount(int[] heights) {
        int[] count = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            count[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }
        
        return count;
    }
    
    private int[] NSLCount(int[] heights) {
        int[] count = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            count[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        
        return count;
    }
    
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 1) {
            return heights[0];
        }
        
        int[] nsr = NSRCount(heights);
        int[] nsl = NSLCount(heights);
        
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}
