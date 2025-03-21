package hw4;
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 

public class HomeWork4_3 {

    public static void main(String[] args) {
        // 八大行星字串陣列
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        
        // 記錄母音數量
        int vowelCount = 0;
        
        // 遍歷陣列並計算母音數量
        for (String planet : planets) {
            for (char ch : planet.toCharArray()) {
                if (isVowel(ch)) {
                    vowelCount++;
                }
            }
        }
        
        // 輸出結果
        System.out.println("八大行星名稱中的母音總數: " + vowelCount);
    }
    
    // 判斷是否為母音的方法
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(Character.toLowerCase(ch)) != -1;
    }
}