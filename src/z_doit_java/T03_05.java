package z_doit_java;

import java.util.Arrays;
import java.util.Scanner;

class T03_05 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = kb.nextInt();
		int[] x = new int[n];
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = kb.nextInt();
		for(int i = 1; i < x.length; i++) {
			do {
				System.out.printf("x[%d] : ", i);
				x[i] = kb.nextInt();
			} while(x[i] < x[i-1]);
		}	
			
		System.out.print("검색할 값 : ");
		int key = kb.nextInt();
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0) System.out.println("그 값의 요소가 없습니다.");
		else System.out.printf("%d(은)는 x[%d]에 있습니다.\n", key, idx);
	}
}
