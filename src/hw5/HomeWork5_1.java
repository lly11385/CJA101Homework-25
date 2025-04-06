package hw5;
//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形

import java.util.Scanner;

public class HomeWork5_1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("請輸入長方形的寬度");
	        int width = sc.nextInt();
	        System.out.println("請輸入長方形的高度");
	        int height = sc.nextInt();
	        starSquare(width, height); // 呼叫starSquare方法
	        sc.close();
	        }
	 
	public static void starSquare(int width, int height) {
	        for (int i=0; i<height; i++) { // 外層控制列數(y軸高度)
	        	for (int j=0; j<width ; j++) { // 內層控制行數(x軸寬度)
					System.out.print("*");
				}
				System.out.println();
	        }

	 }
}
