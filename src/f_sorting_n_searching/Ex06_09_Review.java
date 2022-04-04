package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_09_Review {
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
		int cnt = 1;
		int sum = 0;
		
		for(int x : arr) {
			if(sum + x > capacity) { //0+1 > 27   //1+2 > 27   //2+3 > 27 . . . //21+7 > 27  //7+8 > 27
				cnt++;                                                          //cnt = 1
				sum = x;                                                        //sum = 7
			} else sum += x;         //sum=0+1=1  //sum=1+2=3  //sum=3+3=6                   //sum=7+8=15
		}
		return cnt;                  //return 1
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt(); //9
		int rt = Arrays.stream(arr).sum(); //45
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2; //(9+45)/2 = 27             (9+26)/2 = 17           (9+16)/2 = 12           (13+16)/2 = 14           (15+16)/2 = 15          (16+16)/2 = 16
			
			if(count(arr, mid) <= m) { //cnt(arr, 27) = 1 <= 3   cnt(arr, 17) = 3 <= 3   cnt(arr, 12) = 5 > 3     cnt(arr, 14) = 4 > 3    cnt(arr, 15) = 4 > 3    cnt(arr, 16) = 4 > 3
				answer = mid;			//answer = 27            answer = 17
				rt = mid - 1;           //rt = 26                rt = 16
			} else lt = mid + 1;                                                         //lt = 13                lt = 15                 lt = 16                 lt = 17(end)
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_09_Review T = new Ex06_09_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
