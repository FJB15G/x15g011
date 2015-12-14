package jp.ac.chibafjb.x15g011.kd172;

public class Uw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m = 3;
		int n = 2;
		int [] x ={1,2,3};
		int [] y ={7,8};
		int [] z = new int [m+n];
		
		int i;
		for(i=0;i<m;i++){
			z[i]=x[i];
		}
		for(i=m;i<m+n;i++){
			z[i]=y[i-m];
		}
		System.out.print("Z[] ={");
		for(i=0;i<m+n-1;i++){
			System.out.print(z[i]+",");
		}
		System.out.print(z[i]+"}");


	}

}
