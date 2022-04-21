package z_doit_java;

import java.util.Scanner;

class T05_04 {
	static void recur(int n) {		//n=4		n=3			n=2			n=1			n=0		n=1			n=2		n=3				n=0			n=4					n=1		n=0		n=1
		while(n > 0) {																									//n=1		n=1				n=2									n=2
			recur(n-1);				//recur(3)	recur(2)	recur(1)	recur(0)										recur(0)					recur(1)	recur(0)
			System.out.println(n);															//syso(1)	syso(2)	syso(3)				syso(1)	syso(4)								syso(1)	syso(2)
			n = n-2;																		//n=-1		n=0		n=1					n=-1	n=2									n=-1	n=0
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int n = kb.nextInt();
		recur(n);
	}
}
