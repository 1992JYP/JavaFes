
public class Fe19f {
//	�ϻ���
//	ex)126�� 1+2+6���� ���� �������Ƿ� �ϻ����̰� 
//	123�� 1+2+3���� ���� �������� �����Ƿ� �ϻ��尡 �ƴ�
	
//	�Ҹ��� �ϻ��� �޼ҵ�
//	while������ �־��� ���� 10���� ��� ������ �� ���´�.
//	�� ��� ������ 0�̵Ǵ� ���� while�� Ż��
	
	public static boolean isHashard(int num) {
		int h=num;
		int sum=0;
		
		while (h!=0){
			sum=sum+h%10;
			h=h/10;
		}
		if (sum==0) {
			System.out.println("0�� ���������� �ƴ�");
			return false;
		}
		if (num%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(isHashard(27));
		
	}
	
}
