// 파일명: my binary search tree
// 작성자: 박새별
// 작성일: 0430
// 내용: 이진검색트리
package algorithmHW;

public class MyBinarySearchTree {
	int value;
	MyBinarySearchTree left;
	MyBinarySearchTree right;

	public MyBinarySearchTree(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public boolean add(int value) {
		if (value < this.value) {
			if (left == null)
				left = new MyBinarySearchTree(value);
			else
				left.add(value);
			return true;
		} else if (value > this.value) {
			if (right == null)
				right = new MyBinarySearchTree(value);
			else
				right.add(value);
			return true;
		} else
			return false;

	}

	public void size() {
	}

	public void print() {
		inorder();
	}

	public boolean contains(int value) {
		if (value < this.value)
			return left != null && left.contains(value);
		else if (value > this.value)
			return right != null && right.contains(value);
		else return true;
	}

	public int getLeftMostValue() {
		if (this.left != null)
			return this.left.getLeftMostValue();
		return this.value;
	}

	public boolean remove(int value, MyBinarySearchTree parent) {
		if (value < this.value) {
			if (left != null) {
				left.remove(value, this);
				return true;
			}
		} else if (value > this.value) {
			if (right != null) {
				right.remove(value, this);
				return true;
			}
		} else {
			if (left != null && right != null) {
				int temp = right.getLeftMostValue();
				this.value = temp;
				right.remove(temp, this);
			} else {
				MyBinarySearchTree child = (left != null) ? left : right;
				if (parent.left == this)
					parent.left = child;
				else
					parent.right = child;
			}
			return true;
		}
		return false;
	}

	private void inorder() {
		if (left != null)
			left.inorder();
		System.out.printf("%d ", value);
		System.out.println();
		if (right != null)
			right.inorder();
	}

}
