class Solution {
    private int[] NSRCount(int[] heights) {
        int[] Count = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            Count[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }
        return Count;
    }

    private int[] NSLCount(int[] heights) {
        int[] Count = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            Count[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return Count;
    }

    public int largestRectangleArea(int[] heights) {
        if (heights.length == 1) return heights[0];

        int[] right = NSRCount(heights);
        int[] left = NSLCount(heights);
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            maxArea = Math.max(maxArea, width * heights[i]);
        }
        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;

        int[] heights = new int[matrix[0].length];
        int maxArea = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                heights[j] = (matrix[i][j] == '0') ? 0 : heights[j] + 1;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }
}
