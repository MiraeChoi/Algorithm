package j_dynamic_programming;

import java.util.Scanner;

class Ex10_01 {
	static int n, answer = 0;
	
	public void DFS(int sum) {
		if(sum == n) {
			System.out.println("answer : " + answer);
			answer++;
		}
		else {
			if(sum + 1 <= n) {
				sum += 1;
				System.out.println("¡Ùsum : " + sum);
				DFS(sum);
				sum -= 1;
			}
			if(sum + 2 <= n) {
				sum += 2;
				System.out.println("¡Úsum : " + sum);
				DFS(sum);
				sum -= 2;
			}
		}
	}
	
	public static void main(String[] args) {
		Ex10_01 T = new Ex10_01();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		T.DFS(0);
		System.out.println(answer);
	}
}
