package f_sorting_n_searching;

import java.util.Scanner;

class Ex06_09 {
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
	public int solution(int n, int m, int[] arr) {
		int answer = Integer.MAX_VALUE;
		int first = n / m;
		int second = n / m * 2;
		
		while(first < second && second < n) {
			int cnt1 = 0, cnt2 = 0, cnt3 = 0;
			
			for(int i = 0; i < first; i++) cnt1 += arr[i];
			for(int i = first; i < second; i++) cnt2 += arr[i];
			for(int i = second; i < n; i++) cnt3 += arr[i];
			System.out.println("(" + first + ", " + second + ")");
			System.out.println("1." + cnt1 + " 2." + cnt2 + " 3." + cnt3);
			
			int tmp = Integer.max(cnt3, Integer.max(cnt1, cnt2));
			System.out.println("tmp : " + tmp);
			if(tmp < answer) answer = tmp;
			System.out.println("answer : " + answer);
			
			if(cnt1 > cnt2 && cnt1 > cnt3) {
				if(cnt2 > cnt3) break;
				else second++;
			} else if(cnt2 > cnt1 && cnt2 > cnt3) {
				if(cnt1 > cnt3) break;
				else first++;
			} else if(cnt3 > cnt1 && cnt3 > cnt2) {
				if(cnt1 > cnt2) second++;
				else first++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex06_09 T = new Ex06_09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
