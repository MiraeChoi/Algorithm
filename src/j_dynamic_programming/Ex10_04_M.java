package j_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick04M implements Comparable<Brick04M>{
	int s, h, w;
	
	public Brick04M(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Brick04M o) {
		return o.s - this.s;
	}
}

class Ex10_04_M {
	//����
	//�ظ��� ���簢���� ������ü �������� ����Ͽ� ž�� �װ��� �Ѵ�. ž�� ������ �� ���� �Ʒ����� ���� �����鼭 ����� ����.
	//�Ʒ��� ������ �����ϸ鼭 ���� ���� ž�� ���� �� �ִ� ���α׷��� �ۼ��Ͻÿ�.
	//(����1) ������ ȸ����ų �� ����. ��, ������ �ظ����� ����� �� ����.
	//(����2) �ظ��� ���̰� ���� ������ ������, ���� ���԰� ���� ������ ����.
	//(����3) �������� ���̴� ���� ���� �ִ�.
	//(����4) ž�� ���� �� �ظ��� ���� ���� ���� �ظ��� ���� ������ ���� �� ����.
	//(����5) ���԰� ���ſ� ������ ���԰� ������ ���� ���� ���� �� ����.
	
	//�Է�
	//�Է� ������ ù° �ٿ��� �Էµ� ������ ���� �־�����. �Է����� �־����� ������ ���� �ִ� 100���̴�.
	//��° �ٺ��ʹ� �� �ٿ� �� ���� ������ ���� ������ ���� �ظ��� ����, ������ ���� �׸��� ���԰� ���ʴ�� ���� ������ �־�����.
	//�� ������ �ԷµǴ� ������� 1���� �������� ��ȣ�� ������. ������ ����, ���� ���Դ� 10,000���� �۰ų� ���� �ڿ����̴�.
	
	//���
	//ù ��° �ٿ� ���� ���� ���� �� �ִ� ž�� ���̸� ����Ѵ�.
	static int[] dy;
	
	public int solution(int n, ArrayList<Brick04M> arr) {
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			int max = 0;
			
			for(int j = i-1; j >= 0; j--) {
				if(arr.get(i).w < arr.get(j).w && dy[j] > max) max = dy[j];
			}
			dy[i] = arr.get(i).h + max;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex10_04_M T = new Ex10_04_M();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n];
		ArrayList<Brick04M> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(new Brick04M(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		Collections.sort(arr);
		System.out.println(T.solution(n, arr));
	}
}
