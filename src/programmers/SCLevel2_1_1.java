package programmers;

import java.util.Arrays;

class SCLevel2_1_1 {
	//����Ʈ�� �ִ��� ���� ����Ͽ� ��� ��� �����ϱ�
	//����Ʈ�� �� ���� �ִ� 2����� Ż �� �ִ�.
	//��� ����� �����ϱ� ���� �ʿ��� ����Ʈ ������ �ּڰ��� return�Ѵ�.
	
	//���ε��� ���� ��� : 1�� �̻� 50,000�� ����
	//�� ����� ������ : 40kg �̻� 240kg ����
	//����Ʈ�� ���� ���� : 40kg �̻� 240kg ����
	//����Ʈ�� ���� ������ �׻� ������� ������ �� �ִ񰪺��� ũ�� �־�����.
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
