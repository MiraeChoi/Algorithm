package k_backjoon;

public class A4673_2 {
	static int solution(int n) {
		int sum = n;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		boolean arr[] = new boolean[10001];
		
		for(int i = 1; i <= 10000; i++) {
			int n = solution(i);
			if(n <= 10000) arr[n] = true;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 10000; i++) {
			if(!arr[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
