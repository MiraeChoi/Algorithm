package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2108_2 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());				//N = 5
		//입력값의 범위 : -4000 ~ 4000
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
		int cnt = 0;		//중앙값 빈도 누적 수
		int mode_max = 0; 	//최빈값의 최댓값
		
		//이전과 동일한 최빈값이 1번만 등장했을 경우 true, 아닐 경우 false
		boolean flag = false;	 
		
		for(int i = min + 4000; i <= max + 4000; i++) {			//i = min + 4000 = 3997; i <= max + 4000 = 3999;		i = 3998						i = 3999
			if(arr[i] > 0) {									//arr[3997] > 0											arr[3998] > 0					arr[3999] > 0
				//누적 횟수가 전체 길이의 절반에 못 미친다면
				if(cnt < (N + 1) / 2) {							//cnt = 0 < (5 + 1) / 2									cnt = 1 < 3						cnt = 3 < 3
					cnt += arr[i];	// i값의 빈도수를 count에 누적	//cnt += arr[3997] = 1									cnt += arr[3998] = 3
					mid = i - 4000;								//mid = 3997 - 4000 = -3								mid = -2
				}
				
				//이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
				if(mode_max < arr[i]) {							//mode_max = 0 < arr[3997] = 1							mode_max = 1 < arr[3998] = 2	mode_max = 2 > arr[3999] = 2
					mode_max = arr[i];							//mode_max = 1											mode_max = 2
					mode = i - 4000;							//mode = 3997 - 4000 = -3								mode = -2;
					flag = true;	//첫 등장이므로 true로 변경
				}
				//이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
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
