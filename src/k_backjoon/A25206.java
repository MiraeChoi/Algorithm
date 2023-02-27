package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class A25206 {
	//맞았습니다!!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = 20;
		double cnt = 0;
		double total = 0;
		Map<String, Double> score = new HashMap<>();
		score.put("A+", 4.5);	score.put("A0", 4.0);
		score.put("B+", 3.5);	score.put("B0", 3.0);
		score.put("C+", 2.5);	score.put("C0", 2.0);
		score.put("D+", 1.5);	score.put("D0", 1.0);
		score.put("F", 0.0);
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			double credit = Float.parseFloat(st.nextToken());
			String grade = st.nextToken();
			if(!grade.equalsIgnoreCase("P")) {
				cnt += credit;
				total += (credit * score.get(grade));
			}
		}
		System.out.println(total / cnt);
	}
}