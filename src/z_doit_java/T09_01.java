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
	private Node<E> head; //머리 노드
	private Node<E> crnt; //선택 노드
	
	public T09_01() {
		head = crnt = null;
	}
	
	//노드 검색
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head;
		
		while(ptr != null) {
			if(c.compare(obj, ptr.data) == 0) { //검색 성공
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next; //다음 노드 선택
		}
		return null; //검색 실패
	}
	
	//머리에 노드 삽입
	public void addFirst(E obj) {
		Node<E> ptr = head;	//삽입 전 머리 노드
		head = crnt = new Node<E>(obj, ptr);
	}
	
	//꼬리에 노드 삽입
	public void addLast(E obj) {
		if(head == null) addFirst(obj);
		else {
			Node<E> ptr = head;
			while(ptr.next != null) ptr = ptr.next;
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}
	
	
}
