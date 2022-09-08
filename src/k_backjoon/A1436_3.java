package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A1436_3 {
	public static void solution(int n) {										//9
		int count = 1;
		int prev_digit = 0;	//선수 자릿수
		int num = 0;		//선수 자릿수를 제외한 나머지 뒷 자릿수
		//'_'(언더바)를 기준으로 표현한다.  ex) (prev_digit) _ num
		//이때, 자릿수에 따라서 num 은 0 또는 600, 660, 666 을 갖는다.
		while(true) {
			//6660_000(o) : 여기서 prev_digit은 6660, 10을 나누면 666 나옴
			//6666_000(x) : prev_digit을 10으로 나눈 나머지가 6인 경우는 검사하지 않음
			if(((prev_digit % 10000) / 10) == 666 && prev_digit % 10 != 6) {
				for(int i = 0; i < 1000; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				prev_digit++;
			}
			//666_000(o) : 여기서 prev_digit은 666, 1000을 나눈 나머지는 666 나옴
			else if(prev_digit % 1000 == 666) {
				num = 0;
				for(int i = 0; i < 1000; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev_digit++;
			}
			
			//66_600, 166_600, ...
			else if(prev_digit % 100 == 66) {
				num = 600;
				for(int i = 0; i < 100; i++) {
					if(count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev_digit++;
			}
			
			//6_660, 16_663, ...
			else if(prev_digit % 10 == 6) {																							//prev_digit = 6 % 10 = 6
				System.out.println("우하하 " + count);
				num = 660;
				for(int i = 0; i < 10; i++) {
					if(count == n) {																								//count = 7		count = 8	count = 9 = n
						System.out.print(prev_digit * 1000 + num);																								//syso(6 * 1000 + 662) = 6662
						return;
					}
					num++;																											//num = 661		num = 662
					count++;																										//count = 8		count = 9
				}
				prev_digit++;
			} 
			//그 외(ex. 241_666, 23_666 ...)
			else {
				System.out.println("하이염 " + count);
				num = 666;
				if(count == n) {											//count = 1			count = 2		...	count = 6
					System.out.print(prev_digit * 1000 + num);
					return;
				}
				count++;													//count = 2			count = 3		...	count = 7
				prev_digit++;												//prev_dight = 1	prev_digit = 2  ...	prev_digit = 6
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
 
		if(n > 1) solution(n);
		else System.out.println(666);
	}
}
