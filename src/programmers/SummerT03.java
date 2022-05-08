package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class SummerT03 {
	char[] qwerty1 = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
	char[] qwerty2 = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};
	int[][] pt = new int[2][10];
	int[] pl = {1, 0};
	int[] pr = {1, 9};

    public int[] solution(String line) {
        int[] answer = new int[line.length()];
        Arrays.fill(answer, -1);
        
        for(int i = 0; i < line.length(); i++) {
        	char tmp = line.charAt(i);
        	System.out.println("tmp : " + tmp);
        	
        	if(tmp >= '0' && tmp <= '9') {
        		
        	}
        	
        	
        	if(tmp >= '1' && tmp <= '5') answer[i] = 0;
        	else if((tmp >= '6' && tmp <= '9') || tmp == '0') answer[i] = 1;
        	else {
        		for(int j = 0; j < qwerty2.length/2; j++) {
        			if(tmp == qwerty2[j]) answer[i] = 0;
        		}
        		if(answer[i] == -1) answer[i] = 1;
        	}
        }
        return answer;
    }
    
	public static void main(String[] args) {
		SummerT03 T = new SummerT03();
		Scanner kb = new Scanner(System.in);
		String line = kb.next();
		for(int x : T.solution(line)) System.out.print(x + " ");
	}
}
