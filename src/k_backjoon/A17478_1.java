package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A17478_1 {
	//�¾ҽ��ϴ�!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		sb.append("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		String udb = "";
		for(int i = 0; i < n; i++) {
			sb.append(udb + "\"����Լ��� ������?\"\n");
			sb.append(udb + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
			sb.append(udb + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
			sb.append(udb + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
			udb += "____";
		}
		sb.append(udb + "\"����Լ��� ������?\"\n");
		sb.append(udb + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
		for(int i = 0; i < n + 1; i++) {
			sb.append(udb + "��� �亯�Ͽ���.\n");
			if(udb.length() > 0) udb = udb.substring(0, udb.length() - 4);
		}
		System.out.println(sb);
		br.close();
	}
}
