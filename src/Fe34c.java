import java.util.Scanner;

public class Fe34c {
	public static void main(String[] args) {

//		 ����� ���� �ʿ�;
//		2��->10��
		Scanner scan = new Scanner(System.in);

		String num2 = "";
		String[] n_arr;
		int num10 = 0;
		
		System.out.println("2����->10���� ��ȯ");
		while (true) {
			System.out.print("2���� �Է� >>");
			num2 = scan.next();
			n_arr = num2.split("");
			
			for (int i = 0; i < n_arr.length; i++) {
				if (!((n_arr[i].equals("1")) || (n_arr[i].equals("0")))) {
					System.out.println("2������ ��Ȯ�� �Է��ϼ���");
					break;
				}
			}
			break;
		}
		// n�� ���� //num10= 10����

		for (int i = (n_arr.length - 1), n = 1; i >= 0; i--, n = n * 2) {
			if (n_arr[i].equals("1")) {
				num10 = num10 + n;
			}
		}

		System.out.println(num10 + "(10)");
		
		scan.close();

	}
}
