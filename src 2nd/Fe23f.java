import java.util.Scanner;

public class Fe23f {
	public static void main(String[] args) {

		
//		���μ�����
//		�ϴ� �ű���� �Ҽ��� ã�´�.????
//		�μ��� �Ҽ��� �ִ´�????
//		�ϴ� �μ��� ã�´�.
//		�μ��� ����Ʈ�� ��´�
//		�μ��� ��� ������ 1�̵ɶ����� while�� ������.
//		�μ��� ���ö����� �μ��� ����Ѵ�.
		Scanner scan = new Scanner(System.in);

		int num = 0;
		boolean isP = true;

		System.out.println("���μ� ������ ���� �Է��ϼ���");
		num = scan.nextInt();

		int[] pnum = new int[(num / 2)];

		int pIndex = 0;
		for (int i = 2; i < num / 2+1; i++) {
			isP = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isP = false;
				}
			}

			if (isP) {
				pnum[pIndex] = i;
				pIndex = pIndex + 1;
			}
		}

///////////////�Ҽ� ����Ʈ Ȯ�ο�/////////////////		
//		System.out.println("�Ҽ� ����Ʈ");
//		for (int i = 0; i < pnum.length; i++) {
//
//			System.out.print(" " + pnum[i]);
//		}
		int m = num;
		int[] ans = new int[num / 2];
		int ansI = 0;
		while (m > 1) {
			System.out.println("sss");
			for (int i = 0; i < pnum.length && pnum[i] != 0; i++) {
				if (m % pnum[i] == 0) {
					m = m / pnum[i];
					ans[ansI] = pnum[i];
					ansI = ansI + 1;
					System.out.println("break");
					break;
				}

			}
		}

		System.out.println("���μ� ���� ���");
		for (int i = 0; i <= ansI && ans[i] != 0; i++) {
			if(i!=0)
				System.out.print("*");
			System.out.print(ans[i]);

		}

		scan.close();

	}
}
