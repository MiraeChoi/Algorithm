package z_doit_java;

class T07_01 {
	private int max;
	private int num;
	private int[] set;
	
	public T07_01(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];	//���� �迭 ����
		} catch (OutOfMemoryError e) {
			max = 0;			//�迭 ���� ����
		}
	}
	
	//���� �ִ� ����
	public int capacity() {
		return max;
	}
	
	//������ ��� ����
	public int size() {
		return num;
	}
	
	//���տ��� n �˻��ϰ� �ε��� ��ȯ
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			if(set[i] == n) return i;	//�˻� ����
		}
		return -1;						//�˻� ����
	}
	
	//���տ� n�� �ִ��� Ȯ��
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}
	
	//���տ� n �߰�
	public boolean add(int n) {
		if(num >= max || contains(n)) return false;
		else {
			set[num++] = n;
			return true;
		}
	}
	
	//���տ��� n ����
	public boolean remove(int n) {
		int idx;
		if(num <= 0 || (idx = indexOf(n)) == -1) return false;
		else {
			set[idx] = set[--num];
			return true;
		}
	}
	
	//���� s�� ����
	public void copyTo(T07_01 s) {
		int n = (s.max < num) ? s.max : num;
		for(int i = 0; i < n; i++) s.set[i] = set[i];
		s.num = n;
	}
	
	//���� s�� ����
	public void copyFrom(T07_01 s) {
		int n = (max < s.num) ? max : s.num;
		for(int i = 0; i < n; i++) set[i] = s.set[i];
		num = n;
	}
	
	//���� s�� ������ Ȯ��
	public boolean equalTo(T07_01 s) {
		if(num != s.num) return false;		//��� ������ ���� ������ ���յ� ���� ����
		
		for(int i = 0; i < num; i++) {
			int j = 0;
			for( ; j < s.num; j++) {
				if(set[i] == s.set[i]) break;
			}
			if(j == s.num) return false;	//set[i]�� s�� ���Ե��� ����
		}
		return true;
	}
	
	//���� s1�� s2�� ������ ����
	public void unionOf(T07_01 s1, T07_01 s2) {
		copyFrom(s1);									//���� s1 ����
		for(int i = 0; i < s2.num; i++) add(s2.set[i]);	//���� s2 ��� �߰�
	}
	
	//���ڿ��� ǥ���� �ٲ�
	public String toString() {
		StringBuffer tmp = new StringBuffer("{ ");
		for(int i = 0; i < num; i++) tmp.append(set[i] + " ");
		tmp.append("}");
		return tmp.toString();
	}
}
