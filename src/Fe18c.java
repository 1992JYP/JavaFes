import java.util.Scanner;

public class Fe18c {
//	��,�ҹ��� �켱 ����, abc�� ���� �ƽ�Ű�ڵ�� �������� ����
//	
	public static String sort(String str) {

		char[] presort = str.toCharArray();
		int[] intsort = new int[presort.length];
		
		for (int i = 0; i < str.length(); i++) {
			intsort[i] = (int)presort[i];
		}
		
		String sorted="";
		
		for (int i = 0; i < intsort.length; i++) {

			for (int s = i + 1; s < intsort.length; s++) {
				if (intsort[i] > intsort[s]) {
					intsort[i] = intsort[i] + intsort[s];
					intsort[s] = intsort[i] - intsort[s];
					intsort[i] = intsort[i] - intsort[s];
				}
			}
		}
		for (int i = 0; i < intsort.length; i++) {
			sorted = sorted+(char)intsort[i];
			
		}
		
		
		

		return sorted;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(sort("adxztAcZ"));


		scan.close();

	}
}
