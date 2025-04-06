package hw8;
//請寫一隻程式，能印出不重複的Train物件>用Set
//(練習各種取值寫法,如迭代器、for迴圈或foreach)
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HomeWork8_2_1 {
	public static void main(String[] args) {
		Set<Train> set = new HashSet<Train>();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		for(Train t : set) {
			System.out.println("車次：" + t.getNumber() + 
								"、車種：" + t.getType() + 
								"、出發站：" + t.getStart() + 
								"、目的地：" + t.getDest() + 
								"、票價：" + t.getPrice());
		}
		
		System.out.println("-------------------------");
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Train t = (Train)i.next();
			System.out.println("車次：" + t.getNumber() + 
					"、車種：" + t.getType() + 
					"、出發站：" + t.getStart() + 
					"、目的地：" + t.getDest() + 
					"、票價：" + t.getPrice());
		}
		

	}

}

class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number, String type, String start, String dest, double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getType() {
		return type;
	}
	
	public String getStart() {
		return start;
	}
	
	public String getDest() {
		return dest;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int compareTo(Train t) {
		if(this.number > t.number) {
			return -1;
		}else if(this.number == t.number){
			return 0;
		}
		return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	
}