package z_doit_java;

import java.util.Scanner;

class T08_01 {
	static int bfMatch(String txt, String pat) {
		int pt = 0; //txt Ŀ��
		int pp = 0; //pat Ŀ��
		
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++; pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if(pp == pat.length()) return pt - pp;  //�˻� ����
		return -1;								//�˻� ����
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("�ؽ�Ʈ : ");
		String s1 = kb.next();
		System.out.print("���� : ");
		String s2 = kb.next();
		
		int idx = bfMatch(s1, s2);	//���ڿ� s1���� ���ڿ� s2�� �˻�
		if(idx == -1) System.out.println("�ؽ�Ʈ�� ������ �����ϴ�.");
		else {
			//��ġ�ϴ� ���� �ٷ� �ձ����� ���̸� ���մϴ�.
			int len = 0;
			for(int i = 0; i < idx; i++) len += s1.substring(i, i+1).getBytes().length;
			len += s2.length();
			
			System.out.println((idx + 1) + "��° ���ں��� ��ġ�մϴ�.");
			System.out.println("�ؽ�Ʈ : " + s1);
			System.out.println("���� : " + s2);
		}
	}
}
