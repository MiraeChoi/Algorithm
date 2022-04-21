package z_doit_java;

import java.util.Scanner;

class T05_06 {								//1-1*				//2-1*			//3				//2-2*			//4				//1-2*			//5-1*			//6				//5-2*			//7
	static void move(int n, int x, int y) {	//n=3, x=1, y=3		n=2, x=1, y=2	n=1, x=1, y=3	n=2, x=1, y=2	n=1, x=3, y=2	n=3, x=1, y=3	n=2, x=2, y=3	n=1, x=2, y=1	n=2, x=2, y=3	n=1, x=1, y=3
		if(n > 1) move(n-1, x, 6-x-y);		//move(2, 1, 2)		move(1, 1, 3)																	move(1, 2, 1)
		System.out.printf("원반[%d](을)를 %d기둥에서 %d기둥으로 옮김\n", n, x, y);		//syso(1을 1->3)	syso(2를 1->2)	syso(1을 3->2)	syso(3을 1->3)					syso(1을 2->1)	syso(2를 2->3)	syso(1을 1->3)
		if(n > 1) move(n-1, 6-x-y, y);															//move(1, 3, 2)					move(2, 2, 3)									move(1, 1, 3)
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = kb.nextInt();
		move(n, 1, 3);
	}
}
