
public class Fe28c {
	public static void main(String[] args) {
		
		
//		2���� �迭 90�� ȸ��

		int[][] array2 = new int[5][5];

		int num = 1;
		for (int o = 0; o < 5; o++) {
			for (int i = 0; i < 5; i++) {
				array2[o][i] = num;
				num++;
			}
		}
		System.out.println("���� ���");

		for (int o = 0; o < 5; o++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array2[o][i] + " ");
			}
			System.out.println();
		}

		System.out.println("90�� ȸ�� ���");

		for (int o = 4; o >= 0; o--) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array2[i][o] + " ");
			}
			System.out.println();
		}
	}
}
