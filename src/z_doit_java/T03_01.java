package z_doit_java;

import java.util.Scanner;

class T03_01 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = kb.nextInt();
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = kb.nextInt();
		}
		System.out.print("검색할 값 : ");
		int key = kb.nextInt();
		int idx = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			if(key == x[i]) {
				idx = i;
				break;
			}
		}
		
		if(idx == Integer.MIN_VALUE) System.out.println("그 값의 요소가 없습니다.");
		else System.out.println(key + "(은)는 x[" + idx + "]에 있습니다.");
	}
}
