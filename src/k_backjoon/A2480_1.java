package k_backjoon;

import java.util.Scanner;

public class A2480_1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] arr = new int[3];
		int max = Integer.MIN_VALUE;
		int num = 0;
		int cnt = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
			max = Math.max(max, arr[i]);
		}
		if(arr[0] == arr[1] || arr[0] == arr[2]) {
			cnt++;
			num = arr[0];
		}
		if(arr[1] == arr[2]) {
			cnt++;
			num = arr[1];
		}
		if(cnt == 3) System.out.println(10000 + num * 1000);
		else if(cnt == 2) System.out.println(1000 + num * 100);
		else System.out.println(100 * max);
	}
}
