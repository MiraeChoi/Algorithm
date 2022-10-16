package k_backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class A1269_2 {
//	static int read() throws Exception {
//        int c, n = System.in.read() & 15;
//        boolean isNegative = n == 13;
//        if (isNegative) n = System.in.read() & 15;
//        while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
//        return isNegative ? ~n + 1 : n;
//    }
	
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Set<Integer> set = new HashSet<Integer>();
//		int N = read(), M = read();
		
		st = new StringTokenizer(br.readLine());
		while(N-- > 0) set.add(Integer.parseInt(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		while(M-- > 0) {
			int i = Integer.parseInt(st.nextToken());
			if(set.contains(i)) set.remove(i);
			else set.add(i);
		}
		System.out.println(set.size());
	}
}