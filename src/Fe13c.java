import java.util.Scanner;

public class Fe13c {
	public static void main(String[] args) {
		
//		n*n, 1������ ���ϳ��� �ѱ�鼭 ����
		
		Scanner scan = new Scanner(System.in);
		
		
		int arrN=0;
		int[][] array;
		System.out.print("N*N ��� ���, N = ");
		arrN=scan.nextInt();
		array=new int[arrN][arrN];
		int num = 1;
		
		for (int o = 0; o < arrN; o++) {
			for (int i = 0; i < arrN; i++) {
				array[o][i] = num;
				num++;
			}
		}
		System.out.println("��� ���");

		for (int o = 0; o < arrN; o++) {
			for (int i = 0; i < arrN; i++) {
				System.out.print(array[i][o] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
