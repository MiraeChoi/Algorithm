package z_doit_java;

class T11_01<K, V> {
	class Node<K, V> {
		private K key;				//Ű��
		private V data;				//������
		private Node<K, V> next;	//���� ��忡 ���� ����
		
		public Node(K key, V data, Node<K, V> next) {
			this.key = key;
			this.data = data;
			this.next = next;
		}
		
		K getKey() {return key;}
		V getValue() {return data;}
		public int hashCode() {return key.hashCode();}	//Ű�� �ؽð� ��ȯ
	}
	
	private int size;				//�ؽ� ���̺� ũ��
	private Node<K, V>[] table;		//�ؽ� ���̺�
	
	public T11_01(int capacity) {
		try {
			table = new Node[capacity];
			this.size = capacity;
		} catch (OutOfMemoryError e) {	//���̺��� ������ �� ����
			this.size = 0;
		}
	}
	
	//�ؽ� ���� ����
	public int hashValue(Object key) {
		return key.hashCode() % size;
	}
	
	//Ű�� key�� ���� ����� �˻�(�����͸� ��ȯ)
	public V search(K key) {
		int hash = hashValue(key);	//�˻��� �������� �ؽð�
		Node<K, V> p = table[hash];	//���� ���
		
		while(p != null) {
			if(p.getKey().equals(key)) return p.getValue();	//�˻� ����
			p = p.next;				//���� ���
		}
		return null;				//�˻� ����
	}
	
	//Ű�� key, ������ data�� ���� ����� �߰�
	public int add(K key, V data) {
		int hash = hashValue(key);	//�߰��� �������� �ؽð�
		Node<K, V> p = table[hash];	//���� ���
		
		while(p != null) {
			if(p.getKey().equals(key)) return 1;	//�̹� ��ϵ� Ű��
			p = p.next;				//���� ���
		}
		Node<K, V> tmp = new Node<K, V>(key, data, table[hash]);
		table[hash] = tmp;			//��� ����
		return 0;
	}
	
	//Ű�� key�� ���� ����� ����
	public int remove(K key) {
		int hash = hashValue(key);	//������ �������� �ؽð�
		Node<K, V> p = table[hash];	//���� ���
		Node<K, V> pp = null;		//�ٷ� ���� ���� ���
		
		while(p != null) {
			if(p.getKey().equals(key)) {	//Ű������ ��Ҹ� ã��
				if(pp == null) table[hash] = p.next;
				else pp.next = p.next;
				return 0;
			}
			pp = p;
			p = p.next;				//���� ���
		}
		return 1;					//Ű���� ����
	}
	
	//�ؽ� ���̺� ���
	public void dump() {
		for(int i = 0; i < size; i++) {
			Node<K, V> p = table[i];
			System.out.printf("%02d  ", i);
			while(p != null) {
				System.out.printf("�� %s. %s  ", p.getKey(), p.getValue());
				p = p.next;
			}
			System.out.println();
		}
	}
}
