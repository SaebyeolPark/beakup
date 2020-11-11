//***************************
// 파일명: MyHashtable
// 작성자: 201814037 박새별
// 작성일: 2020.05.14
// 내용: 해시테이블 삽입검색삭제출력 연산 체이닝 버전
//***************************
package algorithmHW;

public class MyHashtable {
	private int m;
	Node[] a;

	public MyHashtable(int size) {
		a = new Node[size];
		m = size;
	}

	public boolean put(int value) {
		a[hash(value)] = new Node(value, a[hash(value)]);
		return true;
	}

	public boolean remove(int value) {
		if (Node.contains(a[hash(value)], value)) {
			a[hash(value)] = Node.remove(a[hash(value)], value);
			return true;
		} else
			return false;
	}

	public boolean contains(int value) {
		return Node.contains(a[hash(value)], value);
	}

	public void print() {
		for (int i = 0; i < m; i++) {
			System.out.print("\n" + (i) + " : ");
			Node node = a[i];
			while (node != null) {
				System.out.print(node.value + " ");
				node = node.next;
			}
		}
	}

	private int hash(int x) {
		return x % m;
	}
}

class Node {
	int value;
	Node next;

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	static Node remove(Node node, int value) {
		if (node == null)
			return null;
		if (node.value == value)
			return node.next;
		node.next = remove(node.next, value);
		return node;
	}

	static boolean contains(Node node, int value) {
		if (node == null)
			return false;
		if (node.value == value)
			return true;
		return contains(node.next, value);
	}
}
