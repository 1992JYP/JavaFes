import java.util.Random;

public class Fe35f {
	public static void main(String[] args) {
		
//		8*8 �迭 �ִ밪�� �װ��� ��,�� ��ġ 
//		8*8 �����迭 �ް� 
//		�������� �Ȱ��� for�� ������ 
//		�ִ밪�� �ּҰ��� 2�����迭 �ε��� 2����
//		�޾Ƽ� �� ���� ���� �� ���
		Random ran = new Random();
		
		int[][] array = new int[8][8];
		
		
		for (int o=0;o<8;o++) {
			for(int i=0;i<8;i++) {
				array[o][i]=ran.nextInt(99)+1;
			}
		}
		
		for (int o=0;o<8;o++) {
			for(int i=0;i<8;i++) {
				System.out.print(array[o][i]+" ");
			}
			System.out.println();
		}
		
		int max = 0;
		int max_o=-1;
		int max_i=-1;
		for (int o=0;o<8;o++) {
			for(int i=0;i<8;i++) {
				if(array[o][i]>max) {
					max=array[o][i];
					max_o=o;
					max_i=i;
				}
			}
		}
		
		System.out.println();
		System.out.println("�ִ밪 : "+max);
		System.out.println("�� : "+(max_o+1)+"\t�� : "+(max_i+1));
		
		
		
	}
}
