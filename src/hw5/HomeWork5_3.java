package hw5;
//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳

public class HomeWork5_3 {
    public static void main(String[] args) {
        // 測試用二維陣列
        int[][] intArray = {
            {1, 6, 3},
            {9, 5, 2},
        };

        double[][] doubleArray = {
            {1.2, 3.5, 2.2},
            {7.4, 2.1, 8.2},
        };

        // 呼叫 maxElement 方法並顯示結果
        System.out.println("最大整數值: " + maxElement(intArray));      // 呼叫 int 型別的 maxElement
        System.out.println("最大浮點數值: " + maxElement(doubleArray)); // 呼叫 double 型別的 maxElement
    }

    // 方法重載：處理整數型別的二維陣列
    public static int maxElement(int[][] x) {
        int max = x[0][0]; // 假設最大值為陣列的第一個元素

        // 遍歷二維陣列，找出最大值
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > max) {
                    max = x[i][j];
                }
            }
        }
        return max;
    }

    // 方法重載：處理浮點數型別的二維陣列
    public static double maxElement(double[][] x) {
        double max = x[0][0]; // 假設最大值為陣列的第一個元素

        // 遍歷二維陣列，找出最大值
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > max) {
                    max = x[i][j];
                }
            }
        }
        return max;
    }
}