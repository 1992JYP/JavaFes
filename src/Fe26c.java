import java.util.Scanner;

public class Fe26c {

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

		for (int i = 0; i < list.length; i++) {
			
			for (int s =i+1; s<list.length; s++) {
				if(list[i]>list[s]) {
					list[i]=list[i]+list[s];
					list[s]=list[i]-list[s];
					list[i]=list[i]-list[s];
				}
			}
			
		}
		System.out.print("�������� ��� : ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
		
		scan.close();

	}

}
