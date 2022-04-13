package z_doit_java;

import java.util.Scanner;

class T02_06 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("��ڼ� : ");
		int n = kb.nextInt();
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = kb.nextInt();
		}
		reverse(x);
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
	}
}
