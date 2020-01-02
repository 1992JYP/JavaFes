import java.util.Scanner;

public class Fe23c {
	public static void main(String[] args) {

		
//		소인수분해
		
		Scanner scan = new Scanner(System.in);

		int num = 0;
		boolean isP = true;

		System.out.println("소인수 분해할 수를 입력하세요");
		num = scan.nextInt();

		int[] pnum = new int[num / 2];

		int pIndex = 0;
		for (int i = 2; i < num / 2; i++) {
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

///////////////소수 리스트 확인용/////////////////		
//		System.out.println("소수 리스트");
//		for (int i = 0; i < pnum.length; i++) {
//
//			System.out.print(" " + pnum[i]);
//		}
		int m = num;
		int[] ans = new int[num / 2];
		int ansI = 0;
		while (m > 1) {
			for (int i = 0; i < pnum.length && pnum[i] != 0 && m >= 1; i++) {
				if (m % pnum[i] == 0) {
					m = m / pnum[i];
					ans[ansI] = pnum[i];
					ansI = ansI + 1;
					break;
				}

			}
		}

		System.out.println("소인수 분해 결과");
		for (int i = 0; i <= ansI && ans[i] != 0; i++) {
			if(i!=0)
				System.out.print("*");
			System.out.print(ans[i]);

		}

		scan.close();

	}
}
