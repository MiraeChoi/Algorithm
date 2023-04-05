package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

class A7785_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new TreeSet<>();
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			String EorL = st.nextToken();
			if(EorL.equalsIgnoreCase("enter")) set.add(name);
			else set.remove(name);
		}
		StringBuilder sb = new StringBuilder();
		for(Iterator<String> it = ((TreeSet<String>)set).descendingIterator(); it.hasNext();) {
			sb.append(it.next()).append('\n');
		}
		System.out.println(sb);
	}
}