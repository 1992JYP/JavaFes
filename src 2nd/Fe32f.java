import java.util.Scanner;

public class Fe32f {
	public static void main(String[] args) {
		
//		������ ���� ���ϸ� �����
//		
//	32�� 124 ����
//		���� 3�� = 3����
//		3���� ���ϴ� ��� 
//		���� 3���� ������ ���� �������� 
//		�׳� 4�� 0�̶�� �����ؼ� Ǯ��		
//		�׷� 1���ڸ��� 0�� 4�� �ٵ�
//		����� 0�� ����
//		10�������� �� �ڸ��� ���ڴ� 9��(0����)
//		2���������� 1��(0����)
//		124������ �ٵ� ����� 3���� ���� 
//		�̶� 0��� 4�� ���� 3�� ���Ͱ� ���������̹Ƿ�
//		��ġ ���� ����Ҷ� 1�� ���� ���°� ó��
//		�������� 0�� ���� ������, �򿡼� 1�� ���ش�.
//		
		Scanner scan = new Scanner(System.in);
		int test=10;
		int n; // ������
		String test_s= "";
		
		System.out.println("10���� �Է�");
		test=scan.nextInt();
		
		while(test>0) {
			n=test%3;
			test=test/3;
			if(n==0) {
				n=4;
				test-=1;
			}
			test_s=n+test_s;
		}
		
		System.out.println(test_s);
		
		scan.close();
		
	}
}
