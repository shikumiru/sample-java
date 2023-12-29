package sample;

public class Time {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		何かしらの処理
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間" + (end - start) + "でした");
	}

}
