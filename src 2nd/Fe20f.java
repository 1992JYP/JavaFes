
public class Fe20f {

	//��� �ȹ���� �����ϱ� ����ڴ�..
//	�ݶ����� ���忡 ���ϸ�
//	¦���� 2�� ������ Ȧ���� (*3)(+1)�� �ݺ��ϸ� 1�� ������
	
	public static int collatz(int num) {

		int count = 0;
		if (num > 2) {
			if (num % 2 == 0) {

				count = count + collatz(num / 2);
			} else
				count = count + collatz(num * 3 + 1);
		}
		if (count == 500) {
			return -1;
		}

		return count + 1;

	}

	public static void main(String[] args) {

		System.out.println(collatz(9));
	}
}
