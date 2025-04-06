package hw5;
//請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合
public class HomeWork5_5 {
    public static String genAuthCode() {
        // 定義可用的字符集，包含大小寫字母和數字
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder authCode = new StringBuilder(8);

        // 生成8位隨機驗證碼
        for (int i = 0; i < 8; i++) {
            // 使用 Math.random() 和 (int) 來生成隨機索引
            int index = (int)(Math.random() * chars.length());
            authCode.append(chars.charAt(index));//chars.charAt()根據指定的 index（索引位置）返回該位置的字符
        }

        return authCode.toString();
    }

    public static void main(String[] args) {
        System.out.println("本次隨機產生驗證碼為：" + genAuthCode());
    }
}