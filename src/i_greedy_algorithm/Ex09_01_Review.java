package i_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point01R implements Comparable<Point01R> {
	int h, w;
	
	public Point01R(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Point01R o) {
		return o.h - this.h;
	}
}

class Ex09_01_Review {
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
	public int solution(int n, ArrayList<Point01R> arr) {
		int answer = 0;
		Collections.sort(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).h + "/" + arr.get(i).w);
		}
		int max = Integer.MIN_VALUE;
		
		for(Point01R body : arr) {
			if(body.w > max) {
				max = body.w;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex09_01_Review T = new Ex09_01_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point01R> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Point01R(kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(n, arr));
	}
}
