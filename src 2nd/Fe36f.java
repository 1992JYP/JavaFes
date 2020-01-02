
public class Fe36f {
//	
//	2차원 배열 다이아
//	쉬울줄 알았는데 개어려움 주의
	
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
		
//		o의 절대값이 증가할 때 감소하는 것, 가 증가하면 감소하는것,,, 
//		쓸 수 있는 변수 = num과 num의 가공물
//		ex o가4일때 범위는 1,2,3,4,5
//		o가 5일때 범위는 2,3,4
//		o가 6일때 범위는 3
//		
		
		
//		아무리 해도 회전수 설정이 힘들다 암기하는것도 좋을듯
		
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
