
public class Fe28f {
	public static void main(String[] args) {
		
		
//		2차원 배열 90도 회전
//		i와 o의 위치판단이 중요

		int[][] array2 = new int[5][5];

		int num = 1;
		for (int o = 0; o < 5; o++) {
			for (int i = 0; i < 5; i++) {
				array2[o][i] = num;
				num++;
			}
		}
		System.out.println("원본 출력");

		for (int o = 0; o < 5; o++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array2[o][i] + " ");
			}
			System.out.println();
		}

		System.out.println("90도 회전 출력");

		for (int o = 4; o >= 0; o--) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array2[i][o] + " ");
			}
			System.out.println();
		}
	}
}
