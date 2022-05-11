package z_doit_java;

import java.util.Comparator;

class T10_01_P1P2<K, V> {
	static class Node<K, V> {
		private K key;				//키값
		private V data;				//데이터
		private Node<K, V> left;	//왼쪽 자식 노드
		private Node<K, V> right;	//오른쪽 자식 노드
		
		Node(K key, V data, Node<K, V> left, Node<K, V> right) {
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		K getKey() {return key;}	//키값 반환
		V getValue() {return data;}	//데이터 반환
		void print() {System.out.println(data);}
	}
	private Node<K, V> root;							//루트
	private Comparator<? super K> comparator = null;	//비교자
	
	public T10_01_P1P2() {root = null;}						//자연 순서에 따라 키값 비교
	public T10_01_P1P2(Comparator<? super K> c) {			//비교자로 키값 비교
		this();
		comparator = c;
	}
	
	//두 키값 비교
	private int comp(K key1, K key2) {
		return comparator == null ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1, key2);
	}
	
	//키값으로 검색
	public V search(K key) {
		Node<K, V> p = root;
		
		while(true) {
			if(p == null) return null;			//검색 실패
			int con = comp(key, p.getKey());	//key와 노드 p의 키값 비교
			if(con == 0) return p.getValue();	//검색 성공
			else if(con < 0) p = p.left;		//key가 더 작으면 왼쪽 서브 트리에서 검색
			else p = p.right;					//key가 더 크면 오른쪽 서브 트리에서 검색
		}
	}
	
	//노드를 루트로 하는 서브 트리에 노드 <K, V>를 삽입
	private void addNode(Node<K, V> node, K key, V data) {
		int con = comp(key, node.getKey());			//이진검색트리에 key가 이미 있음
		if(con == 0) return;
		else if(con < 0) {
			if(node.left == null) node.left = new Node<K, V>(key, data, null, null);
			else addNode(node.left, key, data);		//왼쪽 서브 트리에 주목
		} else {
			if(node.right == null) node.right = new Node<K, V>(key, data, null, null);
			else addNode(node.right, key, data);	//오른쪽 서브 트리에 주목
		}
	}
	
	//노드 삽입
	public void add(K key, V data) {
		if(root == null) root = new Node<K, V>(key, data, null, null);
		else addNode(root, key, data);
	}
	
	//키값이 key인 노드 삭제
	public boolean remove(K key) {
		Node<K, V> p = root;
		Node<K, V> parent = null;
		boolean isLeftChild = true;
		
		while(true) {
			if(p == null) return false;					//키값이 없음
			int con = comp(key, p.getKey());			//key와 노드 p의 키값 비교
			if(con == 0) break;							//같으면 검색 성공
			else {
				parent = p;								//가지로 내려가기 전에 부모 설정
				if(con < 0) {							//key가 더 작으면
					isLeftChild = true;					//왼쪽 자식으로 내려감
					p = p.left;							//왼쪽 서브 트리에서 검색
				} else {								//key가 더 크면
					isLeftChild = false;				//오른쪽 자식으로 내려감
					p = p.right;						//오른쪽 서브 트리에서 검색
				}
			}
		}
		
		if(p.left == null) {							//p에 왼쪽 자식이 없음
			if(p == root) root = p.right;
			else if(isLeftChild) parent.left = p.right;
			else parent.right = p.right;
		} else if(p.right == null) {					//p에 오른쪽 자식이 없음
			if(p == root) root = p.left;
			else if(isLeftChild) parent.left = p.left;
			else parent.right = p.right;
		} else {										//p에 자식 노드가 2개
			parent = p;
			Node<K, V> left = p.left;					//서브 트리 중 가장 큰 노드
			isLeftChild = true;
			
			while(left.right != null) {					//가장 큰 노드 left 검색
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key = left.key;							//left의 키값을 p로 옮김
			p.data = left.data;							//left의 데이터를 p로 옮김
			if(isLeftChild) parent.left = left.left;	//left 삭제
			else parent.right = left.left;				//left 삭제
		}
		return true;
	}
	
	//노드를 루트로 하는 서브 트리의 노드를 키값의 오름차순으로 출력
	private void printSubTree(Node node) {
		if(node != null) {
			printSubTree(node.left);						//왼쪽 서브 트리를 키값의 오름차순으로 출력
			System.out.println(node.key + " " + node.data);	//노드 출력
			printSubTree(node.right);						//오른쪽 서브 트리를 키값의 오름차순으로 출력
		}
	}
	
	//모든 노드를 키값의 오름차순으로 출력
	public void print() {
		printSubTree(root);
	}
	
	
	//--------------P1
	//노드를 루트로 하는 서브 트리의 노드를 키값의 내림차순으로 출력
	private void printSubTreeRev(Node node) {
		if (node != null) {
			printSubTreeRev(node.right);					//오른쪽 서브 트리를 키값의 오름차순으로 출력
			System.out.println(node.key + " " + node.data);	//노드 출력
			printSubTreeRev(node.left); 					//왼쪽 서브 트리를 키값의 오름차순으로 출력
		}
	}

	//모든 노드를 키값의 내림차순으로 출력
	public void printReverse() {
		printSubTreeRev(root);
	}
	
	
	//--------------P2
	//가장 작은 키값을 갖는 노드 반환
	private Node<K, V> getMinNode() {
		if (root == null) return null;
		else {
			Node<K, V> p = root;
			while (p.left != null) p = p.left;
			return p;
		}
	}

	//가장 큰 키값을 갖는 노드 반환
	private Node<K, V> getMaxNode() {
		if (root == null) return null;
		else {
			Node<K, V> p = root;
			while (p.right != null) p = p.right;
			return p;
		}
	}

	//가장 작은 키값 반환
	public K getMinKey() {
		Node<K, V> minNode = getMinNode();
		return minNode == null ? null : minNode.getKey();
	}

	//가장 작은 키값을 갖는 노드의 데이터 반환
	public V getDataWithMinKey() {
		Node<K, V> minNode = getMinNode();
		return minNode == null ? null : minNode.getValue();
	}

	//가장 큰 키값 반환
	public K getMaxKey() {
		Node<K, V> maxNode = getMaxNode();
		return maxNode == null ? null : maxNode.getKey();
	}

	//가장 큰 키값을 갖는 노드의 데이터 반환
	public V getDataWithMaxKey() {
		Node<K, V> maxNode = getMaxNode();
		return maxNode == null ? null : maxNode.getValue();
	}
}
