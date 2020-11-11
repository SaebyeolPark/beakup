//***************************
// 파일명: MyHashtableTest
// 작성자: 201814037 박새별
// 작성일: 2020.05.06
// 내용: 해시테이블 메인클래스
//***************************
package algorithmHW;

import java.util.Scanner;

public class MyHashtableTest {

	public static void main(String args[]) {
		System.out.println("hw7_2: 박새별");

		Scanner sc = new Scanner(System.in);
		System.out.print("해시테이블 크기 입력: ");
		int size = sc.nextInt();

		MyHashtable studentTable = new MyHashtable(size);
		int menu = 0;

		do {
			System.out.println("\n1:삽입 2:검색 3:삭제 4:테이블출력 5:종료 ->");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("삽입할 학번(정수값)을 입력하세요: ");
				int id = sc.nextInt();
				if (studentTable.put(id))
					System.out.println(id + " 삽입성공");
				else
					System.out.println(id + " 삽입실패");
				break;
			case 2:
				System.out.println("검색할 학번(정수값)을 입력하세요: ");
				id = sc.nextInt();
				if (studentTable.contains(id))
					System.out.println(id + " 학생을 찾았습니다.");
				else
					System.out.println(id + " 학생을 찾을 수 없습니다.");
				break;
			case 3:
				System.out.println("삭제할 학번(정수값)을 입력하세요: ");
				id = sc.nextInt();
				if (studentTable.remove(id))
					System.out.println(id + " 삭제성공");
				else
					System.out.println(id + " 삭제실패");
				break;
			case 4:
				studentTable.print();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호가 잘못되었습니다. 다시 입력하세요.");

			}
		} while (menu != 5);

		sc.close();
	}
}
