package co.micol.prj.test;
import java.util.Scanner;
public class ForTestMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ForTest fortest = new ForTest();
		System.out.print("ù��° ���� : ");
		fortest.setN(scn.nextInt());
		System.out.print("�ι�° ���� : ");
		fortest.setM(scn.nextInt());
		fortest.run();
	}
}
