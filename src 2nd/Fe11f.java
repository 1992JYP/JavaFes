import java.util.Random;

public class Fe11f {
	public static void main(String[] args) {
//		8개 랜덤배열중 최대최소 뽑기
//		일단 8개짜리 배열 할당
//		8개 인수 랜덤으로 받기
//		8개를 for문 돌려서 최대 최소 뽑기
//		
		
		Random ran=new Random();
		
		int[] arr = new int[8];
		
		System.out.println("8개짜리 배열 랜덤뽑기");
		
		for (int i=0;i<8;i++) {
			arr[i]=ran.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		int min=100;	//최소값 담을 변수	
		int max=0;		//최대값 담을 변수
		
		for (int i=0;i<8;i++) {
			if(arr[i]<min) {	//최소값 찾기
				min=arr[i];
			}
			if(arr[i]>max) {	//최대값 찾기
				max=arr[i];
			}
		}
		
		System.out.println("최대값 : "+max+"  최소값 : "+min);
	}
}
