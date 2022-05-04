package z_doit_java;

class T07_01 {
	private int max;
	private int num;
	private int[] set;
	
	public T07_01(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];	//집합 배열 생성
		} catch (OutOfMemoryError e) {
			max = 0;			//배열 생성 실패
		}
	}
	
	//집합 최대 개수
	public int capacity() {
		return max;
	}
	
	//집합의 요소 개수
	public int size() {
		return num;
	}
	
	//집합에서 n 검색하고 인덱스 반환
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			if(set[i] == n) return i;	//검색 성공
		}
		return -1;						//검색 실패
	}
	
	//집합에 n이 있는지 확인
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}
	
	//집합에 n 추가
	public boolean add(int n) {
		if(num >= max || contains(n)) return false;
		else {
			set[num++] = n;
			return true;
		}
	}
	
	//집합에서 n 삭제
	public boolean remove(int n) {
		int idx;
		if(num <= 0 || (idx = indexOf(n)) == -1) return false;
		else {
			set[idx] = set[--num];
			return true;
		}
	}
	
	//집합 s에 복사
	public void copyTo(T07_01 s) {
		int n = (s.max < num) ? s.max : num;
		for(int i = 0; i < n; i++) s.set[i] = set[i];
		s.num = n;
	}
	
	//집합 s를 복사
	public void copyFrom(T07_01 s) {
		int n = (max < s.num) ? max : s.num;
		for(int i = 0; i < n; i++) set[i] = s.set[i];
		num = n;
	}
	
	//집합 s와 같은지 확인
	public boolean equalTo(T07_01 s) {
		if(num != s.num) return false;		//요소 개수가 같지 않으면 집합도 같지 않음
		
		for(int i = 0; i < num; i++) {
			int j = 0;
			for( ; j < s.num; j++) {
				if(set[i] == s.set[i]) break;
			}
			if(j == s.num) return false;	//set[i]는 s에 포함되지 않음
		}
		return true;
	}
	
	//집합 s1과 s2의 합집합 복사
	public void unionOf(T07_01 s1, T07_01 s2) {
		copyFrom(s1);									//집합 s1 복사
		for(int i = 0; i < s2.num; i++) add(s2.set[i]);	//집합 s2 요소 추가
	}
	
	//문자열로 표현을 바꿈
	public String toString() {
		StringBuffer tmp = new StringBuffer("{ ");
		for(int i = 0; i < num; i++) tmp.append(set[i] + " ");
		tmp.append("}");
		return tmp.toString();
	}
}
