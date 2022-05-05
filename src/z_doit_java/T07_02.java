package z_doit_java;

class T07_02 {
	public static void main(String[] args) {
		T07_01 s1 = new T07_01(20);
		T07_01 s2 = new T07_01(20);
		T07_01 s3 = new T07_01(20);
		
		s1.add(10);
		s1.add(15);
		s1.add(20);
		s1.add(25);
		
		s1.copyTo(s2);		//s2 = {10, 15, 20, 25}
		s2.add(12);			//s2 = {10, 15, 20, 25, 12}
		s2.remove(25);		//s2 = {10, 15, 20, 12}
		
		s3.copyFrom(s2);	//s3 = {10, 15, 20, 12}
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		System.out.println("���� s1�� 15�� " + (s1.contains(15) ? "���Ե˴ϴ�." : "���Ե��� �ʽ��ϴ�."));
		System.out.println("���� s2�� 25�� " + (s2.contains(25) ? "���Ե˴ϴ�." : "���Ե��� �ʽ��ϴ�."));
		System.out.println("���� s1�� s2�� " + (s1.equalTo(s2) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
		System.out.println("���� s2�� s3�� " + (s2.equalTo(s3) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
		
		s3.unionOf(s1, s2);
		System.out.println("���� s1�� s2�� �������� " + s3 + "�Դϴ�.");
	}
}
