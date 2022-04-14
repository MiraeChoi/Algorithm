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
			new PhyscData("이재휘", 171, 0.8),
			new PhyscData("신지용", 175, 0.4),
			new PhyscData("정지우", 177, 1.5),
			new PhyscData("김준익", 178, 0.3),
			new PhyscData("고승범", 179, 0.7),
			new PhyscData("박현규", 181, 2.0),
			new PhyscData("최바다", 183, 1.2),
		};
		System.out.print("몇 cm인 사람을 찾고 있나요? : ");
		int height = kb.nextInt();
		int idx = Arrays.binarySearch(
				x,
				new PhyscData("", height, 0.0),
				PhyscData.HEIGHT_ORDER
			);
		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.print("찾은 데이터 : " + x[idx]);
		}
	}
}
