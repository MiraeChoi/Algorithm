package z_doit_java;

import java.util.Scanner;

class T04_02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		T04_01 s = new T04_01(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.print("1.푸시  2.팝  3.피크  4.덤프  0.종료 : ");
			int menu = kb.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x = kb.nextInt();
				try {
					s.push(x);
				} catch(T04_01.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2 : 
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch(T04_01.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3 :
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch(T04_01.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4 :
				s.dump();
				break;
			}
		}
	}
}
