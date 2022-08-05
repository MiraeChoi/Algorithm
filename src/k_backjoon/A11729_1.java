package k_backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class A11729_1 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    static void hanoi(int n, int s, int e) throws IOException {
        if(n == 0) return;				//n=3, s=1, e=3		n=2, s=1, e=2		n=1, s=1, e=3			n=2, s=1, e=2	n=1, s=3, e=2			n=3, s=1, e=3	n=2, s=2, e=3	n=1, s=2, e=1		n=2, s=2, e=3	n=1, s=1, e=3
        hanoi(n-1, s, 6-s-e);			//hanoi(2, 1, 2);	hanoi(1, 1, 3);		hanoi(0, 1, 2) -> r						hanoi(0, 3, 1) -> r						hanoi(1, 2, 1)	hanoi(0, ... -> r					hanoi(0 -> r
        bw.write(s + " " + e + "\n");	//										бс write(1 3)			бс write(1 2)	бс write(3 2)			бс write(1 3)					бс write(2 1)		бс write(2 3)	бс write(1 3)
        hanoi(n-1, 6-s-e, e);			//										hanoi(0, 2, 3) -> r		hanoi(1, 3, 2)	hanoi(0, ... -> r		hanoi(2, 2, 3)					hanoi(0, ... -> r	hanoi(1, 1, 3)	hanoi(0 -> r
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		bw.write((int)(Math.pow(2, n)-1) + "\n");
		hanoi(n, 1, 3);
		bw.flush();
		bw.close();
		br.close();
	}
}
