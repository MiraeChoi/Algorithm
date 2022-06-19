package k_backjoon;

import java.util.Scanner;

public class A10250_1 {
	//맞았습니다!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int num = sc.nextInt();
			
			int lt = 0, rt = 1;
			for(int j = 0; j < num; j++) {
				lt++;
				if(lt > h) {
					lt = 1;
					rt++;
				}
				System.out.println(j + " : " + lt + "/" + rt);
			}
			if(lt == 0) lt = 1;
			if(rt >= 10) answer[i] = Integer.parseInt(lt + "" + rt);
			else answer[i] = Integer.parseInt(lt + "0" + rt);
		}
		for(int x : answer) System.out.println(x);
	}
}
