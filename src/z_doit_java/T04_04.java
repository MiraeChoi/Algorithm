package z_doit_java;

import java.util.Scanner;

class T04_04 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		T04_03 Q = new T04_03(3);
		
		while(true) {
			System.out.println("���� ������ �� : " + Q.size() + "/" + Q.capacity());
			System.out.print("1.��ť  2.��ť  3.��ũ  4.����  5.�˻�  0.���� : ");
			int menu = kb.nextInt();
			if(menu == 0) break;
			
			int data;
			switch(menu) {
			case 1:
				System.out.print("������ : ");
				data = kb.nextInt();
				try {
					Q.enque(data);
				} catch (T04_03.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					data = Q.deque();
					System.out.println("��ť�� �����ʹ� " + data + "�Դϴ�.");
				} catch (T04_03.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					data = Q.peek();
					System.out.println("��ũ�� �����ʹ� " + data + "�Դϴ�.");
				} catch (T04_03.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 4:
				Q.dump();
				break;
			case 5:
				System.out.print("������ : ");
				data = kb.nextInt();
				try {
					int result = Q.search(data);
					if(result == 0) System.out.println("ť�� �ش��ϴ� �����Ͱ� �����ϴ�.");
					else System.out.println("�ش� �����ʹ� ť�� " + result + "��°�� �ֽ��ϴ�.");
				} catch (T04_03.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			}
		}
	}
}
