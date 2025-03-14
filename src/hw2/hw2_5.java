package hw2;

//• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
//請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

public class hw2_5 {
    public static void main(String[] args) {
        int count = 0;
        // 循環從1到49
        for (int i = 1; i <= 49; i++) {
            // 檢查數字中是否包含4
            if (!String.valueOf(i).contains("4")) {
                System.out.print(i + " ");  // 輸出符合條件的數字
                count++;  // 符合條件的數字數量
            }
        }

        // 輸出符合條件的數字總數
        System.out.println("\n總共有 " + count + " 個數字");
    }
}
