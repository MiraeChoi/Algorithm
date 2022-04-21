package z_doit_java;

import java.util.Scanner;
import java.util.Stack;

class T05_05 {
	static void recur(int n) {
		Stack<Integer> stack = new Stack<>();
		while(true) {
			if(n > 0) {
				stack.push(n);
				System.out.println("���� �ִ� �� : " + stack);
				n = n-1;
				continue;
			}
			if(!stack.isEmpty()) {
				n = stack.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. : ");
		int n = kb.nextInt();
		recur(n);
	}
}
