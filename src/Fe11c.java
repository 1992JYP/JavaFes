import java.util.Random;

public class Fe11c {
	public static void main(String[] args) {
//		8�� �����迭�� �ִ��ּ� �̱�
		
		
		Random ran=new Random();
		
		int[] arr = new int[8];
		
		System.out.println("8��¥�� �迭 �����̱�");
		
		for (int i=0;i<8;i++) {
			arr[i]=ran.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		int min=100;
		int max=0;
		
		for (int i=0;i<8;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("�ִ밪 : "+max+"  �ּҰ� : "+min);
	}
}
