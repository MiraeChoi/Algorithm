package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_10_Review {
	//����
	//N���� �������� �������� �ֽ��ϴ�. �� �������� x1, x2, x3, ......, xN�� ��ǥ�� ������, ���������� ��ǥ�� �ߺ��Ǵ� ���� �����ϴ�.
	//������ C������ ���� ������ �ִµ�, �� ������ ���� ������ �ִ� ���� �������� �ʽ��ϴ�. �� ���������� �� ������ ���� ���� �� �ְ�,
	//���� ����� �� ���� �Ÿ��� �ִ밡 �ǰ� ���� �������� ��ġ�ϰ� �ͽ��ϴ�.
	//C������ ���� N���� �������� ��ġ���� �� ���� ����� �� ���� �Ÿ��� �ִ밡 �Ǵ� �� �ִ밪�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù �ٿ� �ڿ��� N(3<=N<=200,000)�� C(2<=C<=N)�� ������ ���̿� �ΰ� �־����ϴ�.
	//��° �ٿ� �������� ��ǥ xi(0<=xi<=1,000,000,000)�� ���ʷ� �־����ϴ�.
	
	//���
	//ù �ٿ� ���� ����� �� ���� �ִ� �Ÿ��� ����ϼ���.
	public int count(int[] arr, int mid) {
		int cnt = 1;
		int ep = arr[0]; //ep = 1
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] - ep >= mid) { //1-1=0 < 5  ... 8-1=7 >= 5  9-8=1 < 5     | 4-1=3 >= 2   8-4=4 >= 2  | 4-1=3 >= 3   8-4=4 >= 3
				cnt++;                                //cnt = 2                 | cnt = 2      cnt = 3     | cnt = 2      cnt = 3
				ep = arr[i];                          //ep = 8                  | ep = 4       ep = 8      | ep = 4       ep = 8
			}
		}
		return cnt;                  //return 2                                 | return 3                 | return 3
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr); //1 2 4 8 9
		int lt = arr[0], rt = arr[n-1]; //lt=1, rt=9
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;    //mid=(1+9)/2 = 5       mid=(1+4)/2 = 2         mid=(3+4)/2 = 3         mid=(4+4)/2 = 4
			
			if(count(arr, mid) >= c) {  //count(arr, 5)=1 < 3   count(arr, 2)=3 >= 3    count(arr, 3)=3 >= 3    count(arr, 4)=2 < 3
				answer = mid;                                   //answer = 2            answer = 3
				lt = mid + 1;                                   //lt=2+1 = 3            lt=3+1 = 4
			} else rt = mid - 1;        //rt=5-1 = 4                                                            rt=4-1 = 3(end)
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_10_Review T = new Ex06_10_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
}
