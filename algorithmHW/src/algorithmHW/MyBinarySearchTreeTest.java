// 파일명: my binary search tree test
// 작성자: 박새별
// 작성일: 0430
// 내용: 이진검색트리
package algorithmHW;

import java.util.Scanner;

public class MyBinarySearchTreeTest {
	public static void main(String[] args) {
		int id = 0;
		MyBinarySearchTree bst = new MyBinarySearchTree(0);
		Scanner sc = new Scanner(System.in);
		boolean select = true;
		System.out.println("hw6_1: 박새별");

		while (select) {
			System.out.println("1:삽입 2:검색 3:삭제 4:전체조회 5:종료");
			int selectNumber = sc.nextInt();
			if (selectNumber == 1) {
				System.out.println("삽입할 숫자를 입력하세요.");
				id = sc.nextInt();
				bst.add(id);
				if (bst.add(id))
					System.out.println("삽입 성공했습니다.");
				else
					System.out.println("삽입 실패했습니다.");
			} else if (selectNumber == 2) {
				System.out.println("검색할 숫자를 입력하세요.");
				id = sc.nextInt();
				bst.contains(id);
				if (bst.contains(id))
					System.out.println("트리에 존재합니다.");
				else
					System.out.println("트리에 존재하지 않습니다.");
			} else if (selectNumber == 3) {


			} else if (selectNumber == 4) {
				bst.print();

			} else if (selectNumber == 5)
				select = false;
		}

		System.out.println();
	}

}
