package sample;

import java.util.Random;

public class Calc {
	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(10); int b = rand.nextInt(10);
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println(a + "と" + b + "足すと" + total + "、引くと" + delta);
	}

}
