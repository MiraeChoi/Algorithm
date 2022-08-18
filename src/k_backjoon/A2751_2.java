package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A2751_2 {
	private static int[] sorted; //��ġ�� �������� �����Ͽ� ���Ҹ� ���� �ӽ� �迭
	
	public static void merge_sort(int[] a) {
		sorted = new int[a.length];
		merge_sort(a, 0, a.length - 1);
		sorted = null;
	}
	
	//���� ���� Bottom-Up ��� ����
	private static void merge_sort(int[] a, int left, int right) {
		//1 - 2 - 4 - 8 - ... ������ 1���� ���긮��Ʈ�� ������ ������ �� �辿 �ø���.
		for(int size = 1; size <= right; size += size) {
			/* �� �κи���Ʈ�� ������� �������ش�.
			 * ���� ��� ���� �κи���Ʈ�� ũ�Ⱑ 1(size=1)�� ��
			 * ���� �κи���Ʈ(low ~ mid)�� ������ �κи���Ʈ(mid + 1 ~ high)�� �����ϸ�
			 * ���� �κи���Ʈ�� low = mid = 0 �̰�,
			 * ������ �κи���Ʈ�� mid + 1���� low + (2 * size) - 1 = 1 �� �ȴ�.
			 *  
			 * �� �� high�� �迭�� �ε����� �Ѿ �� �����Ƿ� right�� �� �� ���� ����
			 * ���յǵ��� �ؾ��Ѵ�. */
			for(int l = 0; l <= right - size; l += (2 * size)) {
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l + (2 * size) - 1, right);
				merge(a, low, mid, high);
			}
		}	
	}
	
	/**
	 * ��ĥ �κи���Ʈ�� a�迭�� left ~ right �����̴�. 
	 * 
	 * @param a		������ �迭
	 * @param left	�迭�� ������
	 * @param mid	�迭�� �߰���
	 * @param right	�迭�� �� ��
	 */
	private static void merge(int[] a, int left, int mid, int right) {
		int l = left;		//���� �κи���Ʈ ������
		int r = mid + 1;	//������ �κи���Ʈ�� ������ 
		int idx = left;		//ä������ �迭�� �ε���
		
		while(l <= mid && r <= right) {
			if(a[l] <= a[r]) {
				//���� �κи���Ʈ l��° ���Ұ� ������ �κи���Ʈ r��° ���Һ��� �۰ų� ���� ���
				//������ l��° ���Ҹ� �� �迭�� �ְ� l�� idx�� 1 ������Ų��.
				sorted[idx] = a[l];
				idx++;
				l++;
			} else {
				//������ �κи���Ʈ r��° ���Ұ� ���� �κи���Ʈ l��° ���Һ��� �۰ų� ���� ���
				//�������� r��° ���Ҹ� �� �迭�� �ְ� r�� idx�� 1 ������Ų��.
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}
		if(l > mid) {
			//���� �κи���Ʈ�� ���� ��� �� �迭�� ä������ ��� (l > mid)
			//= ������ �κи���Ʈ ���Ұ� ���� �������� ���
			//������ �κи���Ʈ�� ������ ���ҵ��� �� �迭�� ä���ش�.
			while(r <= right) {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		} else {
			//������ �κи���Ʈ�� ���� ��� �� �迭�� ä������ ��� (r > right)
			//= ���� �κи���Ʈ ���Ұ� ���� �������� ���
			//���� �κи���Ʈ�� ������ ���ҵ��� �� �迭�� ä���ش�.
			while(l <= mid) {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
		}
		
		//���ĵ� �� �迭�� ������ �迭�� �����Ͽ� �Ű��ش�.
		for(int i = left; i <= right; i++) a[i] = sorted[i];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		merge_sort(arr);
		for(int i = 0; i < n; i++) sb.append(arr[i] + "\n");
		System.out.println(sb);
	}
}
