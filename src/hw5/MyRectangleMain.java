package hw5;

public class MyRectangleMain {
	public static void main(String args[]){
		// 使用無參數建構子建立物件
		MyRectangle r1 = new MyRectangle();
        r1.setWidth(10);
        r1.setDepth(20);
        System.out.println(r1.getArea()); // 輸出面積

        // 使用帶參數建構子建立物件
        MyRectangle r2 = new MyRectangle(10, 20);
        System.out.println(r2.getArea()); // 輸出面積
	}
}
