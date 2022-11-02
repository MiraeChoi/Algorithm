package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A1002�� ���弱
class A1004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int answer = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());
			
			int n = Integer.parseInt(br.readLine());
			//�༺ ���� �ʱ�ȭ
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int radius = Integer.parseInt(st.nextToken());
				
				boolean check1 = false; //������� ���� �༺�� �ȿ� �ִ��� �ۿ� �ִ��� ����
				boolean check2 = false; //�������� ���� �༺�� �ȿ� �ִ��� �ۿ� �ִ��� ����
				
				//�������� �༺�� �ۿ� ������ true
				if(Math.pow(startX - x, 2) + Math.pow(startY - y, 2) > Math.pow(radius, 2)) check1 = true;
				//�������� �༺�� �ۿ� ������ true
				if(Math.pow(endX - x, 2) + Math.pow(endY - y, 2) > Math.pow(radius, 2)) check2 = true;
				
				//������, ������ �� �� �ϳ��� �༺ �ȿ� �ְ� �ٸ� ���� �ۿ� �ִ� ���
				if((check1 == true && check2 == false) || (check1 == false && check2 == true)) answer++;
			}
			sb.append(answer).append('\n');
		}
		System.out.println(sb);
	}
}