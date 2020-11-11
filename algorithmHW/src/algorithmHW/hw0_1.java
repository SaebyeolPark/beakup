package algorithmHW;

import java.util.Scanner;

public class hw0_1 {
	public static void main(String[] args) {
		int[] List = { -30, -15, 1, 40, 50, 200, 315, 800, 9000, 12345 };
		int[] minList = new int[List.length];
		int min = Byte.MAX_VALUE;

		Scanner sc = new Scanner(System.in);
		System.out.println("hw0_1 : 박새별");
		System.out.println("숫자 맞히기 게임입니다.");
		System.out.print("정수를 입력하세요 : ");

		int guess = sc.nextInt();

		// guess-list[i]
		for (int i = 0; i < List.length; i++) {
			minList[i] = guess-List[i];
			if (minList[i] < 0) {
				minList[i] = minList[i] * (-1);
			}
		}

		// ���� ���� �� min ã��
		for (int i = 0; i < minList.length; i++) {
			if (minList[i] < min) {
				min = minList[i];
			}
		}

		System.out.print("점수 = ");
		// min�� 100�̻��̶�� 0���, �׷��� �ʴٸ� 100-min
		if (min >= 100) {
			System.out.println("0");
		} else {
			System.out.println(100-min);
		}
		sc.close();
	}
}
