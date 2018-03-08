package Tester;

import data_structures.*;

import java.util.Scanner;

import calculator.*;

//Jan Toma, CS310
//test.java
public class test {
	Stack<String> stack = new Stack<String>();
	Queue<String> queue = new Queue<String>();
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	public test() {
		
		list.addFirst(9000);
		for(Integer k: list) {
			System.out.println(k);
		}
		System.out.println(list.size());
		
		System.out.println();

		ExpressionEvaluator exp = new ExpressionEvaluator();
		System.out.println(exp.process(5.0, 5.0, "+"));
		System.out.println(exp.process(4.0, 2.0, "*"));
		System.out.println(exp.process(8.0, 2.0, "/"));
		System.out.println(exp.process(20.0, 16.0, "-"));
		System.out.println(exp.process(3.0, 2.0, "^"));

		// 2 * ( 3 + 4 ) + 6 / ( 1 + 2 ) + 3 Example given
		System.out.println();
		System.out.println("Changing to postfix: ( 2 * ( 3 + 4 ) + 6 / ( 1 + 2 ) + 3 )");
		System.out.println(exp.infixToPostfix("( 2 * ( 3 + 4 ) + 6 / ( 1 + 2 ) + 3 )"));
		System.out.println("Postfix Answer: 2 3 4 + * 6 1 2 + / + 3 +");
		System.out.println();
		System.out.println(exp.processInput("( ( 2 + 7 ) * ( 5 / 6 ) + 2 ^ 3 - 30 * 2 ) / 2"));
		System.out.println("Process Input Answer:  -22.25");
		System.out.println("\n\n\nPrinting out Stack and Queue: \n------------------------");
//		System.out.println("Testing exponent method: " + Exponent());
	}
	
//	public int Exponent() {						//testing exponent method
//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int answer = 0;
//		int temp = num2;
//		for(int i = 1; i <= num1 - 1; i++) {
//			System.out.println("i =" + i);
//			num2 = num2 * temp;
//			System.out.println(num2);
//		}
//		return answer;
//	}


	public static void runTests() {
		new test();
	}

	public static void main(String[] a) {
		runTests();
	}
}
