package d_hashmap_n_treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Ex04_05_Review {
	//����
	//������ 1���� 100 ������ �ڿ����� ���� N���� ī�带 ������ �ֽ��ϴ�. ���� ������ ī�尡 ���� �� ���� �� �ֽ��ϴ�.
	//������ �� �� 3���� �̾� �� ī�忡 ���� ���� ���� ���� ����Ϸ��� �մϴ�. 3���� ���� �� �ִ� ��� ��츦 ����մϴ�.
	//����� �� �� K��°�� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//���� ū ������ ������� ���� 25 25 23 23 22 20 19......�̰� K���� 3�̶�� K��° ū ���� 22�Դϴ�.
	
	//�Է�
	//ù �ٿ� �ڿ��� N(3<=N<=100)�� K(1<=K<=50) �Էµǰ�, �� ���� �ٿ� N���� ī�尪�� �Էµȴ�.
	
	//���
	//ù �ٿ� K��° ���� ����մϴ�. K��° ���� �������� ������ -1�� ����մϴ�.
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int l = j+1; l < n; l++) {
					set.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0;
		
		for(int x : set) {
			cnt++;
			if(cnt == k) return x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_05_Review T = new Ex04_05_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}
