package jp.ac.chibafjb.x15g011.kd153;

import java.util.Scanner;

public class Uw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		final double pi =3.14;
		System.out.print("半径r -->");
		double  r = sin.nextDouble();
		System.out.println();
		
		System.out.print("円周　= ");
		System.out.println(Math.ceil(2*pi*r*10)/10);
		System.out.print("面積　=");
		System.out.println(Math.floor(pi*r*r*10)/10);

	}

}
