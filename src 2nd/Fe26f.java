import java.util.Arrays;
import java.util.Scanner;

public class Fe26f {

	public static void main(String[] args) {

//		�������� ��������
//		���� ���� : ù��° ���� �ι�°���� ������ ���� �� �ּҰ�(Ȥ�� �ִ밪)�� ��ġ�� Ȯ�� �� ��ü
//		
		Scanner scan = new Scanner(System.in);
		int[] list = new int[5];

		for (int i = 0; i < list.length; i++) {
			System.out.print(i + 1 + "��° �� �Է� : ");
			list[i] = scan.nextInt();
		}

		for (int i = 0; i < list.length-1; i++) {
			System.out.println(i + 1 + " step");
			int max = list[i];
			int ind = i;
			int temp=0;
			for (int s = i + 1; s < list.length; s++) {
				if (max > list[s]) {
					max = list[s];
					ind = s;
				}
			}

			temp = list[i];
			list[i] = list[ind];
			list[ind] = temp;
			System.out.println(Arrays.toString(list));
		}
		
		
		System.out.print("�������� ��� : ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
		
		scan.close();

	}

}
