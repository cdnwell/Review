package day05;

public class RaggedArrayRe {

	public static void main(String[] args) {
		int [][] arr= new int [3][];
		
		arr[0]=new int[4];
		arr[1] =new int[3];
		arr[2]=new int[] {1,2,3,4,5,6};
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println();
		arr[0]=new int[2];
		System.out.println(arr[0].length);
		
		System.out.println(arr.length);//행 갯수
		
	}

}
