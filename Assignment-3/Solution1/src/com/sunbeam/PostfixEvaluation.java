package com.sunbeam;


public class PostfixEvaluation {
    public static double evaluatePostfix(String expression) {
        Stack stack = new Stack(10);
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "2 3 + 4 *";
        double result = evaluatePostfix(postfixExpression);
        System.out.println("Postfix Evaluation Result: " + result);
        
    }
}
class prefixEvaluation{
	public static double evaluatePrefix(String expression) {
		Stack stack= new Stack(10);
		String[] tokens=expression.split(" ");
		for(String token: tokens) {
			if(token.matches("//d+")) {
				stack.push(Double.parseDouble(token));
				
			}else {
				double a=stack.pop();
				double b=stack.pop();
				switch(token) {
				case "+":
					stack.push(a+b);
					break;
				case "-":
					stack.push(a-b);
					break;
				case "*":
					stack.push(a*b);
					break;
				case "/":
					stack.push(a/b);
					break;
					
				}
				
			}
		}
		return stack.pop();
		
	}
	public static void main(String[] args) {
		String prefixExpression= "* 4+ 3 2";
		double result=evaluatePrefix(prefixExpression);
		System.out.println("prefix Expression result:"+result);
	}
}


