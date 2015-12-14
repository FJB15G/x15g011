package jp.ac.chibafjb.x15g011.kd173;

import java.util.Scanner;

public class Uw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int k = 3; 
		int [] data = new int [k+1];
		Scanner sin = new Scanner(System.in);
		System.out.print("data[0] = ");
		int a = sin.nextInt();
		System.out.print("data[1] = ");
		int b = sin.nextInt();
		System.out.println("data[2] = ");
		int c = sin.nextInt();
		System.out.println("data[3] = ");
		int d = sin.nextInt();
		sin.close();
		data [0] = a;
		data [1] = b;
		data [2] = c;
		data [3] = d;
		
		int i;
		for(i=k;i>=1;i=i-1){
			data[i]=data[i-1];
		}
		for(i=0;i<=k;i++){
			System.out.println("data["+ i+"]="+ data[i]);
		}

	}

}
