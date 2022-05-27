package k_backjoon;

public class A4673_1 {
	//1h
	public static void main(String[] args) {
		int[] arr = new int[10001];
		
		for(int i = 1; i <= 10000; i++) {
			int cur = i;
			int answer = cur;
			
			if(cur / 10 == 0) answer += cur;
			else {
				String tmp = cur + "";
				int digit = tmp.length();
				while(digit >= 0) {
					answer += cur / Math.pow(10, digit);
					cur %= Math.pow(10, digit);
					digit--;
				}
			}
			if(answer <= 10000) arr[answer] = 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 10000; i++) {
			if(arr[i] == 0) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
