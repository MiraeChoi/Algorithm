package k_backjoon;

import java.util.Scanner;

class A1712_1 {
	public static void main(String[] args) {
		//시간 초과
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();	//고정비용
		double B = sc.nextInt();	//가변비용
		double C = sc.nextInt();	//노트북 가격
		
		if(C <= B) System.out.println(-1);
		else {
			int i = (int)(A / C);
			while(C * i <= A + B * i) {
				i++;
				if(i > Integer.MAX_VALUE) {
					System.out.println(-1);
					return;
				}
			}
			System.out.println(i);
		}
	}
}
