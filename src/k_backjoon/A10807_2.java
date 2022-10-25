package k_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10807_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[201];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < N; i++) arr[Integer.parseInt(str[i]) + 100]++;
        System.out.println(arr[Integer.parseInt(br.readLine()) + 100]);
    }
}