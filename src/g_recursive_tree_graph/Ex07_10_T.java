package g_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class Node710T {
	int data;
	Node710T lt, rt;
	
	public Node710T(int val) {
		data = val;
		lt = rt = null;
	}
}

class Ex07_10_T {
	//����
	//�Ʒ� �׸��� ���� ����Ʈ������ ��Ʈ ��� 1���� ���� �������� ���� �� ���� ª�� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���.
	//�� ����� ���̴� ��Ʈ ��忡�� ���� ������ ���µ� �̵��ϴ� Ƚ��, �� ����(����)�� ������ ���̷� �ϰڽ��ϴ�.
	//         1
	//     2       3
	//   4   5
	//���� ª�� ���̴� 3�� �������� ������ 1�̴�.
	Node710T root;
	
	public int BFS(Node710T node) {
		Queue<Node710T> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				Node710T cur = Q.poll();
				
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.add(cur.rt);
			}
			L++;
		}	
		return L;
	}
	
	public static void main(String[] args) {
		Ex07_10_T tree = new Ex07_10_T();
		tree.root = new Node710T(1);
		tree.root.lt = new Node710T(2);
		tree.root.rt = new Node710T(3);
		tree.root.lt.lt = new Node710T(4);
		tree.root.lt.rt = new Node710T(5);
		System.out.println(tree.BFS(tree.root));
	}
}
