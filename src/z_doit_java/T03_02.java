package z_doit_java;

import java.util.Scanner;

class T03_02 {
	static int seqSearch(int[] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(key == a[i]) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("��ڼ� : ");
		int n = kb.nextInt();
		int[] x = new int[n];
		
		for(int i = 0; i < x.length; i++) {
			System.out.printf("x[%d] : ", i);
			x[i] = kb.nextInt();
		}
		System.out.print("�˻��� �� : ");
		int key = kb.nextInt();
		int idx = seqSearch(x, key);
		
		if(idx == -1) System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else System.out.printf("%d(��)�� x[%d]�� �ֽ��ϴ�.", key, idx);
	}
}
