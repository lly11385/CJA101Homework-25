package hw3;
//亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息

import java.util.Scanner;

public class HomeWork3_2 {
	
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 10); // 產生 0~9 的隨機數字
        Scanner scanner = new Scanner(System.in);
        int guess;
        
        System.out.println("猜數字遊戲開始！請輸入 0 到 9 之間的數字：");
        
        while (true) {
            System.out.print("請輸入你的猜測: ");
            guess = scanner.nextInt();
            
            if (guess < 0 || guess > 9) {
                System.out.println("請輸入 0 到 9 之間的數字！");
            } else if (guess < targetNumber) {
                System.out.println("猜錯了！數字太小了，請再試一次。");
            } else if (guess > targetNumber) {
                System.out.println("猜錯了！數字太大了，請再試一次。");
            } else {
                System.out.println("恭喜你，猜對了！");
                break;
            }
        }
        
        scanner.close();
    }
}

