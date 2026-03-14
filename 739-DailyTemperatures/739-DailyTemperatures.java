// Last updated: 3/14/2026, 11:50:31 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] resArr = new int[temperatures.length];
        for(int i = 0 ; i< temperatures.length ; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                while(true){
                    if(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                        resArr[stack.peek()] = i - stack.pop();

                    }
                    else {
                        break;
                    }

                }
                stack.push(i);
            }
        }
        return resArr;
    }
}