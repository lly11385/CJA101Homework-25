package hw4;
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class HomeWork4_1 {
	public static void main(String[] args) {
		
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		//計算總和
		int sum =0;
		for(int i = 0; i < intArray.length; i++) {
			sum+=intArray[i];
		}
		// 計算平均值
        double average = (double) sum / intArray.length;
        System.out.println("平均值: " + average);
		
        //找出大於平均值的元素
        System.out.print("大於平均值的元素: ");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > average) {
                System.out.print(intArray[i] + " ");}
        }
	}
}
