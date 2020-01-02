import java.util.Random;

public class Fe35f {
	public static void main(String[] args) {
		
//		8*8 배열 최대값과 그것의 행,열 위치 
//		8*8 랜덤배열 받고 
//		받을때와 똑같이 for문 돌려서 
//		최대값과 최소값의 2차원배열 인덱스 2개를
//		받아서 그 값을 저장 후 출력
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
		System.out.println("최대값 : "+max);
		System.out.println("행 : "+(max_o+1)+"\t열 : "+(max_i+1));
		
		
		
	}
}
