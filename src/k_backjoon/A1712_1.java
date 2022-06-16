package k_backjoon;

import java.util.Scanner;

class A1712_1 {
	public static void main(String[] args) {
		//�ð� �ʰ�
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();	//�������
		double B = sc.nextInt();	//�������
		double C = sc.nextInt();	//��Ʈ�� ����
		
		if(C <= B) System.out.println(-1);
		else {
			int i = (int)(A / C);
			while(C * i <= A + B * i) {
				i++;
				if(i > Integer.MAX_VALUE) {
					System.out.println(-1);
					return;
				}
			}
			System.out.println(i);
		}
	}
}
