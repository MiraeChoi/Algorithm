package b_array;

import java.util.ArrayList;
import java.util.Scanner;

class Ex02_06 {
	//����
	//N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	//���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�. �׷��� 23�� ����Ѵ�. �� 910�� �������� 19�� ����ȭ �ؾ� �Ѵ�.
	//ù �ڸ������� ���ӵ� 0�� �����Ѵ�.
	
	//�Է�
	//ù �ٿ� �ڿ����� ���� N(3<=N<=100)�� �־�����, �� ���� �ٿ� N���� �ڿ����� �־�����.
	//�� �ڿ����� ũ��� 100,000�� ���� �ʴ´�.
	
	//���
	//ù �ٿ� ������ �Ҽ��� ����մϴ�. ��¼����� �Էµ� ������� ����մϴ�.
	public ArrayList<Integer> solution(int n, String[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] pArr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			String tmp = "";
			
			for(int j = arr[i].length()-1; j >= 0; j--) tmp += arr[i].charAt(j);
			
			pArr[i] = Integer.parseInt(tmp);
		}
		
		for(int i = 0; i < pArr.length; i++) {
			int count = 0;
			
			if(pArr[i] >= 2) {
				for(int j = 2; j < pArr[i]; j++) {
					if(pArr[i] % j == 0) {
						count++;
						break;
					}
				}
			} else count++;
			
			if(count == 0) answer.add(pArr[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02_06 T = new Ex02_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) arr[i] = kb.next();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
