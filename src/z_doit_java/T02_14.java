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
			new PhyscData("고승범", 179, 0.7),	
			new PhyscData("김준익", 178, 0.3),	
			new PhyscData("박현규", 181, 2.0),	
			new PhyscData("정지우", 177, 1.5),	
			new PhyscData("신지용", 175, 0.4),	
			new PhyscData("최바다", 183, 1.2),	
			new PhyscData("이재휘", 171, 0.8)	
		};
		
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름　　키　　시력");
		System.out.println("------------");
		
		double hsum = 0;
		for(int i = 0; i < x.length; i++) {
			//%-5s : String값 주고 뒤에 5칸 띄어쓰기
			//%5s  : 앞에 5칸 띄어쓰고 String값 주기
			System.out.printf("%-5s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
			hsum += x[i].height;
		}
		System.out.printf("\n평균 키 : %5.1fcm\n", hsum/x.length);
		
		System.out.println("시력 분포");
		int[] vdist = new int[21];
		for(int i = 0; i < x.length; i++) {
			System.out.println("★vision : " + x[i].vision);
			if(x[i].vision >= 0.0 && x[i].vision <= 21 / 10.0) {
				vdist[(int)(x[i].vision * 10)]++;
			}
		}
		for(int i = 0; i < 21; i++) {
			System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
		}
	}
}
