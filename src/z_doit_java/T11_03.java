package z_doit_java;

class T11_03<K, V> {
	//버킷의 상태
	enum Status {OCCUPIED, EMPTY, DELETED};	//데이터 저장, 비어 있음, 삭제함
	
	//버킷
	static class Bucket<K, V> {
		private K key;			//키값
		private V data;			//데이터
		private Status stat;	//상태
		
		Bucket() {stat = Status.EMPTY;}
		
		void set(K key, V data, Status stat) {
			this.key = key;
			this.data = data;
			this.stat = stat;
		}
		
		void setStat(Status stat) {this.stat = stat;}	//상태 설정
		K getKey() {return key;}						//키값 반환
		V getValue() {return data;}						//데이터 반환
		public int hashCode() {return key.hashCode();}	//키의 해시값 반환
	}
	
	private int size;				//해시 테이블 크기
	private Bucket<K, V>[] table;	//해시 테이블
	
	public T11_03(int size) {
		try {
			table = new Bucket[size];
			for(int i = 0; i < size; i++) table[i] = new Bucket<K, V>();
			this.size = size;
		} catch (OutOfMemoryError e) {	//테이블 생성 불가
			this.size = 0;
		}
	}
	
	//해시 값을 구함
	public int hashValue(Object key) {return key.hashCode() % size;}
	//재해시 값을 구함
	public int rehashValue(int hash) {return (hash + 1) % size;}
	
	//키값 key를 갖는 버킷 검색
	private Bucket<K, V> searchNode(K key) {
		int hash = hashValue(key);		//검색할 데이터의 해시값
		Bucket<K, V> p = table[hash];	//선택 버킷
		
		for(int i = 0; p.stat != Status.EMPTY && i < size; i++) {
			if(p.stat == Status.OCCUPIED && p.getKey().equals(key)) return p;
			hash = rehashValue(hash);	//재해시
			p = table[hash];
		}
		return null;
	}
	
	//키값 key를 갖는 요소 검색(데이터 반환)
	public V search(K key) {
		Bucket<K, V> p = searchNode(key);
		if(p != null) return p.getValue();
		else return null;
	}
	
	//키값 key, 데이터 data를 갖는 요소 추가
	public int add(K key, V data) {
		if(search(key) != null) return 1;	//이미 등록된 키값
		
		int hash = hashValue(key);			//추가할 데이터의 해시값
		Bucket<K, V> p = table[hash];		//선택 버킷
		for(int i = 0; i < size; i++) {
			if(p.stat == Status.EMPTY || p.stat == Status.DELETED) {
				p.set(key, data, Status.OCCUPIED);
				return 0;
			}
			hash = rehashValue(hash);		//재해시
			p = table[hash];
		}
		return 2;							//해시 테이블이 가득 참
	}
	
	//키값 key를 갖는 요소 삭제
	public int remove(K key) {
		Bucket<K, V> p = searchNode(key);	//선택 버킷
		if(p == null) return 1;				//등록되지 않은 키값
		p.setStat(Status.DELETED);
		return 0;
	}
	
	//해시 테이블 출력
	public void dump() {
		for(int i = 0; i < size; i++) {
			System.out.printf("%02d ", i);
			switch(table[i].stat) {
			case OCCUPIED :
				System.out.printf("%s (%s)\n", table[i].getKey(), table[i].getValue());
				break;
			case EMPTY :
				System.out.println("-- 미등록 --");
				break;
			case DELETED :
				System.out.println("-- 삭제 완료 --");
				break;
			}
		}
	}
}
