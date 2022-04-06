package i_greedy_algorithm;

import java.util.Scanner;

class Ex09_01 {
	//����
	//������ ���� �����Դϴ�. ������ ���� ������ ���߰��� �°�, N���� �����ڰ� ������ �߽��ϴ�.
	//������ �� �������� Ű�� ������ ������ �˰� �ֽ��ϴ�.
	//������ ���� ���� ���� ��Ģ�� ������ ���� ���߽��ϴ�.
	//"A��� �����ڸ� �ٸ� ��� �����ڿ� �ϴ��� ���ؼ� Ű�� ������ ��� A������ ���� ����(ũ��, ���̴�) �����ڰ�
	//�����ϸ� A�����ڴ� Ż���ϰ�, �׷��� ������ ���ߵȴ�."
	//N���� �����ڰ� �־����� ���� ���߿�Ģ���� �ִ� �� ���� ������ ������ �� �ִ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù° �ٿ� �������� �� N(5<=N<=30,000)�� �־����ϴ�.
	//�� ��° �ٺ��� N���� �� �ɷ�ġ�� ������ �ɷ�ġ ������ ���ʷ� �־����ϴ�.
	//�� ������ �� �ɷ�ġ�� ��� �ٸ���, ������ �ɷ�ġ�� ��� �ٸ��ϴ�. �ɷ�ġ ���� 1,000,000������ �ڿ����Դϴ�.
	
	//���
	//ù° �ٿ� �ٵ� ������ ������ �ִ� �ο��� ����ϼ���.
	public int solution(int n, int[][] stat) {
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			
			int height = stat[i][0];
			int weight = stat[i][1];
			
			for(int j = 0; j < n; j++) {
				if(j != i && stat[j][0] > height && stat[j][1] > weight) {
					cnt++;
					break;
				}
			}
			if(cnt == 0) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_01 T = new Ex09_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] stat = new int[n][2];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				stat[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, stat));
	}
}
