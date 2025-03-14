package hw2;

public class hw2_6 {
	public static void  main(String[] args) {
		for (int i= 10; i >=1; i--) {
			for(int j =1; j <= i; j++) {  //內層次數跟著外層i走
				System.out.print(j+"");
				
			}
			System.out.println();  //換行
		}
	}
}
