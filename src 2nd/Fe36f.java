
public class Fe36f {
//	
//	2���� �迭 ���̾�
//	������ �˾Ҵµ� ������� ����
	
	public static void main(String[] args) {
		
		
		int num=9;
		int[][] arr = new int[num][num];
		
		for(int o=0;o<num;o++) {
			for (int i=0;i<num;i++) {
				arr[o][i]=0;
				System.out.print(arr[o][i]+" ");
			}
			System.out.println();
		}
		int count=1;
		int num2=num/2;
		
		for(int o=0;o<=num2;o++) {
			for (int i=num2-o;i<=num2+o;i++) {
				arr[i][o]=count++;
			}
			System.out.println();
		}
		
//		o�� ���밪�� ������ �� �����ϴ� ��, �� �����ϸ� �����ϴ°�,,, 
//		�� �� �ִ� ���� = num�� num�� ������
//		ex o��4�϶� ������ 1,2,3,4,5
//		o�� 5�϶� ������ 2,3,4
//		o�� 6�϶� ������ 3
//		
		
		
//		�ƹ��� �ص� ȸ���� ������ ����� �ϱ��ϴ°͵� ������
		
		for(int o=num2+1;o<num;o++) {
			for (int i=o-num2;i<num+num2-o;i++) {
				arr[i][o]=count++;
			}
			System.out.println();
		}
		
		
		
		for(int o=0;o<num;o++) {
			for (int i=0;i<num;i++) {
				System.out.print(arr[o][i]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
