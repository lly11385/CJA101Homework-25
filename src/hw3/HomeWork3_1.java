package hw3;
//使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形。

import java.util.Scanner;

public class HomeWork3_1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // 輸入三個邊長
	        System.out.print("請輸入第一個數字: ");
	        int a = sc.nextInt();
	        System.out.print("請輸入第二個數字: ");
	        int b = sc.nextInt();
	        System.out.print("請輸入第三個數字: ");
	        int c = sc.nextInt();
	        
            // 檢查是否為三角形 (三角形不等式: 任兩邊之和大於第三邊)
	        if (a + b > c && a + c > b && b + c > a) {
	            if (a == b && b == c) {
	                System.out.println("正三角形");
	            } else if (a == b || a == c || b == c) {
	                System.out.println("等腰三角形");
	            } else {
	                System.out.println("其他三角形");
	            }
	        } else {
	            System.out.println("不是三角形");
	        }
	        
	        sc.close();
	    }
	}