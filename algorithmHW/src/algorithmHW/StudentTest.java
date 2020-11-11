//***************************
// 파일명: StudentTest
// 작성자: 201814037 박새별
// 작성일: 2020.03.30
// 내용: 학생정보 출력, 성적 평균 산출, 우수 학생 선발
//***************************

package algorithmHW;
import java.util.Scanner;

class Student {
	private String name;
	private int id;
	private double grade;
	public Student(String name, int id, double grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}



}

public class StudentTest {
	public static void main(String args[]) {


		System.out.println("hw3_1: 박새별 ");
		System.out.println();

		Scanner s = new Scanner(System.in);

		System.out.print("학생 수 입력: ");
		int n = s.nextInt();
		System.out.println();

		Student[] std = new Student[n];

		System.out.println(n + "명의 학생 정보를 입력하세요 : ");

		// 학생정보 입력
		for (int i = 0; i < std.length; i++) {
				String name = s.next();
				int id = s.nextInt();
				double score = s.nextDouble();

				std[i] = new Student(name, id, score);
		}

		s.close();
	}
}
