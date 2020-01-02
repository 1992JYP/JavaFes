import java.util.Scanner;

public class Fe13c {
	public static void main(String[] args) {
		
//		n*n, 1열부터 행하나씩 넘기면서 증가
		
		Scanner scan = new Scanner(System.in);
		
		
		int arrN=0;
		int[][] array;
		System.out.print("N*N 행렬 출력, N = ");
		arrN=scan.nextInt();
		array=new int[arrN][arrN];
		int num = 1;
		
		for (int o = 0; o < arrN; o++) {
			for (int i = 0; i < arrN; i++) {
				array[o][i] = num;
				num++;
			}
		}
		System.out.println("행렬 출력");

		for (int o = 0; o < arrN; o++) {
			for (int i = 0; i < arrN; i++) {
				System.out.print(array[i][o] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
