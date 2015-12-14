package jp.ac.chibafjb.x15g011.kd164;

public class Uw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m = 3;
		int [] a = new int [m];
		a[0]= 5;
		a[1]=10;
		a[2]=15;
		int [] b = new int [m];
		b[0]=0;
		b[1]=0;
		b[2]=0;
		
		int i;
		for(i=0;i<m;i=i+1){
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}

}

