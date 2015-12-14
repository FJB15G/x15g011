package jp.ac.chibafjb.x15g011.kd162;

public class Uw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] x;
		x = new int [5];
		x[0]= 33;
		x[1]= 18;
		x[2]=102;
		x[3]= 47;
		x[4]=  5;
		int sum = 0;
		
		
		int i;
		for(i=0;i<x.length;i++)
		{
			sum+=x[i];
		}
		System.out.println(sum);

	}

}
