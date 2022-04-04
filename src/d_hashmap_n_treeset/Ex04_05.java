package d_hashmap_n_treeset;

import java.util.Scanner;
import java.util.TreeSet;

class Ex04_05 {
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
		TreeSet<Integer> count = new TreeSet<>();
		int lt = 0, ct = 1, rt = 2;
		
		while(lt < arr.length-2) {
			count.add(arr[lt] + arr[ct] + arr[rt]);
			
			if(rt == arr.length-1) {
				if(ct == rt - 1) {
					lt++;
					ct = lt;
				}
				ct++;
				rt = ct;
			}
			rt++;
			
			if(count.size() == k + 1) {
				count.remove(count.first());
			}
		}
		
		if(count.size() >= k) answer = count.first();
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04_05 T = new Ex04_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, k, arr));
	}
}
