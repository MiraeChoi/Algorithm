package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A17478_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int num;
	static String udb = "";
	//재귀함수로 다시 ㄱㄱ
	public static void main(String[] args) throws IOException {
		num = Integer.parseInt(br.readLine());
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		recur1(0);
		sb.append(udb + "\"재귀함수가 뭔가요?\"\n");
		sb.append(udb + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
		recur2(num);
		System.out.println(sb);
	}
	
	static void recur1(int n) {
		sb.append(udb + "\"재귀함수가 뭔가요?\"\n");
		sb.append(udb + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
		sb.append(udb + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
		sb.append(udb + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		udb += "____";
	}
	
	static void recur2(int n) {
		for(int i = 0; i < n + 1; i++) {
			sb.append(udb + "라고 답변하였지.\n");
			if(udb.length() > 0) udb = udb.substring(0, udb.length() - 4);
		}
	}
}
