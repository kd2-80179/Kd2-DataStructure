package com.sunbeam;

public class TesterMain {
public static double priority(char ch) {
	switch(ch) {
	case '(':
		  return 12;
	case ')':
		  return 11;
	case '^':
		   return 10;
	case '/':
		    return 9;
	case '*':
		     return 8;
	case '+':
		    return 7;
	case '-':
		     return 6;
	default:
		       break;
		       
	
	}
	return 0;
}
	
	public static void main(String[] args) {
		System.out.println(priority('a'));
	}

}
