package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2108_2 {
	//�¾ҽ��ϴ�!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());				//N = 5
		//�Է°��� ���� : -4000 ~ 4000
		int[] arr = new int[8001];								//arr = {-1, -2, -3, -1, -2}
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int mid = 10000;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++;
		
			if(max < value) max = value;
			if(min > value) min = value;
		}
		int cnt = 0;		//�߾Ӱ� �� ���� ��
		int mode_max = 0; 	//�ֺ��� �ִ�
		
		//������ ������ �ֺ��� 1���� �������� ��� true, �ƴ� ��� false
		boolean flag = false;	 
		
		for(int i = min + 4000; i <= max + 4000; i++) {			//i = min + 4000 = 3997; i <= max + 4000 = 3999;		i = 3998						i = 3999
			if(arr[i] > 0) {									//arr[3997] > 0											arr[3998] > 0					arr[3999] > 0
				//���� Ƚ���� ��ü ������ ���ݿ� �� ��ģ�ٸ�
				if(cnt < (N + 1) / 2) {							//cnt = 0 < (5 + 1) / 2									cnt = 1 < 3						cnt = 3 < 3
					cnt += arr[i];	// i���� �󵵼��� count�� ����	//cnt += arr[3997] = 1									cnt += arr[3998] = 3
					mid = i - 4000;								//mid = 3997 - 4000 = -3								mid = -2
				}
				
				//���� �ֺ󰪺��� ���� ���� �󵵼��� �� ���� ���
				if(mode_max < arr[i]) {							//mode_max = 0 < arr[3997] = 1							mode_max = 1 < arr[3998] = 2	mode_max = 2 > arr[3999] = 2
					mode_max = arr[i];							//mode_max = 1											mode_max = 2
					mode = i - 4000;							//mode = 3997 - 4000 = -3								mode = -2;
					flag = true;	//ù �����̹Ƿ� true�� ����
				}
				//���� �ֺ� �ִ񰪰� ������ ���鼭 �� ���� �ߺ��Ǵ� ��� 
				else if(mode_max == arr[i] && flag == true) {																							//mode_max == arr[3999] && flag = true
					mode = i - 4000;																													//mode = -1
					flag = false;
				}
			}
		}
		System.out.println((int)Math.round((double)sum / N));																							//-2
		System.out.println(mid);																														//-2
		System.out.println(mode);																														//-1
		System.out.println(max - min);																													//2
	}
}
