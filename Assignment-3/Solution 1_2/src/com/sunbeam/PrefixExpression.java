package com.sunbeam;

public class PrefixExpression {
	public static int evaluatePrefix(String expression) {
		Stack stack= new Stack(10);
		for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
            	
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                    	
                            stack.push(operand1 / operand2);
                            break;
                    }
                }
            }
            return stack.pop();
        }

        public static void main(String[] args) {
            String prefixExpression = "+*235";
            int result = evaluatePrefix(prefixExpression);
            System.out.println("Prefix Evaluation Result: " + result);
        }
}













   