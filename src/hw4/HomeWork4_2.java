package hw4;
//請建立一個字串，經過程式執行後，輸入結果是反過來的。

public class HomeWork4_2 {
    public static void main(String[] args) {
        // 使用陣列反轉字串
        String s = "Hello World";
        char[] charArray = s.toCharArray(); //把字串變成字元
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(charArray);
        System.out.println("反轉後的字串: " + reversed);
    }
}
