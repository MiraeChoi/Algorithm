package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2775_1 {
	//맞았습니다!!
	//		1	2	3	4	5	6
	//0		1	2	3	4	5	6
	//1		1	3	6	10	15	21
	//2		1	4	10	20	35	56
	//3		1	5	15	35	70	126
	//4		1	6	21	56	126	252
	//5		1	7	28	84	210	462
	//	...
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int k, n;
		for(int i = 0; i < T; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			if(n == 1) str.append("1\n");
			else if(n == 2) str.append((k + n) + "\n");
			else {
				int[][] hotel = new int[k+1][n+1];
				for(int j = 1; j <= n; j++) hotel[0][j] = j;
				
				for(int j = 1; j < hotel.length; j++) {
					hotel[j][1] = 1;
					for(int h = 2; h <= n; h++) hotel[j][h] = hotel[j][h-1] + hotel[j-1][h];
				}
				str.append(hotel[k][n] + "\n");
//				for(int j = 0; j < hotel.length; j++) {
//					for(int h = 1; h < hotel[j].length; h++) {
//						System.out.print(hotel[j][h] + " ");
//					}
//					System.out.println();
//				}
			}
		}
		System.out.print(str.toString());
	}
}
