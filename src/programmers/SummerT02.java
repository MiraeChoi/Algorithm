package programmers;

import java.util.ArrayList;
import java.util.Scanner;

class SummerT02 {
	public String[] solution(String[] rooms, int target) {
        String[] answer = {};
        return answer;
	}
	 
	public static void main(String[] args) {
		SummerT02 T = new SummerT02();
		Scanner kb = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		arr.add(kb.nextLine());
		
		int target = kb.nextInt();
		for(String x : T.solution(args, target)) {
			System.out.print(x + " ");
		}
	}
}
