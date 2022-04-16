package z_doit_java;

import java.util.Scanner;

class T04_04P2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		T04_04P1 Q = new T04_04P1(3);
		
		while(true) {
			System.out.println("���� ������ �� : " + Q.size() + "/" + Q.capacity());
			System.out.print("1.�Ǿտ� ��ť�� 2.�Ǿտ��� ��ť�� 3.�Ǿտ��� ��ũ\n" +
					 "4.�ǳ��� ��ť�� 5.�ǳ����� ��ť�� 6.�ǳ����� ��ũ\n" +
					 "7.������ ������ 8.�˻����� ������ 0.���� : ");
			int menu = kb.nextInt();
			if(menu == 0) break;
			
			int data;
			switch(menu) {
			case 1:	//�տ��� ��ť
				System.out.print("������ : ");
				data = kb.nextInt();
				try {
					Q.enqueFront(data);
				} catch (T04_04P1.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
			case 2: //�տ��� ��ť
				try {
					data = Q.dequeFront();
					System.out.println("�տ��� ��ť�� �����ʹ� " + data + "�Դϴ�.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 3: //�տ��� ��ũ
				try {
					data = Q.peekFront();
					System.out.println("�տ��� ��ũ�� �����ʹ� " + data + "�Դϴ�.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 4:	//�ڿ��� ��ť
				System.out.print("������ : ");
				data = kb.nextInt();
				try {
					Q.enqueRear(data);
				} catch (T04_04P1.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
			case 5: //�ڿ��� ��ť
				try {
					data = Q.dequeRear();
					System.out.println("�ڿ��� ��ť�� �����ʹ� " + data + "�Դϴ�.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 6: //�ڿ��� ��ũ
				try {
					data = Q.peekRear();
					System.out.println("�ڿ��� ��ũ�� �����ʹ� " + data + "�Դϴ�.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 7: //����
				Q.dump();
				break;
			case 8: //�˻�
				System.out.print("������ : ");
				data = kb.nextInt();
				try {
					int result = Q.search(data);
					if(result == 0) System.out.println("ť�� �ش��ϴ� �����Ͱ� �����ϴ�.");
					else System.out.println("�ش� �����ʹ� ť�� " + result + "��°�� �ֽ��ϴ�.");
				} catch (T04_04P1.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			}
		}
	}
}
