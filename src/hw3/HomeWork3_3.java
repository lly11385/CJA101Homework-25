package hw3;
//請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數

import java.util.Scanner;

public class HomeWork3_3 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("請輸入你不想要的數字 (1~9): ");
        int Number = sc.nextInt();
        
        if (Number < 1 || Number > 9) {
            System.out.println("輸入錯誤，請輸入 1 到 9 之間的數字。");
        } else {
            System.out.println("顯示 1~49 之間，除了 " + Number + " 以外的數字：");
            int count = 0;
            
            for (int i = 1; i <= 49; i++) {
                if (i % 10 == Number || i / 10 == Number) {
                    continue;
                }
                System.out.print(i + " ");
                count++;
            }
            
            System.out.println("\n總數: " + count);
        }
        
        sc.close();
    }
}

