import java.util.Scanner;

public class Fe21f {
	public static void main(String[] args) {

//		N*N�迭 1~N, N+1~2N ~ N^2 ������
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int count =0;
		System.out.println("N*N�迭 ������ N �Է��ϼ���");
		num = scan.nextInt();
		
		int[][] array= new int[num][num]; 
		
		
		for (int o=0;o<num;o++) {
			for (int i=0;i<num;i++) {
				array[o][i]=++count;
			}
		}
		
		for (int o=0;o<num;o++) {
			for (int i=0;i<num;i++) {
				System.out.print(array[o][i] + " ");
			}
			
			System.out.println();
		}
		
		scan.close();

	}
}