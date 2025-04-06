package hw5;

//父類別 Pen
abstract class Pen {
 private String brand;
 private double price;

 // 無參數建構子
 public Pen() {}

 // 帶參數建構子
 public Pen(String brand, double price) {
     this.brand = brand;
     this.price = price;
 }

 // 設定品牌
 public void setBrand(String brand) {
     this.brand = brand;
 }

 // 設定價格
 public void setPrice(double price) {
     this.price = price;
 }

 // 取得品牌
 public String getBrand() {
     return brand;
 }

 // 取得價格
 public double getPrice() {
     return price;
 }

 // 抽象方法
 public abstract void write();
}

//Pencil 類別，繼承自 Pen
class Pencil extends Pen {
 // Pencil 類別建構子
 public Pencil(String brand, double price) {
     super(brand, price);
 }

 // 實作 write 方法
 public void write() {
     System.out.println("削鉛筆再寫");
 }

 // 計算實際售價 (8折)
 @Override
 public double getPrice() {
     return super.getPrice() * 0.8;
 }
}

//InkBrush 類別，繼承自 Pen
class InkBrush extends Pen {
 // InkBrush 類別建構子
 public InkBrush(String brand, double price) {
     super(brand, price);
 }

 // 實作 write 方法
 public void write() {
     System.out.println("沾墨汁再寫");
 }

 // 計算實際售價 (9折)
 @Override
 public double getPrice() {
     return super.getPrice() * 0.9;
 }
}

