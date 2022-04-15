package z_doit_java;

import java.util.Scanner;

class T04_02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		T04_01 s = new T04_01(64);
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.print("1.Ǫ��  2.��  3.��ũ  4.����  0.���� : ");
			int menu = kb.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("������ : ");
				x = kb.nextInt();
				try {
					s.push(x);
				} catch(T04_01.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2 : 
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch(T04_01.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 3 :
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch(T04_01.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 4 :
				s.dump();
				break;
			}
		}
	}
}
