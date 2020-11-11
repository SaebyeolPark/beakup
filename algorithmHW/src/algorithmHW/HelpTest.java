package algorithmHW;

import java.util.Scanner;

public class HelpTest {
	public static void main(String args[]) {

		Help c = new Help(4);

		System.out.println("입력 네개>> ");
		Scanner sc=new Scanner(System.in);
		int number=0;
		for(int i=0; i<4;i++) {
			number=sc.nextInt();
			c.put(number, i);
		}
		System.out.println();
		c.remove();

		c.print();

	}
}
