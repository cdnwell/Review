package day05;

public class ArrayRe01 {

	public static void main(String[] args) {
		int [][]arr=new int[3][4];
		
		System.out.println("1행 열의 수:"+arr[0].length);
		System.out.println("1행 열의 수:"+arr[1].length);
		System.out.println("1행 열의 수:"+arr[2].length);
		
		int [][]array=new int [][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		
		for(int i=0;i<3;i++) {
			System.out.println(i+"행");
			for(int j=0;j<4;j++) {
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
		
	}

}
