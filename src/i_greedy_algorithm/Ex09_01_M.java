package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

class Ex09_01_M {
	public int solution(int n, ArrayList<Integer> height, ArrayList<Integer> weight) {
		int answer = n;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j && height.get(i) < height.get(j) && weight.get(i) < weight.get(j)) {
					answer--;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_01_M T = new Ex09_01_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Integer> height = new ArrayList<>();
		ArrayList<Integer> weight = new ArrayList<>();
//		int[] height = new int[n];
//		int[] weight = new int[n];
		for(int i = 0; i < n; i++) {
			height.add(kb.nextInt());
			weight.add(kb.nextInt());
		}
		System.out.println(T.solution(n, height, weight));
	}
}
