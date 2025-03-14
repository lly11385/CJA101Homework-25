package hw1;

public class HomeWork1 {

	public static void main(String[] arg) {
//請設計一隻Java程式,計算12,6這兩個數值的和與積
		System.out.println(6*12);
			
//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		System.out.println(200/12+"打"+200%12+"顆");
	
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒?
		System.out.println(256559/86400+"天"+256559%86400/3600+"時"+256559%86400%3600/60+"分"+256559%86400%3600%60+"秒");

//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI =3.1415;
		System.out.println(5*5*PI+"、"+5*2*PI);

//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		System.out.println(1500000*Math.pow(1.02,10));
		
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因
		System.out.println(5+5);//計算5+5=10
		System.out.println(5+'5');//5和字符'5'表示數字53，加起來答案會是58
		System.out.println(5+"5");//5和字串"5"，分別顯示，所以是55
	}
}
