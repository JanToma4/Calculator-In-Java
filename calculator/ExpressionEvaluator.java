package calculator;

import java.util.StringTokenizer;

import data_structures.Queue;
import data_structures.Stack;

// Jan Toma, CS310
// ExpressionEvaluator.java
public class ExpressionEvaluator {
	Stack<String> stack = new Stack<String>();
	Queue<String> queue = new Queue<String>();

	/**
	 * It takes the expression, then changes it to postfix then sends it
	 * to the postfix method to evalute it and find an answer.
	 * @param s - the expression we are going to evaluate.
	 * @return the answer of the newly evaluated expression.
	 */
	public String processInput(String s){
		if(infixToPostfix(s) == "ERROR") {
			return "ERROR";
		}
		stack.makeEmpty();
		queue.makeEmpty();
		return postfix(infixToPostfix(s));
	}

	/**
	 * Takes in a String type expression and converts it from infix to postfix.
	 * Ex. ( 2 + 2 ) turns 2 2 + so it is easier to evaluate.
	 * @param s - The String type expression we want to convert to post fix.
	 * @return the newly converted postfix expression.
	 */
	public String infixToPostfix (String s) {

		try {
			StringTokenizer st = new StringTokenizer(s);
			while(st.hasMoreTokens()) {
				String token = st.nextToken().trim();
				if(token.equals("(")) {
					stack.push(token);
				}
				else if(token.equals(")")) {
					token = ((String) stack.pop());
					while(!token.equals("(")) {
						queue.enqueue(token);
						token = ((String) stack.pop());
					}
				}
				if(isOperator(token)) {
					while(!stack.isEmpty() && !stack.peek().equals("(") && 
							precedence(token) <= precedence(stack.peek())) {	
						queue.enqueue(stack.pop());
					}
					stack.push(token);
				}
				if(isNumber(token)) {
					queue.enqueue(token);
				}
			}
			while(!stack.isEmpty()) {
				queue.enqueue(stack.pop());
			}
		}

		catch (Exception e) {
			return "ERROR";
		}

		String postfix = "";
		for (String a : queue) {
			postfix += a + " ";
		}

		return postfix;
	}

	/**
	 * Takes the String return from the infixToPostfix method
	 * and evaluates it and returns an answer.
	 * @param s - The newly converted postfix expression from the infixToPostfix method.
	 * @return - the answer of the postfix expression.
	 */
	public String postfix(String s) {
		StringTokenizer st = new StringTokenizer(s);

		if(s.contains("(")) {
			return "ERROR";
		}

		while(st.hasMoreTokens()) {
			String token = st.nextToken().trim();
			if(isNumber(token)) {
				stack.push(token);
			}
			else if(isOperator(token)) {	
				try {
					Double token1 = Double.parseDouble(stack.pop());
					Double token2 = Double.parseDouble(stack.pop());
					String answer = process(token1, token2, token);
					stack.push(answer);
				}
				catch (Exception e) {
					return "ERROR";
				}
			}
		}
		
		if(stack.size() != 1) {
			return "ERROR";
		}

		return stack.pop();	
	}

	/**
	 * Checks to see if String s is a operator or not.
	 * @param s - The token that we are checking to see if it is an operator or not.
	 * @return true if is an operator, which are ^ / * + -, returns false if it is anything else.
	 */
	public boolean isOperator (String s) {
		switch(s.charAt(0)) {
		case '+': case '-': case '/': case '*': case '^': return true;
		default: return false;
		}
	}

	/**
	 * Checks the precedence of the operators so the calculations are correct.
	 * @param s - the token we are checking what its precedence is.
	 * @return 4 if the token is ( or ), 3 if it's a ^, 2 if it's * or /, 1 if it's + or -.
	 */
	public int precedence (String s) {
		switch(s.charAt(0)) {
		case '(': case ')': return 4;
		case '^': return 3;
		case '*': case '/': return 2;
		case '+': case '-': return 1;
		default: return -1;
		}
	}

	/**
	 * Checks to see if the token if a number or not.
	 * @param s - The token we are checking.
	 * @return true if it is a valid number, false if it is not.
	 */
	public boolean isNumber(String s) {
		try {
			Double.parseDouble(s);
		}
		catch(NumberFormatException e){
			return false;
		}
		return true;
	}

	/**
	 * Takes in 2 numbers and a operator and evaluates them.
	 * @param num1 - The first number.
	 * @param num2 - the second number.
	 * @param token - the operator.
	 * @return the answer of num1 operator num2.
	 */
	public static String process(Double num1, Double num2, String token) {
		if(token.equals("+")) {
			return (Double.toString(num2 + num1));
		}
		if(token.equals("-")) {
			return (Double.toString(num2 - num1));
		}
		if(token.equals("*")) {
			return (Double.toString(num2 * num1));
		}
		if(token.equals("/")) {
			return (Double.toString(num2 / num1));
		}
		if(token.equals("^")) {
			double temp = num2;
			for(int i = 1; i <= num1 - 1; i++) {
				num2 = num2 * temp;
			}
			return (Double.toString(num2));
		}
		throw new UnsupportedOperationException("process() was called with: num1 = " + num1 
				+ ", num2 = " + num2 + ", token = " + token);
	}

}
