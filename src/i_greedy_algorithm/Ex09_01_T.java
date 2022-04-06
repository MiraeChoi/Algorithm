package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body01T implements Comparable<Body01T> {
	public int h, w;
	
	public Body01T(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Body01T o) {
		return o.h - this.h;
	}
}

class Ex09_01_T {
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
	public int solution(ArrayList<Body01T> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		
		for(Body01T ob : arr) {
			if(ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Ex09_01_T T = new Ex09_01_T();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body01T> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Body01T(h, w));
		}
		System.out.println(T.solution(arr, n));
	}
}
