package z_doit_java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class T03_08 {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		PhyscData[] x = {
			new PhyscData("������", 171, 0.8),
			new PhyscData("������", 175, 0.4),
			new PhyscData("������", 177, 1.5),
			new PhyscData("������", 178, 0.3),
			new PhyscData("��¹�", 179, 0.7),
			new PhyscData("������", 181, 2.0),
			new PhyscData("�ֹٴ�", 183, 1.2),
		};
		System.out.print("�� cm�� ����� ã�� �ֳ���? : ");
		int height = kb.nextInt();
		int idx = Arrays.binarySearch(
				x,
				new PhyscData("", height, 0.0),
				PhyscData.HEIGHT_ORDER
			);
		if(idx < 0) {
			System.out.println("��Ұ� �����ϴ�.");
		} else {
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�.");
			System.out.print("ã�� ������ : " + x[idx]);
		}
	}
}
