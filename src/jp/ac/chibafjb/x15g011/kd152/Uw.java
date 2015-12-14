package jp.ac.chibafjb.x15g011.kd152;

import java.util.Scanner;

public class Uw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		final double pi =3.14;
		System.out.print("半径r -->");
		double  r1 = sin.nextDouble();
		System.out.println();
		
		System.out.println("円周　= "+(2*pi*r1));
		System.out.println("面積　="+(pi*r1*r1));

	}

}
