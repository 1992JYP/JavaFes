import java.util.Scanner;

public class Fe37f {
	public static void main(String[] args) {
		
		
//		37��
//		���ӵ� �� ��
		
		
		
//		�����غ� ������
//		15�� 1,2,3,4,5 4,5,6 7,8 15�� 4���ΰ� �߿����� �ʾ�
//		�밡�پ� �밡��
//		1���� �� ���غ�
//		1���� �� ���غ��� 15�� ������ ���ߴ°���
//		�� 2���� �ٴ��ؼ� 15�� ������ ���߰� 15�� ������ while Ż����
//		
//		�̰� �ϳ� ��¿����.
		
		
		Scanner scan = new Scanner(System.in);
		
		int num =0;
		int count =0;
		int sum=0;
		
		System.out.println("���� ���");
		num=scan.nextInt();
		
		
		
		for (int i=1;i<=num/2;i++) {
			sum=0;
			int j=0;
			j=i;
			while(sum<num) {
//				1���� �� ���غ�
				
				sum+=j;
				j++;
				if(sum==num) {
					count++;
				}
			}
			
		}
		
		count++;
		
		System.out.println(count);
		
		
		
		scan.close();
	}
}
