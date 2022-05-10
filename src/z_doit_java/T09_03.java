package z_doit_java;

import java.util.Comparator;

class T09_03<E> {
	class Node<E> {
		private E data;		//������
		private int next;	//����Ʈ�� ���� ������
		private int dnext;	//free ����Ʈ�� ���� ������
		
		//data�� next ����
		void set(E data, int next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E>[] n;				//����Ʈ ��ü
	private int size;					//����Ʈ�� �뷮(���� ū ������ ��)
	private int max;					//��� ���� ���� record
	private int head;					//�Ӹ� ���
	private int crnt;					//���� ���
	private int deleted;				//free ����Ʈ�� �Ӹ� ���
	private static final int NULL = -1;	//���� ��� ���� / ����Ʈ�� ���� ��
	
	public T09_03(int capacity) {
		head = crnt = max = deleted = NULL;
		try {
			n = new Node[capacity];
			for(int i = 0; i < capacity; i++) n[i] = new Node<E>();
			size = capacity;
		} catch (OutOfMemoryError e) {
			size = 0;
		}
	}
	
	//������ �����ϴ� record�� �ε����� ����
	private int getInsertIndex() {
		if(deleted == NULL) {				//������ record�� ����
			if(max < size) return ++max;	//�� record ���
			else return NULL;				//�뷮 over(��ħ)
		} else {
			int rec = deleted;				//free ����Ʈ����
			deleted = n[rec].dnext;			//�Ӹ� rec�� ����
			return rec;
		}
	}
	
	//record idx�� free ����Ʈ�� ���
	private void deleteIndex(int idx) {
		if(deleted == NULL) {				//������ record�� ����
			deleted = idx;					//idx�� free ����Ʈ��
			n[idx].dnext = NULL;			//�Ӹ��� ���
		} else {
			int rec = deleted;				//idx�� free ����Ʈ��
			deleted = idx;					//�Ӹ��� ����
			n[rec].dnext = rec;
		}
	}
	
	//��� �˻�
	public E search(E obj, Comparator<? super E> c) {
		int ptr = head;
		
		while(ptr != NULL) {
			if(c.compare(obj, n[ptr].data) == 0) {
				crnt = ptr;
				return n[ptr].data;	//�˻� ����
			}
			ptr = n[ptr].next;		//���� ��忡 �ָ�
		}
		return null;				//�˻� ����
	}
	
	//�Ӹ��� ��� ����
	public void addFirst(E obj) {
		int ptr = head;				//���� ���� �Ӹ� ���
		int rec = getInsertIndex();
		if(rec != NULL) {
			head = crnt = rec;		//�ε��� rec�� record�� ����
			n[head].set(obj, ptr);
		}
	}
	
	//������ ��� ����
	public void addLast(E obj) {
		if(head == NULL) addFirst(obj);
		else {
			int ptr = head;
			while(n[ptr].next != NULL) {
				ptr = n[ptr].next;
			}
			int rec = getInsertIndex();
			if(rec != NULL) {	//�ε��� rec�� record�� ����
				n[ptr].next = crnt = rec;
				n[rec].set(obj, NULL);
			}
		}
	}
	
	//�Ӹ� ��� ����
	public void removeFirst() {
		if(head != NULL) {			//����Ʈ�� ��� ���� ������
			int ptr = n[head].next;
			deleteIndex(head);
			head = crnt = ptr;
		}
	}
	
	//���� ��� ����
	public void removeLast() {
		if(head != NULL) {
			if(n[head].next == NULL) removeFirst();	//��尡 �ϳ��� ������ �Ӹ� ��� ����
			else {
				int ptr = head;						//��ĵ ���� ���
				int pre = head;						//��ĵ ���� ����� ���� ���
				
				while(n[ptr].next != NULL) {
					pre = ptr;
					ptr = n[ptr].next;
				}
				n[pre].next = NULL;					//pre = ���� �� ���� ���
				deleteIndex(pre);
				crnt = pre;
			}
		}
	}
	
	//record p ����
	public void remove(int p) {
		if(head != NULL) {
			if(p == head) removeFirst();
			else {
				int ptr = head;
				
				while(n[ptr].next != p) {
					ptr = n[ptr].next;
					if(ptr == NULL) return;			//p�� ����Ʈ�� ����
				}
				n[ptr].next = NULL;
				deleteIndex(ptr);
				n[ptr].next = n[p].next;
				crnt = ptr;
			}
		}
	}
	
	//���� ��� ����
	public void removeCurrentNode() {
		remove(crnt);
	}
	
	//��� ��� ����
	public void clear() {
		while(head != NULL) removeFirst();			//�� �� ������ �Ӹ� ��� ����
		crnt = NULL;
	}
	
	//���� ��带 �ϳ� �������� �̵�
	public boolean next() {
		if(crnt == NULL || n[crnt].next == NULL) return false;	//�̵��� �� ����
		crnt = n[crnt].next;
		return true;
	}
	
	//���� ��� ���
	public void printCurrentNode() {
		if(crnt == NULL) System.out.println("���� ��尡 �����ϴ�.");
		else System.out.println(n[crnt].data);
	}
	
	//��� ��� ���
	public void dump() {
		int ptr = head;
		
		while(ptr != NULL) {
			System.out.println(n[ptr].data);
			ptr = n[ptr].next;
		}
	}
}
