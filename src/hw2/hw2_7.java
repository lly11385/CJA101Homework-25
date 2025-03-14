package hw2;

public class hw2_7 {
	public static void  main(String[] args) {
		for (int i= 1; i <=6; i++) {
		// 外層迴圈控制行數，從 1 到 6
			for(int j =1; j<=i; j++) {  //內層次數跟著外層i走
				System.out.print((char)(64 + i));
				// 輸出對應的字母，'A' 的 ASCII 值是 65，利用 i 加上 64 來獲得相應字母
			}
			System.out.println();  //換行
		}
	}
}