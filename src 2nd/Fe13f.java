import java.util.Scanner;

public class Fe13f {
	public static void main(String[] args) {
		
//		n*n, 1열부터 행하나씩 넘기면서 증가
//		바깥 인덱스를 o, 안쪽 인덱스를 i라고 하면
//		array[o][i]를 하면 행부터 적고 
//		array[i][o]를 하면 열부터 적음
		
		Scanner scan = new Scanner(System.in);
		
		
		int arrN=0;
		int[][] array;
		System.out.print("N*N 행렬 출력, N = ");
		arrN=scan.nextInt();
		array=new int[arrN][arrN];
		int num = 1;
//		[0][0]부터 [0][n-1]까지 먼저 씀
		for (int o = 0; o < arrN; o++) {
			for (int i = 0; i < arrN; i++) {
				array[o][i] = num;
				num++;
			}
		}
		System.out.println("행렬 출력");

//		[0][0]부터 [n-1][0]까지 먼저 출력함
		for (int o = 0; o < arrN; o++) {
			for (int i = 0; i < arrN; i++) {
				System.out.print(array[i][o] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
