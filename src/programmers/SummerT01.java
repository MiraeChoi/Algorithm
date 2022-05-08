package programmers;

import java.util.Scanner;

class SummerT01 {
//    public int solution(int[][] atmos) {
//        int answer = -1;
//        int cnt = 0;
//        boolean wearMask = false;
//        int[] mask = new int[atmos.length];
//        
//        for(int i = 0; i < atmos.length; i++) {
//        	if(atmos[i][0] > 80 || atmos[i][1] > 35) {
//        		mask[i] = i == 0 ? 1 : mask[i-1] + 1;
//        		cnt++;
//        		wearMask = true;
//        		if(atmos[i][0] > 151 || atmos[i][1] > 76) {
//        			System.out.println("¡Ú");
//        			if(!wearMask) {
//        				answer++;
//        				wearMask = true;
//        			}
//        			if(i >= cnt + 2) cnt = 0;
//        			wearMask = false;
//        		} else if(i >= cnt + 2 || cnt == 0) {
//        			System.out.println("¡Ù");
//        			answer++;
//        		}
//        	}
//        	System.out.println("cnt : " + cnt + "/" + i + "/" + mask[i]);
//        }
//        return mask[atmos.length-1];
//    }
	
    public int solution(int[][] atmos) {
        int answer = 0;
        int day = 0;
        
        for(int i = 0; i < atmos.length; i++) {
        	if(atmos[i][0] > 80 || atmos[i][1] > 35) {
        		if(day == 0) answer++;
        		if(atmos[i][0] > 150 && atmos[i][1] > 75) day = 0;
        		else day++;
        	} else {
        		if(day != 0) day++;
        	}
        	if(day >= 3) day = 0;
        	System.out.println("i/day/answer : " + i + "/" + day + "/" + answer);
        }
        return answer;
    }
    
	public static void main(String[] args) {
		SummerT01 T = new SummerT01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] atmos = new int[n][2];
		//8 80 35 70 38 100 41 75 30 160 80 77 29 181 68 151 76
		//9 140 90 177 75 95 45 71 31 150 30 80 35 72 33 166 81 151 75
		//2 30 15 80 35
		for(int i = 0; i < atmos.length; i++) {
			for(int j = 0; j < atmos[i].length; j++) {
				atmos[i][j] = kb.nextInt();		
			}
		}
		System.out.println(T.solution(atmos));
	}
}
