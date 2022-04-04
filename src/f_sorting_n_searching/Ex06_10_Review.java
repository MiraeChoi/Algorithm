package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_10_Review {
	//설명
	//N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
	//현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
	//가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
	//C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
	
	//입력
	//첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
	//둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
	
	//출력
	//첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.
	public int count(int[] arr, int mid) {
		int cnt = 1;
		int ep = arr[0]; //ep = 1
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] - ep >= mid) { //1-1=0 < 5  ... 8-1=7 >= 5  9-8=1 < 5     | 4-1=3 >= 2   8-4=4 >= 2  | 4-1=3 >= 3   8-4=4 >= 3
				cnt++;                                //cnt = 2                 | cnt = 2      cnt = 3     | cnt = 2      cnt = 3
				ep = arr[i];                          //ep = 8                  | ep = 4       ep = 8      | ep = 4       ep = 8
			}
		}
		return cnt;                  //return 2                                 | return 3                 | return 3
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr); //1 2 4 8 9
		int lt = arr[0], rt = arr[n-1]; //lt=1, rt=9
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;    //mid=(1+9)/2 = 5       mid=(1+4)/2 = 2         mid=(3+4)/2 = 3         mid=(4+4)/2 = 4
			
			if(count(arr, mid) >= c) {  //count(arr, 5)=1 < 3   count(arr, 2)=3 >= 3    count(arr, 3)=3 >= 3    count(arr, 4)=2 < 3
				answer = mid;                                   //answer = 2            answer = 3
				lt = mid + 1;                                   //lt=2+1 = 3            lt=3+1 = 4
			} else rt = mid - 1;        //rt=5-1 = 4                                                            rt=4-1 = 3(end)
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_10_Review T = new Ex06_10_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
}
