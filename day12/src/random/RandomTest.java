package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextDouble());	//0.0 ~ 0.99999... 범위에서 랜덤
		System.out.println(r.nextInt());	//int형 범위에서 랜덤
		System.out.println(r.nextInt(10));	//0-9까지 랜덤
		
		//방정식(최소값~최대값) : random
		//r.nextInt((최대값 +1 -최소값) + 최소값)
		//r.nextInt((최대값 -최소값 +1) + 최소값) 기억하기 더 좋다
		//36-97 구하기
		System.out.println();
		System.out.println(r.nextInt(62)+36);
	}

}
