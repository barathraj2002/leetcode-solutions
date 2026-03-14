// Last updated: 3/14/2026, 11:51:05 AM
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int larger = 0;
        for (int i = 0; i < heights.length; i++) {

            if(stack.isEmpty()){
                stack.push(new int[]{i,heights[i]});

            }
            else if(!stack.isEmpty() && stack.peek()[1] > heights[i]){
                int j = -1 ;
                while(!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                    int ind = stack.peek()[0];
                    int maxArea = stack.peek()[1] * (i - ind);
                    larger = Math.max(maxArea, larger);
                    j = ind;
                    stack.pop();

                }
                stack.push(new int[]{j, heights[i]});

            }
            else{
                stack.push(new int[]{i,heights[i]});
            }

        }

        while(!stack.isEmpty()){
            int index = stack.peek()[0];
            int value = stack.peek()[1];

            int area = (heights.length - index) * value;
            larger = Math.max(area , larger);
            stack.pop();
        }
        return larger;
    }
}