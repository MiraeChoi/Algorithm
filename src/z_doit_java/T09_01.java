package z_doit_java;

import java.util.Comparator;

class T09_01<E> {
	//Node
	class Node<E> {
		private E data;
		private Node<E> next;
		
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	private Node<E> head; //�Ӹ� ���
	private Node<E> crnt; //���� ���
	
	public T09_01() {
		head = crnt = null;
	}
	
	//��� �˻�
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head;
		
		while(ptr != null) {
			if(c.compare(obj, ptr.data) == 0) { //�˻� ����
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next; //���� ��� ����
		}
		return null; //�˻� ����
	}
	
	//�Ӹ��� ��� ����
	public void addFirst(E obj) {
		Node<E> ptr = head;	//���� �� �Ӹ� ���
		head = crnt = new Node<E>(obj, ptr);
	}
	
	//������ ��� ����
	public void addLast(E obj) {
		if(head == null) addFirst(obj);
		else {
			Node<E> ptr = head;
			while(ptr.next != null) ptr = ptr.next;
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}
	
	//�Ӹ� ��带 ����
	public void removeFirst() {
		if(head != null) head = crnt = head.next;
	}
	
	//���� ��带 ����
	public void removeLast() {
		if(head != null) {						 //��尡 �ϳ��� ������
			if(head.next == null) removeFirst(); //�Ӹ� ��� ����
			else {
				Node<E> ptr = head;				 //��ĵ ���� ���
				Node<E> pre = head;				 //��ĵ ���� ����� ���� ���
				
				while(ptr.next != null) {
					pre = ptr;
					ptr = ptr.next;
				}
				pre.next = null;				 //pre : ���� ���� ���� ���
				crnt = pre;
			}
		}
	}
	
	//��� p ����
	public void remove(Node p) {
		if(head != null) {
			if(p == head) removeFirst();
			else {
				Node<E> ptr = head;
				
				while(ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) return;		 //p�� ����Ʈ�� ����
				}
				ptr.next = p.next;
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
		while(head != null) removeFirst();
		crnt = null;
	}
	
	//���� ��带 �ϳ� �������� �̵�
	public boolean next() {
		if(crnt == null || crnt.next == null) return false;	//�̵��� �� ����
		crnt = crnt.next;
		return true;
	}
	
	//���� ��带 ���
	public void printCurrentNode() {
		if(crnt == null) System.out.println("������ ��尡 �����ϴ�.");
		else System.out.println(crnt.data);
	}
	
	//��� ��带 ���
	public void dump() {
		Node<E> ptr = head;
		
		while(ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}
