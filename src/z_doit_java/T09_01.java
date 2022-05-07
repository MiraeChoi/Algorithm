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
	
	
}
