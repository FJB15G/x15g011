package jp.ac.chibafjb.x15g011.kd221;

public class ArrayProc {
	public int i;
	public int linerSearch1(int s[],int n){
		int i = 0;
		while(i<100&&s[i]!=n){
			i=i+1;
		}
		return(i);
	}
	
	public void output(int i){
		if(i==100){
			System.out.format("探索値%dは、配列score[]に存在しません。\n",i);
		}else{
			System.out.format("探索値%dは、配列score[%d]になります。\n",i,i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayProc a = new ArrayProc();
		int s [] = new int[100];
		for(int i=0;i<99;i++){
			s[i]=i;
		}
		s[99]=999;
		
		int z =a.linerSearch1(s,1000);
		
		a.output(z);


	}

}
