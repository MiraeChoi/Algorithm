package j_dynamic_programming;

import java.util.Scanner;

class Ex10_06_Review {
	//����
	//�̹� �����ø��ǾƵ��ȸ���� ���� ������ ���� ���Ͽ� ������ �������� �ֽ� N���� ������ Ǯ���� �մϴ�.
	//�� ������ �װ��� Ǯ���� �� ��� ������ Ǫ�µ� �ɸ��� �ð��� �־����� �˴ϴ�.
	//���� �ð� M�ȿ� N���� ���� �� �ִ� ������ ���� �� �ֵ��� �ؾ� �մϴ�.
	//(�ش� ������ �ش� �ð��� �ɸ��� Ǫ�� �ɷ� �����Ѵ�, �� ������ �� ���� Ǯ �� �ֽ��ϴ�.)
	
	//�Է�
	//ù ��° �ٿ� ������ ���� N(1<=N<=50)�� ���� �ð� M(10<=M<=300)�� �־����ϴ�.
	//�� ��° �ٺ��� N�ٿ� ���� ������ Ǯ���� ���� ������ Ǫ�� �� �ɸ��� �ð��� �־����ϴ�.
	
	//���
	//ù ��° �ٿ� ���� �ð��ȿ� ���� �� �ִ� �ִ� ������ ����մϴ�.
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dy = new int[m+1];
		for(int i = 0; i < n; i++) {					//i = 0									i = 1
			int ps = kb.nextInt();						//ps = 10								ps = 25
			int pt = kb.nextInt();						//pt = 5								pt = 12
			System.out.print("dy[" + i + "]");
			for(int j = m; j >= pt; j--) {				//j = 20, j >= 5						j = 20, j >= 12
				dy[j] = Math.max(dy[j], dy[j-pt] + ps); //dy[20] = dy[20-5] + 10 = 0 + 10 = 10	dy[20] = dy[20-12] + 25 = 10 + 25 = 35
				//System.out.print(dy[j] + " ");
			}											//dy[19] = 0 + 10 = 10  ...dy[5] = 10	dy[19] = 35 ... dy[16] = 0 + 25 = 25
			//System.out.println();
		}
		System.out.println(dy[m]);
	}
}
