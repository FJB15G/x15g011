package jp.ac.chibafjb.x15g011.kd171;

public class Uw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int k = 3; 
		int [] data = new int [k+1];
		data [0] = 100;
		data [1] = 200;
		data [2] = 300;
		data [3] =   0;
		
		int i;
		for(i=k;i>=1;i=i-1){
			data[i]=data[i-1];
		}
		for(i=0;i<=k;i++){
			System.out.println("data["+ i+"]="+ data[i]);
		}

	}

}
