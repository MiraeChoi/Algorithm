package programmers;

import java.util.Arrays;

class SCLevel2_1 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        for(int i = 0; i < N; i++) answer[i] = i + 1;
        Arrays.sort(stages);
        int cnt = 0;
        int idx = 0;
        int len = stages.length;
        float[] fails = new float[N];
        
        System.out.println("N : " + N);
        for(int i = 0; i < stages.length; i++) {
        	System.out.print(stages[i]);
        }
        System.out.println();
        
        for(int i = 0; i < stages.length-1; i++) {
        	cnt++;
        	System.out.println("cnt : " + cnt);
        	
        	if(stages[i+1] != stages[i]) {
        		fails[idx] = (float)cnt / (float)len;
        		System.out.println("¡Ú" + cnt + "/" + len);
        		len -= cnt;
        		cnt = 0;
        		idx++;
        	}
        	System.out.println("len : " + len);
        	if(cnt == N) fails[N-1] = 1;
        }
        
        for(int i = 0; i < fails.length; i++) {
        	System.out.print(fails[i] + " ");
        }
        System.out.println();
        
        for(int i = fails.length-1; i >= 0; i--) {
        	System.out.println(fails[i]);
        	for(int j = i-1; j >= 0; j--) {
        		if(fails[i] > fails[j]) {
        			System.out.println("j : " + j);
        			int tmp = answer[i];
        			answer[i] = answer[j];
        			answer[j] = tmp;
        			for(int k = 0; k < answer.length; k++) System.out.print(answer[k] + " ");
        			System.out.println();
        		}
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
		SCLevel2_1 T = new SCLevel2_1();
		int N = 4;
//		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};	//3 4 2 1 5
		int[] stages = {4, 4, 4, 4, 4};				//4 1 2 3
		for(int x : T.solution(N, stages)) System.out.print(x + " ");
	}
}
