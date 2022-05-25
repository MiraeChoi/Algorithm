package programmers;

import java.util.Arrays;

class SCLevel2_1_1 {
	//구명보트를 최대한 적게 사용하여 모든 사람 구출하기
	//구명보트는 한 번에 최대 2명까지 탈 수 있다.
	//모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return한다.
	
	//무인도에 갇힌 사람 : 1명 이상 50,000명 이하
	//각 사람의 몸무게 : 40kg 이상 240kg 이하
	//구명보트의 무게 제한 : 40kg 이상 240kg 이하
	//구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어진다.
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int cnt = 0;
        
        for(int i = 0; i < people.length; i++) {
        	cnt += people[i];
        	if(cnt >= 100) {
        		answer++;
        		cnt = 0;
        	}
        	System.out.println(i + " : " + answer + " / " + cnt);
        	if(i == people.length - 1) answer++;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		SCLevel2_1_1 T = new SCLevel2_1_1();
		//return 3
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		//return 3
//		int[] people = {70, 80, 50};
//		int limit = 100;
		System.out.println(T.solution(people, limit));
	}
}
