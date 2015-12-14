package jp.ac.chibafjb.x15g011.kd161;

public class Uw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] a = new int [2];
		a [0] =10;
		a [1] =20;
		int work = a[1];
		a[1] =a[0];
		a[0]=work;
		
		int i;
		for(i=0;i<a.length;i++)
		
		System.out.println(a[i]);

	}

}
