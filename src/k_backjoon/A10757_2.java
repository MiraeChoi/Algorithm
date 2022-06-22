package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10757_2 {
    private static String solution(char[] a, char[] b){
        StringBuilder sb = new StringBuilder();
        int digit = 0;
        
        for(int i = a.length-1, j = b.length-1; i >= 0 || j >= 0; i--, j--) {
            if(i >= 0) digit += a[i] - '0';
            if(j >= 0) digit += b[j] - '0';
            sb.append(digit % 10);
            digit /= 10;
        }
        if(digit > 0) sb.append('1');
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] a = st.nextToken().toCharArray();
        char[] b = st.nextToken().toCharArray();

        System.out.println(solution(a, b));
    }
}
