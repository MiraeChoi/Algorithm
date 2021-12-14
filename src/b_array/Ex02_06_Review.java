package b_array;

import java.util.ArrayList;
import java.util.Scanner;

class Ex02_06_Review {
	public boolean isPrime(int n) {
		if(n < 2) return false;
		
		for(int i = 2; i < n; i++)
			if(n % i == 0) return false;
		
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			int t = arr[i];
			int res = 0;
			
			while(t > 0) {
				int tmp = t % 10;
				res = res * 10 + tmp;
				t = t / 10;
			}
			
			if(isPrime(res)) answer.add(res);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_06_Review T = new Ex02_06_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
