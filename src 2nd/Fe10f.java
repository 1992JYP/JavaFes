import java.util.Scanner;

public class Fe10f {
	public static void main(String[] args) {
//		�ִ� �����, �ּҰ����
//		
		Scanner scan=new Scanner(System.in);
		
		int maxD=0;//�ִ�����
		int minT=0;//�ּҰ����
		
		int num1=0;//ù��° �Է�
		int num2=0;//�ι�° �Է�
		
		System.out.println("�ִ�����, �ּҰ���� ���ϱ�");
		System.out.print("���� 1 : ");
		num1=scan.nextInt();
		System.out.print("���� 3 : ");
		num2=scan.nextInt();
		
		int low=0;	//�Էµ� ���߿� ������
		int high=0;	//�Էµ� ���߿� ū��
		
		
		if(num1<num2) {
			low=num1;
			high=num2;
		}
		else {
			low=num2;
			high=num1;
		}
//		�ּҰ���� ã��
//		ū ���� ���� ���� �����µ�
//		���������� 1�������鼭 
//		�Ѵ� ���� �������� �ִ����� ���, break
		for(int i=low;i>0;i--) {
			if(low%i==0) {
				if(high%i==0) {
					maxD=i;
					break;
				}
			}
		}
		
		minT=num1*num2/maxD;
		
		System.out.println("�ִ����� : "+maxD+"�ּҰ���� : "+minT);
		
		
		scan.close();
	}
}
