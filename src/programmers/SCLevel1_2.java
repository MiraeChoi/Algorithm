package programmers;

class SCLevel1_2 {
    public int solution(int left, int right) {
    	int answer = 0;
    	int cnt = 0;
        
        for(int i = left; i <= right; i++) {
        	if(i == 1) {
        		answer -= i;
        		continue;
        	} else cnt = 2;
        	
        	for(int j = 2; j <= i/2; j++) {
        		System.out.print(j + " ");
        		if(i % j == 0) {
        			System.out.print(j + " ");
        			cnt++;
        		}
        	}
        	System.out.println("\n" + i + ". cnt : " + cnt);
        	if(cnt % 2 == 0) answer += i;
        	else answer -= i;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	SCLevel1_2 T = new SCLevel1_2();
		int left = 1;
		int right = 3;
		System.out.println(T.solution(left, right));
	}
}
