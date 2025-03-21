package hw4;
//班上有8位同學，他們進行了6次考試結果如下，請算出每位同學考最高分的次數

public class HomeWork4_6 {
    public static void main(String[] args) {
        // 每位同學的考試成績 (6次考試)
        int[][] scores = {
            {10, 37, 100, 77, 98, 90},  // 1號同學
            {35, 75, 70, 95, 70, 80},   // 2號同學
            {40, 77, 79, 70, 89, 100},  // 3號同學
            {100, 89, 90, 89, 90, 75},  // 4號同學
            {90, 64, 75, 60, 75, 50},   // 5號同學
            {85, 75, 70, 75, 90, 20},   // 6號同學
            {75, 70, 79, 85, 89, 99},   // 7號同學
            {70, 95, 90, 89, 90, 75}    // 8號同學
        };

        // 用來記錄每位同學最高分出現的次數
        int[] maxScoreCount = new int[8];

        // 迭代每場考試
        for (int j = 0; j < scores[0].length; j++) {
            int maxScore = Integer.MIN_VALUE; // 初始化最大分數
            int maxStudentIndex = -1; // 初始化為 -1，表示尚未找到最高分的學生

            // 找出當場考試的最高分和最高分的同學
            for (int i = 0; i < scores.length; i++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                    maxStudentIndex = i; // 記錄該場考試的最高分是誰
                } else if (scores[i][j] == maxScore) {
                    // 如果有同學分數相同，選擇仍然最先出現的同學
                    continue;
                }
            }

            // 記錄該同學在這場考試中的最高分次數
            if (maxStudentIndex != -1) {
                maxScoreCount[maxStudentIndex]++;
            }
        }

        // 輸出每位同學取得最高分的次數
        for (int i = 0; i < maxScoreCount.length; i++) {
            System.out.println((i + 1) + "號同學最高分的次數: " + maxScoreCount[i]);
        }
    }
}