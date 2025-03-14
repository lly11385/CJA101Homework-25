package hw2;

//• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

public class hw2_3 {
	public static void main(String[] arg) {
		int sum=1;
		int count=1;
		while (count<=10) {
			sum*=count;
			count++;
		}
		System.out.print(sum);
	}	
}
