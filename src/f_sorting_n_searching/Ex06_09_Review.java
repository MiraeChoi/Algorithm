package f_sorting_n_searching;

import java.util.Arrays;
import java.util.Scanner;

class Ex06_09_Review {
	//설명
	//지니레코드에서는 불세출의 가수 조영필의 라이브 동영상을 DVD로 만들어 판매하려 한다.
	//DVD에는 총 N개의 곡이 들어가는데, DVD에 녹화할 때에는 라이브에서의 순서가 그대로 유지되어야 한다.
	//순서가 바뀌는 것을 우리의 가수 조영필씨가 매우 싫어한다. 즉, 1번 노래와 5번 노래를 같은 DVD에 녹화하기 위해서는
	//1번과 5번 사이의 모든 노래도 같은 DVD에 녹화해야 한다. 또한 한 노래를 쪼개서 두 개의 DVD에 녹화하면 안된다.
	//지니레코드 입장에서는 이 DVD가 팔릴 것인지 확신할 수 없기 때문에 이 사업에 낭비되는 DVD를 가급적 줄이려고 한다.
	//고민 끝에 지니레코드는 M개의 DVD에 모든 동영상을 녹화하기로 하였다. 이 때 DVD의 크기(녹화 가능한 길이)를 최소로 하려고 한다.
	//그리고 M개의 DVD는 모두 같은 크기여야 제조원가가 적게 들기 때문에 꼭 같은 크기로 해야 한다.
	
	//입력
	//첫째 줄에 자연수 N(1≤N≤1,000), M(1≤M≤N)이 주어진다.
	//다음 줄에는 조영필이 라이브에서 부른 순서대로 부른 곡의 길이가 분 단위로(자연수) 주어진다.
	//부른 곡의 길이는 10,000분을 넘지 않는다고 가정하자.
	
	//출력
	//첫 번째 줄부터 DVD의 최소 용량 크기를 출력하세요.
	
	//힌트
	//설명 : 3개의 DVD용량이 17분짜리이면 (1, 2, 3, 4, 5) (6, 7), (8, 9) 이렇게 3개의 DVD로 녹음을 할 수 있다.
	//17분 용량보다 작은 용량으로는 3개의 DVD에 모든 영상을 녹화할 수 없다.
	public int count(int[] arr, int capacity) {
		int cnt = 1;
		int sum = 0;
		
		for(int x : arr) {
			if(sum + x > capacity) { //0+1 > 27   //1+2 > 27   //2+3 > 27 . . . //21+7 > 27  //7+8 > 27
				cnt++;                                                          //cnt = 1
				sum = x;                                                        //sum = 7
			} else sum += x;         //sum=0+1=1  //sum=1+2=3  //sum=3+3=6                   //sum=7+8=15
		}
		return cnt;                  //return 1
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt(); //9
		int rt = Arrays.stream(arr).sum(); //45
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2; //(9+45)/2 = 27             (9+26)/2 = 17           (9+16)/2 = 12           (13+16)/2 = 14           (15+16)/2 = 15          (16+16)/2 = 16
			
			if(count(arr, mid) <= m) { //cnt(arr, 27) = 1 <= 3   cnt(arr, 17) = 3 <= 3   cnt(arr, 12) = 5 > 3     cnt(arr, 14) = 4 > 3    cnt(arr, 15) = 4 > 3    cnt(arr, 16) = 4 > 3
				answer = mid;			//answer = 27            answer = 17
				rt = mid - 1;           //rt = 26                rt = 16
			} else lt = mid + 1;                                                         //lt = 13                lt = 15                 lt = 16                 lt = 17(end)
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_09_Review T = new Ex06_09_Review();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
