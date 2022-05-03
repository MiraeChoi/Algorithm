package z_doit_java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class T06_15 {
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		@Override
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		PhyscData[] arr = {
			new PhyscData("�輼��", 177, 0.3),	
			new PhyscData("��û��", 185, 0.7),	
			new PhyscData("������", 183, 2.0),	
			new PhyscData("�̼���", 187, 1.5),	
			new PhyscData("�ڹ���", 178, 0.4),	
			new PhyscData("������", 182, 1.2),	
			new PhyscData("�跡��", 180, 0.8),	
		};
		
		Arrays.sort(arr, PhyscData.HEIGHT_ORDER);
        System.out.println("�� ��ü�˻� ����Ʈ ��");
        System.out.println(" �̸�      Ű   �÷�");
        System.out.println("------------------");
        for(int i = 0; i < arr.length; i++) System.out.printf("%-8s%3d%5.1f\n", arr[i].name, arr[i].height, arr[i].vision);
	}
}
