package j_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick04R implements Comparable<Brick04R>{
	int s, h, w;
	
	public Brick04R(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Brick04R o) {
		return o.s - this.s;
	}
}

class Ex10_04_Review {
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
	
	public int solution(int n, ArrayList<Brick04R> arr) {
		Collections.sort(arr);
		int answer = dy[0] = arr.get(0).h;	//answer = dy[0] = 3
		
		for(int i = 1; i < n; i++) {		//i = 1					i = 2					i = 3				i = 4
			int max = 0;
			
			for(int j = i-1; j >= 0; j--) {	//j = 0					j = 1	j = 0			j = 2 ...1 0		j = 3			j = 2 ...1 0
				if(arr.get(j).w > arr.get(i).w && dy[j] > max) max = dy[j];//4 > 3 && 3 > 0						6 > 2 && 4 > 0	3 > 2 && 5 > 4
			}																//max = 3							max = 4			max = 5
			dy[i] = arr.get(i).h + max;		//dy[1] = 2 + 0 = 2		dy[2] = 2 + 3 = 5		dy[3] = 4 + 0 = 4					dy[4] = 5 + 5 = 10
			answer = Math.max(answer, dy[i]);//answer = 2 or 3 = 3	answer = 3 or 5 = 5		answer = 4 or 5 = 5					answer = 5 or 10 = 10
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex10_04_Review T = new Ex10_04_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Brick04R> arr = new ArrayList<>();
		dy = new int[n];
		for(int i = 0; i < n; i++) {
			arr.add(new Brick04R(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(n, arr));
		//for(int i = 0; i < dy.length; i++) System.out.print(dy[i] + " ");
	}
}
