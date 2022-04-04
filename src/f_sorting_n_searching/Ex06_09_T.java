package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_09_T {
	//����
	//���Ϸ��ڵ忡���� �Ҽ����� ���� �������� ���̺� �������� DVD�� ����� �Ǹ��Ϸ� �Ѵ�.
	//DVD���� �� N���� ���� ���µ�, DVD�� ��ȭ�� ������ ���̺꿡���� ������ �״�� �����Ǿ�� �Ѵ�.
	//������ �ٲ�� ���� �츮�� ���� �����ʾ��� �ſ� �Ⱦ��Ѵ�. ��, 1�� �뷡�� 5�� �뷡�� ���� DVD�� ��ȭ�ϱ� ���ؼ���
	//1���� 5�� ������ ��� �뷡�� ���� DVD�� ��ȭ�ؾ� �Ѵ�. ���� �� �뷡�� �ɰ��� �� ���� DVD�� ��ȭ�ϸ� �ȵȴ�.
	//���Ϸ��ڵ� ���忡���� �� DVD�� �ȸ� ������ Ȯ���� �� ���� ������ �� ����� ����Ǵ� DVD�� ������ ���̷��� �Ѵ�.
	//��� ���� ���Ϸ��ڵ�� M���� DVD�� ��� �������� ��ȭ�ϱ�� �Ͽ���. �� �� DVD�� ũ��(��ȭ ������ ����)�� �ּҷ� �Ϸ��� �Ѵ�.
	//�׸��� M���� DVD�� ��� ���� ũ�⿩�� ���������� ���� ��� ������ �� ���� ũ��� �ؾ� �Ѵ�.
	
	//�Է�
	//ù° �ٿ� �ڿ��� N(1��N��1,000), M(1��M��N)�� �־�����.
	//���� �ٿ��� �������� ���̺꿡�� �θ� ������� �θ� ���� ���̰� �� ������(�ڿ���) �־�����.
	//�θ� ���� ���̴� 10,000���� ���� �ʴ´ٰ� ��������.
	
	//���
	//ù ��° �ٺ��� DVD�� �ּ� �뷮 ũ�⸦ ����ϼ���.
	
	//��Ʈ
	//���� : 3���� DVD�뷮�� 17��¥���̸� (1, 2, 3, 4, 5) (6, 7), (8, 9) �̷��� 3���� DVD�� ������ �� �� �ִ�.
	//17�� �뷮���� ���� �뷮���δ� 3���� DVD�� ��� ������ ��ȭ�� �� ����.
	public int count(int[] arr, int capacity) {
		int cnt = 1, sum = 0;
		
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			} else sum += x;
		}
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			} else lt = mid + 1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_09_T T = new Ex06_09_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
