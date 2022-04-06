package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

class Ex09_01_M {
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
	public int solution(int n, ArrayList<Integer> height, ArrayList<Integer> weight) {
		int answer = n;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j && height.get(i) < height.get(j) && weight.get(i) < weight.get(j)) {
					answer--;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_01_M T = new Ex09_01_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Integer> height = new ArrayList<>();
		ArrayList<Integer> weight = new ArrayList<>();
//		int[] height = new int[n];
//		int[] weight = new int[n];
		for(int i = 0; i < n; i++) {
			height.add(kb.nextInt());
			weight.add(kb.nextInt());
		}
		System.out.println(T.solution(n, height, weight));
	}
}
