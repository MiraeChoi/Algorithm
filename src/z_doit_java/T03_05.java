package z_doit_java;

import java.util.Arrays;
import java.util.Scanner;

class T03_05 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("��ڼ� : ");
		int n = kb.nextInt();
		int[] x = new int[n];
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0] : ");
		x[0] = kb.nextInt();
		for(int i = 1; i < x.length; i++) {
			do {
				System.out.printf("x[%d] : ", i);
				x[i] = kb.nextInt();
			} while(x[i] < x[i-1]);
		}	
			
		System.out.print("�˻��� �� : ");
		int key = kb.nextInt();
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0) System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else System.out.printf("%d(��)�� x[%d]�� �ֽ��ϴ�.\n", key, idx);
	}
}
