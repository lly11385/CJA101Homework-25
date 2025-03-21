package hw4;
//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天

import java.util.Scanner;

public class HomeWork4_5 {
	 public static void main(String[] args) {
	        // 創建 Scanner 物件，讓使用者輸入資料
	        Scanner scanner = new Scanner(System.in);
	        
	        // 輸入年份、月份和日期
	        System.out.print("請輸入年份 (yyyy): ");
	        int year = scanner.nextInt();
	        System.out.print("請輸入月份 (mm): ");
	        int month = scanner.nextInt();
	        System.out.print("請輸入日期 (dd): ");
	        int day = scanner.nextInt();

	        // 判斷是否為閏年
	        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	        
	        // 每月的天數（平年和閏年）
	        int[] daysInMonth = isLeapYear
	            ? new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 閏年
	            : new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 平年

	        // 計算該日期是該年的第幾天
	        int dayOfYear = 0;
	        for (int i = 0; i < month - 1; i++) {
	            dayOfYear += daysInMonth[i]; // 累加前幾個月的天數
	        }
	        dayOfYear += day; // 加上當月的天數

	        // 顯示結果
	        System.out.println("該日期是 " + year + " 年的第 " + dayOfYear + " 天");

	        // 關閉 scanner
	        scanner.close();
	    }
}
