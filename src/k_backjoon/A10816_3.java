package k_backjoon;

import java.io.IOException;

class A10816_3 {
    public static void main(String args[]) throws Exception {
        int n = readInt();
        System.out.println("n : " + n);
        int[] cnt = new int[20000001];
        for(int i = 0; i < n; i++) cnt[readInt() + 10000000]++;
        int m = readInt();
        System.out.println("m : " + m);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) sb.append(cnt[readInt() + 10000000]).append(' ');
        System.out.println(sb);
    }
    
    static int readInt() throws IOException {
        int n = 0;
        boolean isNegative = false;
        while(true) {
        	//input : ASKII code
            int input = System.in.read();
            if(input != 32 || input != 13) System.out.println("input : " + input);
            if(input <= 32) return isNegative ? n * -1 : n;
            else if(input == '-') isNegative = true;
            else n = (n << 3) + (n << 1) + (input & 15);
//            System.out.println("n : " + (n << 3) + "+" + (n << 1) + "+" + (input & 15));
        }
    }
}