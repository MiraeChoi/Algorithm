package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A17478_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int num;
	static String udb = "";
	
	public static void main(String[] args) throws IOException {
		num = Integer.parseInt(br.readLine());
		sb.append("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		recur1(1);
		sb.append(udb + "\"����Լ��� ������?\"\n");
		sb.append(udb + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
		recur2(udb.length());
		System.out.println(sb);
	}
	
	static void recur1(int n) {
		sb.append(udb + "\"����Լ��� ������?\"\n");
		sb.append(udb + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
		sb.append(udb + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
		sb.append(udb + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
		udb += "____";
		if(n == num) return;
		else recur1(n+1);
	}
	
	static void recur2(int len) {
		sb.append(udb + "��� �亯�Ͽ���.\n");
		if(len > 0) {
			len -= 4;
			udb = udb.substring(0, len);
			recur2(len);
		}
	}
}
