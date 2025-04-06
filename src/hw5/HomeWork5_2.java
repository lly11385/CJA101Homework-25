package hw5;
//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，

public class HomeWork5_2 {

	public static void main(String[] args) {
		randAvg(); //呼叫randAvg方法
	}

	public static void randAvg() {
	    int sum = 0;
	    int count = 10; // 亂數個數題目說是10個
	    int[] numbers = new int[count];

	    // 產生10個亂數並計算總和
	    for (int i = 0; i < count; i++) {
	        numbers[i] = (int)(Math.random()*101); // 產生0到100之間的亂數 
	        sum += numbers[i]; // 累加總和
	        }

	    // 輸出10個亂數
	    System.out.print("這10個亂數為: ");
	    for (int i = 0; i < count; i++) {
	        System.out.print(numbers[i] + " ");
	        }

	    // 計算並輸出平均值
	    double average = sum / (double) count;
	    System.out.println("\n平均值為: " + average);
	    
	}
}
	

