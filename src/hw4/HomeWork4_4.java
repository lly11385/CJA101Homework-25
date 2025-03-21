package hw4;

import java.util.Scanner;

public class HomeWork4_4 {
	public static void main(String[] args) {
	        // 員工編號與現金資料 (二維陣列)
	        int[][] colleagues = {
	            {25, 2500}, // 員工編號25，現金2500
	            {32, 800},  // 員工編號32，現金800
	            {8, 500},   // 員工編號8，現金500
	            {19, 1000}, // 員工編號19，現金1000
	            {27, 1200}  // 員工編號27，現金1200
	        };

	        // 讓阿文輸入欲借的金額
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("請輸入欲借的金額: ");
	        int borrowAmount = scanner.nextInt();

	        // 找出有足夠現金的同事
	        int count = 0;
	        System.out.print("可以借錢的同事編號: ");
	        for (int i = 0; i < colleagues.length; i++) {
	            if (colleagues[i][1] >= borrowAmount) { // 如果現金足夠
	                System.out.print(colleagues[i][0] + " "); // 顯示員工編號
	                count++;
	            }
	        }

	        // 顯示總人數
	        if (count > 0) {
	            System.out.println();
	            System.out.println("總共可以借錢的同事數量: " + count);
	        } else {
	            System.out.println("沒有同事有足夠現金可以借給你。");
	        }

	        scanner.close();
	}
}
