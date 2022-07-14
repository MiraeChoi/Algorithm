package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A17478_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int num;
	static String udb = "";
	//����Լ��� �ٽ� ����
	public static void main(String[] args) throws IOException {
		num = Integer.parseInt(br.readLine());
		sb.append("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		recur1(0);
		sb.append(udb + "\"����Լ��� ������?\"\n");
		sb.append(udb + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
		recur2(num);
		System.out.println(sb);
	}
	
	static void recur1(int n) {
		sb.append(udb + "\"����Լ��� ������?\"\n");
		sb.append(udb + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
		sb.append(udb + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
		sb.append(udb + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
		udb += "____";
	}
	
	static void recur2(int n) {
		for(int i = 0; i < n + 1; i++) {
			sb.append(udb + "��� �亯�Ͽ���.\n");
			if(udb.length() > 0) udb = udb.substring(0, udb.length() - 4);
		}
	}
}
