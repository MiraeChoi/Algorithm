package z_doit_java;

import java.util.Scanner;

class T03_01 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("��ڼ� : ");
		int n = kb.nextInt();
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = kb.nextInt();
		}
		System.out.print("�˻��� �� : ");
		int key = kb.nextInt();
		int idx = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			if(key == x[i]) {
				idx = i;
				break;
			}
		}
		
		if(idx == Integer.MIN_VALUE) System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else System.out.println(key + "(��)�� x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
