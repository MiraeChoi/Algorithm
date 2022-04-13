package z_doit_java;

import java.util.Scanner;

class T02_14 {
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		PhyscData[] x = {
			new PhyscData("��¹�", 179, 0.7),	
			new PhyscData("������", 178, 0.3),	
			new PhyscData("������", 181, 2.0),	
			new PhyscData("������", 177, 1.5),	
			new PhyscData("������", 175, 0.4),	
			new PhyscData("�ֹٴ�", 183, 1.2),	
			new PhyscData("������", 171, 0.8)	
		};
		
		System.out.println("�� ��ü�˻� ����Ʈ ��");
		System.out.println("�̸�����Ű�����÷�");
		System.out.println("------------");
		
		double hsum = 0;
		for(int i = 0; i < x.length; i++) {
			//%-5s : String�� �ְ� �ڿ� 5ĭ ����
			//%5s  : �տ� 5ĭ ���� String�� �ֱ�
			System.out.printf("%-5s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
			hsum += x[i].height;
		}
		System.out.printf("\n��� Ű : %5.1fcm\n", hsum/x.length);
		
		System.out.println("�÷� ����");
		int[] vdist = new int[21];
		for(int i = 0; i < x.length; i++) {
			System.out.println("��vision : " + x[i].vision);
			if(x[i].vision >= 0.0 && x[i].vision <= 21 / 10.0) {
				vdist[(int)(x[i].vision * 10)]++;
			}
		}
		for(int i = 0; i < 21; i++) {
			System.out.printf("%3.1f~ : %2d��\n", i / 10.0, vdist[i]);
		}
	}
}
