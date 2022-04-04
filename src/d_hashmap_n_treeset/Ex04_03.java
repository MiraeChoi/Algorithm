package d_hashmap_n_treeset;

import java.util.HashMap;
import java.util.Scanner;

class Ex04_03 {
	//����
	//������ �ƺ��� �������� ��մϴ�. �����ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ ������� ������
	//�� �������� ���϶�� �߽��ϴ�.
	//���� N=7�̰� 7�� ���� �������� �Ʒ��� ����, �̶� K=4�̸�
	//20 12 20 10 23 17 10
	//�� ���� 4�ϰ��� ������ ����������
	//ù ��° ������ [20, 12, 20, 10]�� ������� ������ 20, 12, 10���� 3�̴�.
	//�� ��° ������ [12, 20, 10, 23]�� ������� ������ 4�̴�.
	//�� ��° ������ [20, 10, 23, 17]�� ������� ������ 4�̴�.
	//�� ��° ������ [10, 23, 17, 10]�� ������� ������ 3�̴�.
	//N�ϰ��� �����ϰ� ���ӱ����� ���� K�� �־����� ù ��° �������� �� ������
	//������� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
	//�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
	
	//���
	//ù �ٿ� �� ������ ����� ������ ������� ����մϴ�.
	public int[] solution(int n, int k, int[] arr) {
		int[] answer = new int[n-k+1];
		HashMap<Integer, Integer> map;
		
		for(int i = 0; i < n-k+1; i++) {
			map = new HashMap<>();
			
			for(int j = 0+i; j < k+i; j++) {
				if(j == n) break;
				map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
			}

			answer[i] = map.size();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_03 T = new Ex04_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
	}
}
