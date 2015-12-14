package jp.ac.chibafjb.x15g011.kd211;



public class ArrayProc {
	public int m;
	public int i;
	public int maxFind1(int num[],int a){
		i=0;
		m=0;
		for(i=0;i<a;i++){
			if(num[i]>m){
				m=num[i];
			}
			
		}
		return(m);
}



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] num = {10,100,50,20,30};
		ArrayProc z = new ArrayProc();
		int ans = z.maxFind1(num,5);
		System.out.println(ans);
		

	}

}
