package f_sorting_n_searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
	//����
	//N���� ������ ��ǥ(x, y)�� �־����� ��� ��ǥ�� ������������ �����ϴ� ���α׷��� �ۼ��ϼ���.
	//���ı����� ���� x���� ���ؼ� �����ϰ�, x���� ���� ��� y���� ���� �����մϴ�.
	
	//�Է�
	//ù° �ٿ� ��ǥ�� ������ N(3<=N<=100,000)�� �־����ϴ�.
	//�� ��° �ٺ��� N���� ��ǥ�� x, y ������ �־����ϴ�. x, y���� ����� �Էµ˴ϴ�.
	
	//���
	//N���� ��ǥ�� �����Ͽ� ����ϼ���.
	int x; int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y - o.y;
		else return this.x - o.x;
	}
}

class Ex06_07_Review {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for(Point o : arr) System.out.println(o.x + " " + o.y);
	}
}
