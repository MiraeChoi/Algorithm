package z_doit_java;

import java.util.Scanner;

class T08_02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("�ؽ�Ʈ : ");
		String s1 = kb.next();
		System.out.print("���� : ");
		String s2 = kb.next();
		
		int n1 = s1.indexOf(s2);
		int n2 = s1.lastIndexOf(s2);
		
		if(n1 == -1) System.out.println("�ؽ�Ʈ �ȿ� ������ �����ϴ�.");
		else {
			//ã�Ƴ� ���ڿ��� �ٷ� �ձ����� ���� ������ ���մϴ�.
			int len1 = 0;
			for(int i = 0; i < n1; i++) len1 += s1.substring(i, i+1).getBytes().length;
			len1 += s2.length();
			
			int len2 = 0;
			for(int i = 0; i < n2; i++) len2 += s1.substring(i, i+1).getBytes().length;
			len2 += s2.length();
			
			System.out.println("�ؽ�Ʈ : " + s1);
			System.out.printf(String.format("���� : %%%ds\n", len1), s2);
			System.out.println("�ؽ�Ʈ : " + s1);
			System.out.printf(String.format("���� : %%%ds\n", len2), s2);
		}
	}
}
