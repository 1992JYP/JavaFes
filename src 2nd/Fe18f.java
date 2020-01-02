import java.util.Scanner;

public class Fe18f {
//	대,소문자 우선 정렬, abc순 정렬 아스키코드상 오름차순 정렬
//	
	public static String sort(String str) {

		char[] presort = str.toCharArray();
		int[] intsort = new int[presort.length];

		for (int i = 0; i < str.length(); i++) {
			intsort[i] = (int) presort[i];
		}

		String sorted = "";

//		대소문자 선택정렬
		for (int i = 0; i < intsort.length - 1; i++) {
			int max = intsort[i];
			int ind = i;
			int temp = 0;

			for (int s = i + 1; s < intsort.length; s++) {
				if (max > intsort[s]) {
					max = intsort[s];
					ind = s;
				}
			}

			temp = intsort[i];
			intsort[i] = intsort[ind];
			intsort[ind] = temp;
		}

//		선택정렬 후 뒤에다가 순서대로 붙이기
		for (int i = 0; i < intsort.length; i++) {
			sorted = sorted + (char) intsort[i];

		}

		return sorted;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(sort("adxztAcZ"));

		scan.close();

	}
}
