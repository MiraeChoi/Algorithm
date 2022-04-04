package c_pointers_n_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Ex03_03 {
	//����
	//������ �ƺ��� �������� ��մϴ�. ���� �ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.
	//���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸�
	//12 15 11 20 25 10 20 19 13 15
	//���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.
	//�������� ������ �����ּ���.
	
	//�Է�
	//ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
	//�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
	
	//���
	//ù �ٿ� �ִ� ������� ����մϴ�.
	public int solution(int n1, int n2, int[] a) {
		int answer = Integer.MIN_VALUE;
		int count = 0;
		int start = 0;
		int end = n2;
		
		while(end < n1) {
			for(int i = start; i < end; i++) {
				count += a[i];
			}
			
			if(count >= answer) {
				answer = count;
			}
			
			count = 0;
			start++;
			end++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Ex03_03 T = new Ex03_03();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int[] a = new int[n1];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n1; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(n1, n2, a));
		br.close();
	}
}

