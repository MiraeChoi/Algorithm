package b_array;

import java.util.Scanner;

class Ex02_04 {
	//����
	//1) �Ǻ���ġ ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
	//2) �Է��� �Ǻ���ġ ������ �� ���� ����. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.
	
	//�Է�
	//ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.
	
	//���
	//ù �ٿ� �Ǻ���ġ ������ ����մϴ�.
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		
		if(n >= 2) answer[1] = 1;
		if(n >= 3) {
			for(int i = 2; i < answer.length; i++) {
				answer[i] = answer[i-2] + answer[i-1];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_04 T = new Ex02_04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		for(int x : T.solution(n)) System.out.print(x + " ");
	}
}
