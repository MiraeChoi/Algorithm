package z_doit_java;

import java.util.Scanner;

class T08_04 {
	static int bmMatch(String txt, String pat) {
		int pt;
		int pp;
		int[] skip = new int[Character.MAX_VALUE + 1];	//�ǳʶٱ� ǥ
		
		//�ǳʶٱ� ǥ �����
		for(pt = 0; pt <= Character.MAX_VALUE; pt++) skip[pt] = pat.length();
		for(pt = 0; pt < pat.length()-1; pt++) skip[pat.charAt(pt)] = pat.length()-pt-1;
		
		//�˻�
		while(pt < txt.length()) {
			pp = pat.length()-1;
			
			while(txt.charAt(pt) == pat.charAt(pp)) {
				if(pp == 0) return pt;	//�˻� ����
				pp--; pt--;
			}
			pt += (skip[txt.charAt(pt)] > pat.length()-pp) ? skip[txt.charAt(pt)] : pat.length()-pp;
		}
		return -1;	//�˻� ����
	}
	
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("�ؽ�Ʈ : ");
        String s1 = kb.next();
        System.out.print("���� : ");
        String s2 = kb.next();

        int idx = bmMatch(s1, s2);

        if (idx == -1) System.out.println("�ؽ�Ʈ �ȿ� ������ �����ϴ�.");
        else {
            //��ġ�ϴ� ���� �ٷ� �ձ��� �ݰ�(1����Ʈ)������ ������ ����
            int len = 0;
            for (int i = 0; i < idx; i++)
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();

            System.out.println((idx + 1) + "��° ���ں��� ��ġ�մϴ�.");
            System.out.println("�ؽ�Ʈ : " + s1);
            System.out.printf(String.format("���� : %%%ds\n", len), s2);
        }
    }
}
