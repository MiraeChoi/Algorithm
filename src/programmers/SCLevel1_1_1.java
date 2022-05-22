package programmers;

class SCLevel1_1_1 {
	public int solution(int n) {
		int answer = 1;
		
		outer : for(int i = 3; i <= n; i++) {
			if(i % 2 == 0) continue;
			int cnt = 0;
			
			for(int j = 3; j <= i/2; j += 2) {
				if(i % j == 0) continue outer;
			}
			if(cnt == 0) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SCLevel1_1_1 T = new SCLevel1_1_1();
		int n = 100;
		System.out.println(T.solution(n));
	}
}
