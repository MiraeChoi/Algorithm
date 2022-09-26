package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class A1620_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n + 1];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            String name = br.readLine();
            arr[i] = name;
            map.put(name, i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            char head = str.charAt(0);
            if('0' <= head && head <= '9') sb.append(arr[Integer.parseInt(str)]).append('\n');
            else sb.append(map.get(str)).append('\n');
        }
        System.out.println(sb);
    }
}