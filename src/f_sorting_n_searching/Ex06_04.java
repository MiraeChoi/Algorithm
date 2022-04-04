package f_sorting_n_searching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex06_04 {
	//����
	//ĳ�ø޸𸮴� CPU�� �ֱ����ġ(DRAM) ������ ����� �ӽ� �޸𸮷μ� CPU�� ó���� �۾��� ������ ���Ҵٰ�
	//�ʿ��� �ٷ� ����ؼ� ó���ӵ��� ���̴� ��ġ�̴�. ���� ��ΰ� �뷮�� �۾� ȿ�������� ����ؾ� �Ѵ�.
	//ö���� ��ǻ�ʹ� ĳ�ø޸� ��� ��Ģ�� LRU �˰����� ������.
	//LRU �˰����� Least Recently Used �� ���ڷ� �������ڸ� ���� �ֱٿ� ������ ���� �� ������ �ǹ̸� ������ �ֽ��ϴ�.
	//ĳ�ÿ��� �۾��� ������ �� ���� �������� ������� ���� ���� �����ϰڴٴ� �˰����Դϴ�.
	//���� ĳ���� ����� 5�̰� �۾��� [2 3 1 6 7] ������ ����Ǿ� �ִٸ�,
	//(�� ���� ���� �ֱٿ� ���� �۾��̰�, �� �ڴ� ���� �������� ������ ���� �۾��̴�.)
	//  1) Cache Miss : �ؾ� �� �۾��� ĳ�ÿ� ���� ���·� �� ���¿��� ���� ���ο� �۾��� 5�� �۾��� CPU�� ����Ѵٸ�
	//     Cache Miss�� �ǰ� ��� �۾��� �ڷ� �и��� 5�� �۾��� ĳ���� �� �տ� ��ġ�Ѵ�.
	//     [5 2 3 1 6] (7�� �۾��� ĳ�ÿ��� �����ȴ�.)
	//  2) Cache Hit : �ؾ� �� �۾��� ĳ�ÿ� �ִ� ���·� �� ���¿��� ���� 3�� �۾��� CPU�� ����Ѵٸ�
	//     Cache Hit�� �ǰ� 3�� �տ� �ִ� 5, 2�� �۾��� �� ĭ �ڷ� �и���, 3���� �� ������ ��ġ�ϰ� �ȴ�.
	//     [5 2 3 1 6] -> [3 5 2 1 6]
	//ĳ���� ũ�Ⱑ �־�����, ĳ�ð� ����ִ� ���¿��� N���� �۾��� CPU�� ���ʷ� ó���Ѵٸ� N���� �۾��� ó���� ��
	//ĳ�ø޸��� ���¸� ���� �ֱ� ���� �۾����� ���ʴ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	//�Է�
	//ù ��° �ٿ� ĳ���� ũ���� S(3<=S<=10)�� �۾��� ���� N(5<=N<=1,000)�� �Էµȴ�.
	//�� ��° �ٿ� N���� �۾���ȣ�� ó�������� �־�����. �۾���ȣ�� 1 ~100 �̴�.
	
	//���
	//������ �۾� �� ĳ�ø޸��� ���¸� ���� �ֱ� ���� �۾����� ���ʷ� ����մϴ�.
	public int[] solution(int s, int n, int[] arr) {
		int[] answer = new int[s];
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			if(!q.contains(arr[i])) {
				q.offer(arr[i]);
				
				for(int j = 0; j < q.size()-1; j++) q.offer(q.poll());
			} else {
				q.offer(arr[i]);
				
				for(int j = 0; j < q.size()-1;) {
					int tmp = q.poll();
					
					if(tmp != arr[i]) {
						q.offer(tmp);
						j++;
					}
				}
			}
			if(q.size() > s) {
				for(int j = 0; j < q.size()-1; j++) q.offer(q.poll());
				q.poll();
			}
			System.out.println("q : " + q);
		}
		
		for(int i = 0; i < s; i++) answer[i] = q.poll();
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_04 T = new Ex06_04();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x + " ");
	}
}
