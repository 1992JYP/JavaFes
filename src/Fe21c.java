import java.util.Scanner;

public class Fe21c {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		int count =0;
		System.out.println("N*N배열 생성기 N 입력하세요");
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