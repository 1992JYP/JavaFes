import java.util.Scanner;

public class Fe37f {
	public static void main(String[] args) {
		
		
//		37번
//		연속된 수 합
		
		
		
//		생각해봐 주윤아
//		15가 1,2,3,4,5 4,5,6 7,8 15로 4개인건 중요하지 않아
//		노가다야 노가다
//		1부터 다 더해봐
//		1에서 다 더해봐서 15가 나오면 멈추는거지
//		또 2에서 다더해서 15가 나오면 멈추고 15를 넘으면 while 탈출해
//		
//		이걸 하네 개쩔었다.
		
		
		Scanner scan = new Scanner(System.in);
		
		int num =0;
		int count =0;
		int sum=0;
		
		System.out.println("정수 써봐");
		num=scan.nextInt();
		
		
		
		for (int i=1;i<=num/2;i++) {
			sum=0;
			int j=0;
			j=i;
			while(sum<num) {
//				1부터 다 더해봐
				
				sum+=j;
				j++;
				if(sum==num) {
					count++;
				}
			}
			
		}
		
		count++;
		
		System.out.println(count);
		
		
		
		scan.close();
	}
}
