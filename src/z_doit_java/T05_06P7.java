package z_doit_java;

import java.util.Scanner;
import java.util.Stack;

class IntegersP7 {
	int s, x, y;
	
	public IntegersP7(int s, int x, int y) {
		this.s = s;
		this.x = x;
		this.y = y;
	}
}

class T05_06P7 {
//	static void move(int n, int x, int y) {
//		Stack<IntegersP7> stack = new Stack<>();
//		stack.add(new IntegersP7(n, x, y));
//		
//		while(true) {
//			if(n > 1) {
//				n--;
//				y = 6-x-y;
//				stack.add(new IntegersP7(n, x, y));
//				continue;
//			}
//			if(!stack.isEmpty()) {
//				IntegersP7 tmp = stack.pop();
//				System.out.printf("원반[%d](을)를 %d기둥에서 %d기둥으로 옮김\n", tmp.n, tmp.x, tmp.y);
//				
//				if(tmp.n > 1) {
//					n = tmp.n - 1;
//					x = 6-x-y;
//					y = tmp.y;
//					stack.add(new IntegersP7(n, x, y));
//				}
//			}
//		}
//	}
	
	static void move(int n, int x, int y) {
		Stack<IntegersP7> stack = new Stack<>();
		int sw = 0;

		while (true) {
			if (sw == 0 && n > 1) {						//n=3, x=1, y=3			n=2, x=1, y=2			n=2, x=1, y=2			n=1, x=3, y=2								n=3, x=1, y=3			n=2, x=2, y=3			n=1, x=2, y=1		n=2, x=2, y=3			n=1, x=1, y=3
				stack.add(new IntegersP7(sw, x, y));	//stack.add(0, 1, 3)	stack.add(0, 1, 2)																									stack.add(0, 2, 3)
				n = n-1;								//n=2					n=1																													n=1
				y = 6-x-y;								//y=2					y=3																													y=1
				continue;
			}

			System.out.printf("원반[%d]을 %d 기둥에서 %d 기둥으로 이동\n", n, x, y);		//syso(1을 1->3)			syso(2를 1->2)			syso(1을 3->2)								syso(3을 1->3)									syso(1을 2->1)		syso(2를 2->3)			syso(1을 1->3)

			if (sw == 1 && n > 1) {
				stack.add(new IntegersP7(sw, x, y));													//stack.add(1, 1, 2)												stack.add(1, 1, 3)													stack.add(1, 2, 3)
				n = n-1;																				//n=1																n=2																	n=1
				x = 6-x-y;																				//x=3																x=2																	x=1
				if (++sw == 2) sw = 0;																	//sw=0																sw=0																sw=0
				continue;
			}
			do {
				if (stack.isEmpty())																																																																				//stack.isEmpty() == true
					return;
				IntegersP7 tmp = stack.pop();									//stack.pop(0, 1, 2)							stack.pop(1, 1, 2)		stack.pop(0, 1, 3)													stack.pop(0, 2, 3)							stack.pop(1, 2, 3)		stack.pop(1, 1, 3)
				sw = tmp.s + 1;													//sw=1											sw=2*					sw=1																sw=1										sw=2*					sw=2*
				x  = tmp.x;														//x=1											x=1						x=1																	x=2											x=2						x=1
				y  = tmp.y;														//y=2											y=2						y=3																	y=3											y=3						y=3
				n++;															//n=2											n=2						n=3																	n=2											n=2						n=3
//				if (!stack.isEmpty()) System.out.println("반복 : " + stack.peek().s + "/" + stack.peek().x + "/" + stack.peek().y);
			} while (sw == 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = kb.nextInt();
		move(n, 1, 3);
	}
}
