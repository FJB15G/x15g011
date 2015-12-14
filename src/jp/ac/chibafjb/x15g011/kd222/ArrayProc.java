package jp.ac.chibafjb.x15g011.kd222;


public class ArrayProc {
	public double i;
	public int linerSearch1(double s[],double n){
		int i = 0;
		while(i<100&&s[i]!=n){
			i=i+1;
		}
		return(i);
	}
	
	public void output(int i,double n){
		if(i==100){
			System.out.format("探索値%fは、配列score[]に存在しません。\n",n);
		}else{
			System.out.format("探索値%fは、配列score[%d]になります。\n",n,i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayProc a = new ArrayProc();
		double  s [] = new double[100];
		for(int i=0;i<98;i++){
			s[i]=i;
		}
		s[98]=6.1;
		s[99]=999;
		
		int z =a.linerSearch1(s,6.1);
		
		a.output(z,6.1);


	}

}
