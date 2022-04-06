package j_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick04 implements Comparable<Brick04>{
	int area, height, weight;
	
	public Brick04(int area, int height, int weight) {
		this.area = area;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Brick04 o) {
		return this.area - o.area;
	}
}

class Ex10_04 {
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
	static ArrayList<Brick04> arr = new ArrayList<>();
	
	public int solution(int n) {
		int answer = 0;
		dy[0] = arr.get(0).height;
		
		for(int i = 1; i < n; i++) {
			Brick04 cur = arr.get(i);
			dy[i] += cur.height;
			
			for(int j = i-1; j >= 0; j--) {
				if(arr.get(j).weight < cur.weight) {
					cur = arr.get(j);
					dy[i] += cur.height;
				}
			}
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex10_04 T = new Ex10_04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n];
		for(int i = 0; i < n; i++) {
			arr.add(new Brick04(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		Collections.sort(arr);
		System.out.println(T.solution(n));
	}
}
