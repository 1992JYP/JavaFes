
public class Fe22f {

//	�Ǻ���ġ
	public static int Fibo(int num) {

		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 2;
		} else {
			return Fibo(num - 1) + Fibo(num - 2);
		}
	}

	public static void main(String[] args) {

//		�Ǻ���ġ��

//		An-1+An-2=An

//		4�� 1,2,3,5
//		6�̸� 1,2,3,5,8,13
//		�ȹ������ �������� �������ҵ�
		int num = 4;

		System.out.println(Fibo(num));

	}
}
