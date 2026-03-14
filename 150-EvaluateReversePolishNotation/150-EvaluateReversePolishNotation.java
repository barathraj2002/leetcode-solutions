// Last updated: 3/14/2026, 11:50:54 AM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i< tokens.length ; i++){
            String indexValue = tokens[i];

            if(indexValue.length() > 1){
                if(indexValue.charAt(0) == '-'){
                    int x = Integer.parseInt(indexValue.substring(1));
                    x = -x;
                    stack.push(x);
                }
                else{
                    int x = Integer.parseInt(indexValue.substring(0));
                    stack.push(x);
                }
            }
            else if ( Character.getNumericValue(indexValue.charAt(0)) >=0 && Character.getNumericValue(indexValue.charAt(0)) <=9 ){
                stack.push(Integer.parseInt(indexValue));
            }
            else{
                int num1 = stack.pop();
                int num2 = stack.pop();

                switch(indexValue){
                    case "+":
                        stack.push(num2 + num1);
                        break;
                    case "-":
                        stack.push(num2 - num1);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        if(num1 == 0 || num2 == 0 ){
                            stack.push(0);
                        }
                        else {
                            stack.push(num2 / num1);
                        }

                        break;
                }
            }
        }
        return stack.pop();
    }
}