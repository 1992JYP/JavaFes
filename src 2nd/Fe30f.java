import java.util.Scanner;

public class Fe30f {
	public static void main(String[] args) {
		
//		digit����
//		���ں� digit���� �迭�� ����
//		while������ ���������� �������� ���� digit���� ���� ����
		
		Scanner scan = new Scanner(System.in);
		int[] digit = {6,2,5,5,4,5,6,3,7,6};
		
		int num=0;
		int count =0;
		System.out.println("ù�ڸ� 0�� ������ ���ڸ� �Է��ϼ���");
		
		num=scan.nextInt();
		
		while (num!=0) {
			for (int i=0;i<digit.length;i++) {
				if (num%10==i) {
					count=count+digit[i];
				}
			}
			num=num/10;
		}
		System.out.println("digit ���� : "+count);
		
		scan.close();
	}
}
